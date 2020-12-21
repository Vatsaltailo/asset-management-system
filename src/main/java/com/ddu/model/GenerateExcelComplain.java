package com.ddu.model;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;

import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GenerateExcelComplain {

	public static ByteArrayInputStream usersToExcel(List<Complain> users) throws IOException {
		String[] COLUMNs = { "Complain_ID", "Date","Description","Machine_ID","Location" };
		try (Workbook workbook = new XSSFWorkbook(); ByteArrayOutputStream out = new ByteArrayOutputStream();) {
			Sheet sheet = workbook.createSheet("Complains");
			
			Font headerFont = workbook.createFont();
			headerFont.setBold(true);
			headerFont.setColor(IndexedColors.BLUE.getIndex());

			CellStyle headerCellStyle = workbook.createCellStyle();
			headerCellStyle.setFont(headerFont);

			// Header Row
			Row headerRow = sheet.createRow(0);

			// Table Header
			for (int col = 0; col < COLUMNs.length; col++) {
				Cell cell = headerRow.createCell(col);
				cell.setCellValue(COLUMNs[col]);
				cell.setCellStyle(headerCellStyle);
			}

			int rowIdx = 1;
			for (Complain user : users) {
				Row row = sheet.createRow(rowIdx++);

				row.createCell(0).setCellValue(user.getComplainid());
				row.createCell(1).setCellValue(user.getDate());
				row.createCell(2).setCellValue(user.getDescription());
				row.createCell(3).setCellValue(user.getMachineid());
				row.createCell(4).setCellValue(user.getLocation());
				
			}
			
			//Auto-size all the above columns
			sheet.autoSizeColumn(0);
			sheet.autoSizeColumn(1);
			sheet.autoSizeColumn(2);
			sheet.autoSizeColumn(3);
			sheet.autoSizeColumn(4);
			
			
			workbook.write(out);
			return new ByteArrayInputStream(out.toByteArray());
		}
	}
	
	
}
