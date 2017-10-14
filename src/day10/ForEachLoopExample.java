package day10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ForEachLoopExample {

	public static void main(String[] args) {
		String[] str={"one","two","three","four","five"};
		for (String s : str) {
			System.out.println(s);
		}
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		List<WebElement> links=driver.findElements
				                         (By.tagName("a"));
		for (WebElement l : links) {
			System.out.println(l.getText());
		}

	}

}
