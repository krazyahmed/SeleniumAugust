package day24;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Logout extends BaseClass{
	@Test
	public void logoutTest() throws IOException
	{
		
		String runMode=eo.getCellData(dataEngine,1,4, 3);
		if(runMode.equals("N"))
		{
			eo.writeCell(dataEngine,1,4,4,"Skipped");
			throw new SkipException("Logout test case skipped");
		}
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		String expurl="http://opensource.demo.orangehrmlive.com/index.php/auth/login";
		String acturl=driver.getCurrentUrl();
		if(expurl.equals(acturl))
			eo.writeCell(dataEngine,1,4,4,"Passed");
		else
			eo.writeCell(dataEngine,1,4,4,"Failed");
		
		
			
	}

}
