package day24;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.intelliq.utility.ExcelOperations;

public class BaseClass {
	static FirefoxDriver driver=null;
	ExcelOperations eo=new ExcelOperations();
	String testData=".\\src\\com\\intelliq\\excelfiles\\TestData2.xlsx";
	String dataEngine=".\\src\\com\\intelliq\\dataengine\\Dataengine.xlsx";
	String results=".\\src\\com\\intelliq\\resultexcel\\Results.xlsx";
}
