package StepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class BaseTest {
	public static WebDriver driver;
	public static File file;
	public static FileInputStream fis;
	public static Properties prop;
	//public static String DriverBrowser, Select;
	
	
	static {
		file = new File("./Resources/config.properties");
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	/*
	
	@BeforeMethod
	
	public static WebDriver initializeDriver() {

		DriverBrowser = prop.getProperty("driverName");
		Select = prop.getProperty("mode");

		// Code for Chrome Driver with or without Headless Mode

		if (DriverBrowser.equalsIgnoreCase("ChromeDriver")) {
			System.setProperty(prop.getProperty("chromeDriverProperty"), prop.getProperty("chromeDriverPath"));
			if (Select.equalsIgnoreCase("Headless")) {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("window-size= 1920, 1080");
				options.addArguments("--headless");
				driver = new ChromeDriver(options);
			} else {
				driver = new ChromeDriver();
			}
		}
		// Code for FireFox Driver without Headless Mode
		if (DriverBrowser.equalsIgnoreCase("FireFoxDriver")) {
			System.setProperty(prop.getProperty("firefoxDriverProperty"), prop.getProperty("firefoxDriverPath"));

			driver = new FirefoxDriver();
		}
		// MicrosoftEdge Does not Support Headless Mode
		if (DriverBrowser.equalsIgnoreCase("MicrosoftEdge")) {
			System.setProperty(prop.getProperty("microsoftEdgeDriverProperty"),
					prop.getProperty("microsoftEdgeDriverPath"));
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();

		String n = prop.getProperty("implicitWait");
		driver.manage().timeouts().implicitlyWait(Long.parseLong(n), TimeUnit.SECONDS);
		
		return driver;
	}
	@BeforeMethod
	public static WebDriver startURL() {
		driver.get(prop.getProperty("AmazonUrl"));
		return driver;
	}
	@AfterMethod
	public static WebDriver testClose() {

		driver.close();
		return driver;
	}*/

}
