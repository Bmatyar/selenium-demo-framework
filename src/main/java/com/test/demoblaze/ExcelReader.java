package com.test.demoblaze;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.blaze.pojo.UserInfo;

public class ExcelReader {
	
	public void getUserInfoData() throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\ExcelData\\Book1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		ArrayList<UserInfo> userList = new ArrayList<>();
		

		XSSFRow row = sheet.getRow(4);
		XSSFCell cel = row.getCell(2);
		System.out.println(cel);

		System.out.println("*****Print All records*****");
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
		for (int r = 1; r <= rows; r++)
		{
			UserInfo info = new UserInfo();

			XSSFRow rowt = sheet.getRow(r);
			for (int c = 0; c < cols; c++)
			{
				XSSFCell cell = rowt.getCell(c);
				if ( c == 0) {
					info.setName(cell.getStringCellValue());
				}else {
					if ( c == 1) {
						info.setAdd(cell.getStringCellValue());
					}
					else {
						if ( c == 2) {
							info.setLocation(cell.getStringCellValue());
						}
						else {
							info.setGender(cell.getStringCellValue());
						}
					}
				}
				//System.out.print("object = ");
				//System.out.print(" - ");
			}
			userList.add(info);
			System.out.println("object = "+info);
		}

		//return userList;

	}
	
	public Object[][] getUserInfoDataAsObjectArray() throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\ExcelData\\Book1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
			
		// How to get number of rows from given excel sheet 
				// How to get the number of cols from sheet

		int numOfRows = sheet.getLastRowNum();
		int numOfCols = sheet.getRow(1).getLastCellNum();
		Object[][] testData = new Object[numOfRows][numOfCols];	
		
		
		XSSFRow row = sheet.getRow(4);
		XSSFCell cel = row.getCell(2);
		System.out.println(cel);

		System.out.println("*****Print All records*****");
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
		for (int r = 1; r <= rows; r++)
		{
			UserInfo info = new UserInfo();

			XSSFRow rowt = sheet.getRow(r);
			for (int c = 0; c < cols; c++)
			{
				XSSFCell cell = rowt.getCell(c);
				testData[r][c] = cell.getStringCellValue();
			}
			System.out.println("object = "+info);
		}

		return testData;

	}
}
