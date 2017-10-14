package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultiselectDropdown {
	FirefoxDriver  driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	}
	@Test
	public void framesTest()
	{
		driver.switchTo().frame("iframeResult");
		WebElement drop=driver.findElement(By.name("cars"));
		Select myselect=new Select(drop);
		myselect.selectByVisibleText("Volvo");
		myselect.selectByVisibleText("Audi");
		Sleeper.sleepTightInSeconds(5);
		myselect.deselectAll();
	}

}
