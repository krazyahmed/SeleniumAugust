package day32.pagetestcases;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import day32.pageclasses.WelcomeMercuryTours;

public class POM_Login_TestCase {
	@Test
	public void loginTest()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		WelcomeMercuryTours wmPage=PageFactory.initElements
				         (driver, WelcomeMercuryTours.class);
		wmPage.findAFlight("Admin","admin");
	}

}
