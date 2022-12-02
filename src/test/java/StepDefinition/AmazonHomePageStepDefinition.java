package StepDefinition;



import org.testng.Assert;

import com.CumucumberAgain.Pages.AmazonHomePage;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonHomePageStepDefinition extends BaseTest{
	
	
	
	
	@Given("^User clicks on today deal$")
	public void user_clicks_on_today_deal() throws Throwable {
		
		
		AmazonHomePage home=new AmazonHomePage(driver);
		
		home.clickTodayDeal();
	    
	}

	@Then("^The result will be displayed$")
	public void the_result_will_be_displayed() throws Throwable {
	    Assert.assertEquals(driver.getTitle(), "Amazon.in - Today's Deals");
	    
	  
	}
	@Given("^User clicks on Search Box$")
	public void user_clicks_on_Search_Box() throws Throwable {
		
		AmazonHomePage home=new AmazonHomePage(driver);
		home.clicksearchbox();
	    
	}

	@When("^user enter \"([^\"]*)\"$")
	public void user_enter(String arg1) throws Throwable {
		AmazonHomePage home=new AmazonHomePage(driver);
	    home.enterItemName(arg1);
	}

	@Then("^Display the result$")
	public void display_the_result() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Amazon.in : yoga mat");
	
	}
	
	
	


}
