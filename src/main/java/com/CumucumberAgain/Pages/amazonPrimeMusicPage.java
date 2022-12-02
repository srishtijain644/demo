package com.CumucumberAgain.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class amazonPrimeMusicPage {
	WebDriver driver;
	public amazonPrimeMusicPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(how = How.XPATH, using = "//i[@class='hm-icon nav-sprite']")
	public WebElement All;
	
	@FindBy(how = How.LINK_TEXT, using = "Amazon Prime Music")
	public WebElement primeMusic;
	
	@FindBy(how = How.XPATH, using = "(//a[@class='hmenu-item'][normalize-space()='Amazon Prime Music'])[3]")
	public WebElement AmazonPrimeMusic;
	
	
	public void clickAllTab() {
		All.click();
	}
	
	public void clickprimemusic() {
		primeMusic.click();
		AmazonPrimeMusic.click();
	}
	

}
