package com.mohs10.scripts;

import org.testng.annotations.Test;

import com.moh10.base.StartBrowser;
import com.mohs10.reuse.Html_Pdf_reuse;


public class Html_Pdf extends StartBrowser 
{		
	@Test
	public void pdftest() throws Exception  
	{
		Html_Pdf_reuse pdf = new Html_Pdf_reuse();
		pdf.itextpdf("Selenium");
		 Thread.sleep(5000);
		
	}
}
