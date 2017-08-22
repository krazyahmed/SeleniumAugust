package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTesting4 {

	
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://ebay.in");
		WebElement drop=driver.findElement(By.id("gh-cat"));
		Select myselect=new Select(drop);
		//myselect.selectByIndex(2);
		//myselect.selectByValue("267");
		myselect.selectByVisibleText("Charity");
		
	}

}
