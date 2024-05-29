package com.ShopperStack.GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class File_Utility {
	
	FileInputStream fis;     //Global variable
	
	public String readDataFromPropertyFile(String key) throws IOException {
		fis=new FileInputStream(FrameWorkConstants.propertyPath);
		Properties pro=new Properties();
		pro.load(fis);
		
		String value=pro.getProperty(key);
		return value;
	}
	

	
	public String readFromExcelFile(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
		fis=new FileInputStream(FrameWorkConstants.excelPath);
	    Workbook wb=WorkbookFactory.create(fis);
		String value=wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();    
		return value;
	}
}

