package day24;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class DeleteEmployee  extends BaseClass{
	@Test
	public void delEmpTest() throws IOException
	{
		String runMode=eo.getCellData(dataEngine,1,3, 3);
		if(runMode.equals("N"))
		{
			eo.writeCell(dataEngine,1,3,4,"Skipped");
			
			throw new SkipException("DeleteEmp test case skipped");
		}
		int rowCount=eo.getRowCount(testData,1);
		driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		WebElement table=driver.findElement(By.id("resultTable"));
		boolean flag=true;
		for(int i=1;i<=rowCount;i++)
		{
			 
			String empid=eo.getCellData(testData,1, i,0);
			List<WebElement> rows=table.findElements(By.tagName("tr"));
			for(int j=0;j<rows.size();j++)
			{
				List<WebElement> cols=rows.get(j).findElements(By.tagName("td"));
				for(int k=0;k<cols.size();k++)
				{
					if(cols.get(k).getText().equals(empid))
					{
						cols.get(k-1).findElement(By.tagName("input")).click();
					}
					
				}
			}
			
		}
		driver.findElement(By.id("btnDelete")).click();
		driver.findElement(By.id("dialogDeleteBtn")).click();
		String actmsg=driver.findElement(By.xpath("//*[@id='frmList_ohrmListComponent']/div[2]")).getText();
		System.out.println(actmsg);
		String expmsg="Successfully Deleted";
		if(actmsg.contains(expmsg))
		{
			for(int i=1;i<=rowCount;i++)
				eo.writeCell(testData,1,i,1 ,"Passed");
			
		}
		else
		{
			for(int i=1;i<=rowCount;i++)
			{
				eo.writeCell(testData,1,i,1 ,"Failed");
			}
		}

		FileInputStream file1=new FileInputStream(".\\src\\com\\intelliq\\dataengine\\Dataengine.xlsx");
		XSSFWorkbook wb1=new XSSFWorkbook(file1);
		XSSFSheet ws1=wb1.getSheet("Sheet2");
		if(flag==false)
		{
			
			ws1.getRow(3).createCell(4).setCellValue("Failed");
		}
		else
		{
			ws1.getRow(3).createCell(4).setCellValue("Passed");
		}
		FileOutputStream f1=new FileOutputStream(".\\src\\com\\intelliq\\dataengine\\Dataengine.xlsx");
		wb1.write(f1);
	}
	

}
