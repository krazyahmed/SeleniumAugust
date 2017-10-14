package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DatadrivenTestinginCucumber {
	FirefoxDriver driver;
	@Given("^we launch the browser navigate to url$")
	public void we_launch_the_browser_navigate_to_url() throws Throwable {
		driver=new FirefoxDriver();
		   driver.get("http://opensource.demo.orangehrmlive.com/");
	}

	@When("^we enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void we_enter_the_and(String arg1, String arg2) throws Throwable {
	    driver.findElement(By.id("txtUsername")).sendKeys(arg1);
	    driver.findElement(By.id("txtPassword")).sendKeys(arg2);
	}

	@When("^also click on login button$")
	public void also_click_on_login_button() throws Throwable {
	    driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^it should display \"([^\"]*)\" msg$")
	public void it_should_display_msg(String arg1) throws Throwable {
	    String expmsg=arg1;
	    String actmsg=null;
	    if(expmsg.equals("Invalid credentials"))
	    	actmsg=driver.findElement(By.id("spanMessage")).getText();
	    else
	    	actmsg=driver.findElement(By.id("welcome")).getText();
	    Assert.assertEquals(actmsg, expmsg);
	}



}
