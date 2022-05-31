package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	public static Properties properties; //this class will help us read data from .properties  files
	public static Logger logger;//this class will help us log each step
	private String configPath=".\\src\\test\\resources\\input\\config.properties";//path to config path
	private String log4jPath=".\\src\\test\\resources\\input\\log4j.properties";//path to logger
	
	// we create a constructor to initialize our vars
	//from the config.proeprties and log4jproperties files

	public Base()  {
		//we create object if BufferedReader class to read the values form the config files
		try {
			BufferedReader reader = new BufferedReader(new FileReader(configPath));
			properties = new Properties();// we create object of the Properties class
			properties.load(reader);// we call the .load method and pass reader as argument
			reader.close();//we close the reader so the input stream should be closed
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		logger = logger.getLogger(log4jPath);
		//below line will config the property of log4j files 
		PropertyConfigurator.configure(log4jPath);
	}
	//this method will return the value of the url from config.properties file
	public static String getUrl() {
		String url = properties.getProperty("url");
		return url;
	}
	public static String getBrowser() {
	String browser= properties.getProperty("browser");
	return browser;
	}
	//this will launch the browser
	public static void launchBrowser() {
		driver.get(getUrl());
		
	}
	//this will close last and all tabs and browsers
	
	public static void tearDown() {
		driver.close();
		driver.quit();
	}
	
	//this will select our browser
	public void selectBrowser() {
	switch(getBrowser()) {
	
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		break;
	case "ff"	:
		WebDriverManager.firefoxdriver().setup();
		driver = new  FirefoxDriver();
		break;
	case "edge" :
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		break;
	case "opera" :
		WebDriverManager.operadriver().setup();
		driver = new OperaDriver();
		break;
	default : 	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		break;
	}	
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
}
