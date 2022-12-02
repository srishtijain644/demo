package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks extends BaseTest {
	public static String DriverBrowser, Select;
	@Before
	public static void initializeDriver() throws Throwable {

		DriverBrowser = prop.getProperty("driverName");
		Select = prop.getProperty("mode");

		// Code for Chrome Driver with or without Headless Mode

		if (DriverBrowser.equalsIgnoreCase("ChromeDriver")) 
		{
			System.out.println("I m here");
			System.setProperty(prop.getProperty("chromeDriverProperty"), prop.getProperty("chromeDriverPath"));
			if (Select.equalsIgnoreCase("Headless")) {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("window-size= 1920, 1080");
				options.addArguments("--headless");
				driver = new ChromeDriver(options);
				driver.manage().window().maximize();

				String n = prop.getProperty("implicitWait");
				driver.manage().timeouts().implicitlyWait(Long.parseLong(n), TimeUnit.SECONDS);
				//driver.get(prop.getProperty("AmazonUrl"));
				driver.get("https://www.amazon.in/");
				Thread.sleep(10000);
				
			} else {
				driver = new ChromeDriver();
			}
			
		}
		/*
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
		}*/

		
	}
	
	@After
	public static WebDriver testClose() {

		driver.close();
		return driver;
	}


}
