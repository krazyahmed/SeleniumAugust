package day12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathCreation1 {
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://fb.com");
		List<WebElement> myinput=driver.findElements
			(By.xpath("//input[@type='email' or @type='text' or @type='password']"));
		System.out.println(myinput.size());
		for(int i=0;i<myinput.size();i++)
		{
			if(myinput.get(i).isDisplayed())
				myinput.get(i).sendKeys("Selenium");
		}

	}

}
