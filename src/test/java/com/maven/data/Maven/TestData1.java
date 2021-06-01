package com.maven.data.Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData1 {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Maven\\target\\Data.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);

		for (int i = 0; i < sheetAt.getPhysicalNumberOfRows(); i++) {
			Row row = sheetAt.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				
				Cell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();
				
				if (cellType.equals(cellType.STRING)) {
					System.out.println(cell.getStringCellValue());
					
				}else {
					double numericCellValue = cell.getNumericCellValue();
					System.out.println(String.valueOf(numericCellValue));
				}
				
			}

		}
		
		Sheet createsheet = wb.createSheet("My data");
		Row createRow = createsheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("SAIKRISHNA");
		Row createRow1 = createsheet.createRow(1);
		Cell createCell2 = createRow.createCell(1);
		createCell2.setCellValue("NELLORE");
		FileOutputStream fio = new FileOutputStream(file);
		wb.write(fio);
		wb.close();
		System.out.println("Task Completed");

	}

}
