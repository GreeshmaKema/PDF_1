package com.mohs10.reuse;



import java.io.FileOutputStream;
import org.openqa.selenium.WebDriver;
import com.itextpdf.text.pdf.PdfWriter;
import com.moh10.base.Action;
import com.moh10.base.StartBrowser;
import com.mohs10.or.Html_pdf;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;

public class Html_Pdf_reuse
{
	public static Action aDriver;
	public WebDriver driver;
	
	public Html_Pdf_reuse()
	{
		aDriver = new Action();
		driver = StartBrowser.driver;
	}
	
	public void itextpdf(String Searchbox) throws Exception
 	{	
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Google Page");
		aDriver.navigateToApplication("https://www.google.com");
		
		
	        	try {
					aDriver.type(Html_pdf.googlesearchbox, Searchbox, "Google Search box");
					System.out.println("Execution successful");
					
	        	} catch (Exception e) 
	        	{
	
					String File = "c:/temp/samplepdf.pdf";
					Document doc = new Document();
					PdfWriter.getInstance(doc, new FileOutputStream(File));
					doc.open();
					doc.add(new Paragraph("Test Case fail:1"));
					doc.add(new Paragraph("Error not found"));
					doc.close();	
					
					System.out.println(e);
				}

}
}
