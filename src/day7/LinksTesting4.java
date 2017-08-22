package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTesting4 {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://pvrcinemas.com");
		WebElement general=driver.findElement(By.xpath("html/body/div[10]/div[1]/div[2]"));
		List<WebElement> links=general.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			links.get(i).click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			general=driver.findElement(By.xpath("html/body/div[10]/div[1]/div[2]"));
			links=general.findElements(By.tagName("a"));
		}
		driver.close();
	}

}
