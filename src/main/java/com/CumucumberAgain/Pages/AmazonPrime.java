package com.CumucumberAgain.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AmazonPrime {
	WebDriver driver;
	public AmazonPrime(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	@FindBy(how = How.LINK_TEXT, using="//span[normalize-space()='Prime']")
	public WebElement prime;
	
	@FindBy(how = How.LINK_TEXT, using="//a[normalize-space()='Visit primevideo.com']")
	public WebElement primevideo;
	
	public void clickPrime() {
		prime.click();
	}
	public void clickPrimeVideo() {
		primevideo.click();
	}

}
