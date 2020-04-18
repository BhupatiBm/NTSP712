package com.nt.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import com.nt.dto.studentDTO;

public class pdflViewStudent extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document doc, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<studentDTO> listDTO=null;
		Paragraph p=null;
		Table t=null;
		//get Model Attribute data
		listDTO=(List<studentDTO>)map.get("listDTO");
		//add paragraph
		p=new Paragraph("Students Report",new Font(Font.BOLD));
		doc.add(p);
		// add table
		t=new Table(5,listDTO.size());  // cols ,rows
		for(studentDTO dto:listDTO){
			t.addCell(String.valueOf(dto.getSNo()));
			t.addCell(dto.getSName());
			t.addCell(String.valueOf(dto.getSmark()));
			
		}
	  doc.add(t);
		

	}

}
