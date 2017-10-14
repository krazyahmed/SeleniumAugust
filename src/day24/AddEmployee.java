package day24;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class AddEmployee extends BaseClass{
	@Test
	public void addEmployee() throws IOException
	{
		FileInputStream file1=new FileInputStream(".\\src\\com\\intelliq\\dataengine\\Dataengine.xlsx");
		XSSFWorkbook wb1=new XSSFWorkbook(file1);
		XSSFSheet ws1=wb1.getSheet("Sheet2");
		
		String runMode=ws1.getRow(2).getCell(3).getStringCellValue();
		if(runMode.equals("N"))
		{
			ws1.getRow(2).createCell(4).setCellValue("Skipped");
			throw new SkipException("AddEmp test case skipped");
		}
		
		
		
		int rowCount=eo.getRowCount(testData, 0);
		boolean flag=true;
		for(int i=1;i<=rowCount;i++)
		{
			
			driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b")).click();
			driver.findElement(By.linkText("Add Employee")).click();
			driver.findElement(By.id("firstName")).sendKeys(eo.getCellData(testData,0,i, 0));
			driver.findElement(By.id("middleName")).sendKeys(eo.getCellData(testData,0,i, 1));
			driver.findElement(By.id("lastName")).sendKeys(eo.getCellData(testData,0,i, 2));
			driver.findElement(By.id("employeeId")).clear();
			driver.findElement(By.id("employeeId")).sendKeys(eo.getCellData(testData,0,i, 3));
			
			driver.findElement(By.id("btnSave")).click();
			String expmsg="Personal Details";
			String actmsg=driver.findElement(By.xpath("//*[@id='pdMainContainer']/div[1]/h1")).getText();
			if(expmsg.equals(actmsg))
				eo.writeCell(testData, 0, i,4,"Passed");
			else
			{
				eo.writeCell(testData, 0, i,4,"Failed");
				flag=false;
			
			
			
			
			
			
		}
		
		if(flag==false)
			eo.writeCell(dataEngine,1,2,4,"Failed");
		
		else
			eo.writeCell(dataEngine,1,2,4,"Passed");
		
		
		
		
		
	}
}

}
