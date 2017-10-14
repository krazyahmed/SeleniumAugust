package day13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWaitExample {


	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://hotstar.com");
		//implicitwait declaration
		driver.manage().timeouts().implicitlyWait
		                               (30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='myCarouselId']/div/article[2]/div[1]/div/div[1]/div")).click();
	}

}
