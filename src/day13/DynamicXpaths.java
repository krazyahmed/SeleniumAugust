package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class DynamicXpaths {

	
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://yahoo.com");
		driver.findElement(By.id("uh-search-box")).sendKeys("Selenium");
		driver.findElement(By.id("uh-search-button")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.xpath("//*[contains(@id,'3')]/div/div[1]/h3/a")).click();
		
		
		
		
		
		
		

	}

}
