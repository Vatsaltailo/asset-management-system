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

public class GenerateExcelFixedAsset {
	
	public static ByteArrayInputStream usersToExcel(List<FixedAsset> users) throws IOException {
		String[] COLUMNs = { "Bill_Id", "Bill_NO","Bill_Issuer","Type","Quantity","Description","Date","Unit_Price" };
		try (Workbook workbook = new XSSFWorkbook(); ByteArrayOutputStream out = new ByteArrayOutputStream();) {
			Sheet sheet = workbook.createSheet("FixedAssets");
			
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
			for (FixedAsset user : users) {
				Row row = sheet.createRow(rowIdx++);

				row.createCell(0).setCellValue(user.getBillid());
				row.createCell(1).setCellValue(user.getBillno());
				row.createCell(2).setCellValue(user.getBillissuer());
				row.createCell(3).setCellValue(user.getType());
				row.createCell(4).setCellValue(user.getQuantity());
				row.createCell(5).setCellValue(user.getDescription());
				row.createCell(6).setCellValue(user.getDate());
				row.createCell(7).setCellValue(user.getUnitprice());
				
			}
			
			//Auto-size all the above columns
			sheet.autoSizeColumn(0);
			sheet.autoSizeColumn(1);
			sheet.autoSizeColumn(2);
			sheet.autoSizeColumn(3);
			sheet.autoSizeColumn(4);
			sheet.autoSizeColumn(5);
			sheet.autoSizeColumn(6);
			sheet.autoSizeColumn(7);
			
			workbook.write(out);
			return new ByteArrayInputStream(out.toByteArray());
		}
	}

}
