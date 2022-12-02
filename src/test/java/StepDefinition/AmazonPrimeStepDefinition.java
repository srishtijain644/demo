package StepDefinition;


import org.testng.Assert;

import com.CumucumberAgain.Pages.AmazonPrime;
import com.CumucumberAgain.Pages.amazonPrimeMusicPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonPrimeStepDefinition extends BaseTest{
	AmazonPrime amazon=new AmazonPrime(driver);
	amazonPrimeMusicPage primemusic= new amazonPrimeMusicPage(driver);
	
	
	@Given("^user launches the browser$")
	public void user_launches_the_browser() throws Throwable {
		
		
	}

	@Given("^clicks on prime tab$")
	public void clicks_on_prime_tab() throws Throwable {
		amazon.clickPrime();
	}

	@When("^clicks on amazon prime video tab$")
	public void clicks_on_amazon_prime_video_tab() throws Throwable {
		amazon.clickPrimeVideo();
	}

	@Then("^page will be displayed$")
	public void page_will_be_displayed() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Welcome to Prime Video");
		
	}
	
	@Given("^launche browser$")
	public void launche_browser() throws Throwable {
		
	}

	@Given("^clicks on all tab$")
	public void clicks_on_all_tab() throws Throwable {
	    primemusic.clickAllTab();
	}

	@When("^clicks on amazon prime music$")
	public void clicks_on_amazon_prime_music() throws Throwable {
	    primemusic.clickprimemusic();
	}

	@Then("^new page display$")
	public void new_page_display() throws Throwable {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.in/music/prime?ref_=nav_em_dmm_in_nav_pc_apm_mlp_0_2_7_2");
		
		
	}




	

}
