package day15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExplicitWait_FluentWait {
	FirefoxDriver  driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://hotstar.com");
	}
	@Test
	public void waitTest()
	{
		FluentWait<WebDriver> fwait=new FluentWait<WebDriver>(driver)
				                        .withTimeout(50,TimeUnit.SECONDS)
				                        .pollingEvery(2,TimeUnit.SECONDS)
				                        .ignoring(NoSuchElementException.class);
		
		fwait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='myCarouselId']/div/article[1]/div[1]/div/div[1]/div")));
		fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myCarouselId']/div/article[2]/div[1]/div/div[1]/div"))).click();
	}
	@AfterTest
	public void teardown()
	{
		//driver.quit();
	}

}
