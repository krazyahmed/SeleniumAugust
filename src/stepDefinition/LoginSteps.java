package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	FirefoxDriver driver;
	@Given("^the browser is launched and we navigate to url$")
	public void the_browser_is_launched_and_we_navigate_to_url() throws Throwable {
	   driver=new FirefoxDriver();
	   driver.get("http://opensource.demo.orangehrmlive.com/");
	}

	@When("^we enter username and password$")
	public void we_enter_username_and_password() throws Throwable {
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin");
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
	   driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^it should display Welcome Admin msg$")
	public void it_should_display_Welcome_Admin_msg() throws Throwable {
	    String expmsg="Welcome Admin";
	    String actmsg=driver.findElement(By.id("welcome")).getText();
	    Assert.assertEquals(actmsg, expmsg);
	}



}
