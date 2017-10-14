package day20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\gandh\\Desktop\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row r=ws.getRow(0);
		r.getCell(1).setCellValue("Abc");
		
		r=ws.getRow(1);
		r.createCell(3).setCellValue("Def");
		
		r=ws.createRow(3);
		r.createCell(0).setCellValue("Ghi");
		
		
		FileOutputStream f=new FileOutputStream("C:\\Users\\gandh\\Desktop\\Book1.xlsx");
		wb.write(f);
		wb.close();
		

	}

}
