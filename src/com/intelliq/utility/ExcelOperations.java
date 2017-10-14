package com.intelliq.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations {

	public int getRowCount(String path,int sheetno) throws IOException
	{
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheetAt(sheetno);
		int rowCount=ws.getLastRowNum();
		return rowCount;
		
	}
	
	public String getCellData(String path,int sheetno,int rowno,int colno) throws IOException
	{
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheetAt(sheetno);
		String cellData=ws.getRow(rowno).getCell(colno).getStringCellValue();
		return cellData;
	}
	
	public void writeCell(String path,int sheetno,int rowno,int colno,String data) throws IOException
	{
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheetAt(sheetno);
		ws.getRow(rowno).createCell(colno).setCellValue(data);
		FileOutputStream f=new FileOutputStream(path);
		wb.write(f);
		wb.close();
	}
	
	
}
