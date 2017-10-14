package day32.pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercuryTours {
	
	@FindBy(name="userName")
	WebElement userName;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="login")
	WebElement signin;
	public void findAFlight(String u,String p)
	{
		userName.sendKeys(u);
		password.sendKeys(p);
		signin.click();
	}
	
	@FindBy(linkText="your destination")
	WebElement yourDestination;
	public void destinations()
	{
		yourDestination.click();
	}
	
	@FindBy(linkText="featured vacation destinations")
	WebElement f_v_Destinations;
	public void vacations()
	{
		f_v_Destinations.click();
	}
	@FindBy(linkText="Register here")
    WebElement  registerHere;
	public void register()
	{
		registerHere.click();
	}
	
	
	
	
	
	
	
	
	
}
