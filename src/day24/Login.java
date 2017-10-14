package day24;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Login extends BaseClass{
	@Test
	public void logintest() throws IOException
	{
		
		String runMode=eo.getCellData(dataEngine,1, 1,3);
		if(runMode.equals("N"))
		{
			eo.writeCell(dataEngine,1,1,3,"Skipped");
			throw new SkipException("Login test case skipped");
		}
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		String expmsg="Welcome Admin";
		String actmsg=driver.findElement(By.id("welcome")).getText();
		Assert.assertEquals(actmsg, expmsg);
		
		eo.writeCell(dataEngine,1, 1,4,"Passed");
	}

}
