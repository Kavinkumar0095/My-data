package com.DataDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;

public class DataDriverReadData {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Kavin\\eclipse-mine\\DataDriven\\DataDriven.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new HSSFWorkbook(fis);
		
		Cell cell = wb.getSheetAt(0).getRow(1).getCell(0);
		
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(cellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println("stringCellValue");
			
		}
		
		else if (cellType.equals(cellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			
			int value = (int) numericCellValue;
			System.out.println(value);
		}
	}
	
	

}
