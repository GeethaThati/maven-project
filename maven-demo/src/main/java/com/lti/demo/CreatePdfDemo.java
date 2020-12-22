package com.lti.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class CreatePdfDemo {

	public static void main(String[] args) {

		Document document = new Document();

		try {
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Hello.pdf"));
			
			document.open();
			document.add(new Paragraph("Hello World PDF"));
			document.close();
			writer.close();
			
			System.out.println("Pdf generated successfully.....");
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}

