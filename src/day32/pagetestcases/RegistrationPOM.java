package day32.pagetestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import day32.pageclasses.Menu;
import day32.pageclasses.RegisterMercuryTours;
import day32.pageclasses.WelcomeMercuryTours;

public class RegistrationPOM {
	@Test
	public void registration()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		WelcomeMercuryTours wmPage=PageFactory.initElements(driver,WelcomeMercuryTours.class);
		Menu menuPage=PageFactory.initElements(driver,Menu.class);
		RegisterMercuryTours rmPage=PageFactory.initElements(driver,RegisterMercuryTours.class);
		
		wmPage.register();
		rmPage.contactInformation();
		
		menuPage.home();
		wmPage.findAFlight("tutorial","tutorial");
		
		
		
	}

}
