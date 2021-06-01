package com.maven.data.Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData2 {

	public static void main(String[] args) throws IOException, Exception  {
		String path = "C:\\Users\\NELLORE SAIKRISHNA\\eclipse-workspace\\Maven\\target\\Data.xlsx";
		File file = new File(path);
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

				} else {
					System.out.println(cell.getNumericCellValue());
				}

			}

		}

		
		Sheet createSheet = wb.createSheet("Sai data");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Nellore");
		Row createRow1 = createSheet.createRow(1);
		Cell createCell1 = createRow.createCell(1);
		createCell1.setCellValue("Nellore");
		Row createRow2 = createSheet.createRow(2);
		Cell createCell2 = createRow.createCell(2);
		createCell2.setCellValue("Hemanth");
		Row createRow3 = createSheet.createRow(3);
		Cell createCell3 = createRow.createCell(3);
		createCell3.setCellValue("Nellore");
		Row createRow4 = createSheet.createRow(4);
		Cell createCell4 = createRow.createCell(4);
		createCell4.setCellValue("Srinivasulu");
		Row createRow5 = createSheet.createRow(5);
		Cell createCell5 = createRow.createCell(5);
		createCell5.setCellValue("Nellore");
		Row createRow6 = createSheet.createRow(6);
		Cell createCell6 = createRow.createCell(6);
		createCell6.setCellValue("Geetha");
		FileOutputStream fio = new FileOutputStream(file);
		wb.write(fio);
		wb.close();
		System.out.println("Task Completed");
	

	}

}
