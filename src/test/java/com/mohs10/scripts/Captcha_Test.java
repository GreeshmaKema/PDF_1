package com.mohs10.scripts;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.sourceforge.tess4j.Tesseract;
public class Captcha_Test 
{
	/**
	 * How to automate the captcha using the selenium webdriver
	 * @author Deepika
	 *
	 */

		public static void main(String[] args) throws Exception {
			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");		
			WebDriver driver = new ChromeDriver();
			
			
			try {
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();		
								
				driver.get("http://irctc.co.in");
				
				//ok button
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/app-header[1]/p-dialog[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/button[1]")).click();
				
				//Login btn
				driver.findElement(By.xpath("//a[@aria-label='Click here to Login in application']")).click();
				
				//Captcha Img
				WebElement capimg =  driver.findElement(By.xpath("//*[@id=\"nlpImgContainer\"]/div[9]/div/img"));
							
				//storing the captured img in src file
				File src = capimg.getScreenshotAs(OutputType.FILE);
				
				String path = "D:\\C driver backup\\selenium programs\\CaptchaProject\\Screenshot\\captcha.png";
				
				org.openqa.selenium.io.FileHandler.copy(src, new File(path));
				
				Thread.sleep(2000);
				
				Tesseract image = new Tesseract();
				String str =  image.doOCR(new File(path));
				
				System.out.println("Img OCR done");
				System.out.println(str);
				
			} catch (Exception e) {
				System.out.println("Exception Occured"+e.getMessage());
				
			}
			
			//Captcha Textbox 
			//driver.findElement(By.xpath("//input[@id='nlpAnswer']"));
			

		}

	}