package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicCSSSelectors {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("input[id^='txtUser']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[id$='Password']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[id*='nLog']")).click();
	}

}
