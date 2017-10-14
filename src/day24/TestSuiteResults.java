package day24;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class TestSuiteResults extends BaseClass{
	@Test
	public void testresults() throws IOException
	{
		int rowCount=eo.getRowCount(dataEngine,1);
		boolean flag=true;
		for(int i=1;i<=rowCount;i++)
		{
			String result=eo.getCellData(dataEngine, 1,i, 4);
			if(result.equals("Failed"))
				flag=false;
		}
		if(flag==false)
			eo.writeCell(dataEngine,0,1,2,"Failed");
		else
			eo.writeCell(dataEngine,0,1,2,"Passed");
		
		
	}

}
