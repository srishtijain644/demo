package com.CumucumberAgain.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
	WebDriver driver;
	public AmazonHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(how = How.LINK_TEXT, using="Today's Deals")
	public WebElement todayDeal;
	
	@FindBy(how = How.ID, using = "twotabsearchtextbox")
	public WebElement searchbox;
	
	
	public void clickTodayDeal() {
		todayDeal.click();
	}
	
	public void clicksearchbox() {
		searchbox.click();
	}
	
	public void enterItemName(String item) {
		searchbox.sendKeys(item);
		searchbox.submit();
	}
	

}
