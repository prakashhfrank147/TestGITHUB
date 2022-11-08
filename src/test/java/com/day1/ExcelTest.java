package com.day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.WorkbookDocument;

public class ExcelTest {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\User\\Desktop\\framework\\mavenTest1.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("sheet1");
		int i = sheet.getPhysicalNumberOfRows();
//		Row row = sheet.getRow(1);
//		Cell cell = row.getCell(6);
		
		
//		double numericCellValue = cell.getNumericCellValue();
//		BigDecimal b = BigDecimal.valueOf(numericCellValue);
//		String string = b.toString();
//		System.out.println(string);
//		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
//			Cell cell2 = row.getCell(j);
//			System.out.println(cell2);
//			
//		}
		for (int i1 = 0; i1 < sheet.getPhysicalNumberOfRows(); i1++) {
			Row row = sheet.getRow(i1);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
//				System.out.println(cell);
//				System.out.println("---------");
				CellType cellTypee = cell.getCellType();
				switch(cellTypee) {
				case STRING :
					String string = cell.getStringCellValue();
					System.out.println(string);
					break;
				case NUMERIC:
				double num = cell.getNumericCellValue();
				BigDecimal b = BigDecimal.valueOf(num);
				String n = b.toString();
				System.out.println(n);
				break;
				default:
					break;
				
				}
				
				
				
			}
	
		}
	
		
		
	}

}
