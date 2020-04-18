package com.nt.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import com.nt.dto.studentDTO;

public class excelViewStudent extends AbstractXlsView {

	@Override
	protected void buildExcelDocument(Map<String, Object> map, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<studentDTO> listDTO=null;
		Sheet sheet=null;
		Row row=null;
		int i=0;
	
		//Read Model Attributes
		listDTO=(List<studentDTO>) map.get("listDTO");
		//create WorkSheet
		sheet=workbook.createSheet("Students Report");
		//add rows with cells having DTO class objects data in cells
		for(studentDTO dto:listDTO) {
			
			row=sheet.createRow(i);
			row.createCell(0).setCellValue(dto.getSNo());
			row.createCell(1).setCellValue(dto.getSName());
			row.createCell(2).setCellValue(dto.getSmark());
			i++;
	}
	}

	

}
