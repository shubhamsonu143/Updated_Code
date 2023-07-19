package Execution_Lib;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Common_Package.BaseClass;
import xpaths_Lib.All_Xpaths;

public class TW_Wheeler_Execution extends BaseClass{
	
	 static All_Xpaths Al=new All_Xpaths();
		
		public static void Landing_Page() {

			String pageUrl = getPageUrl();
			System.out.println(pageUrl);
			
			if (pageUrl .contains("https://sitsfl.stfc.in/")) {

				System.out.println(pageUrl  +  "user sucessfully landed");

			} else {

				System.out.println("user hit the  wrong domain");
			}
			
			WebElement findElement = driver.findElement(By.xpath("/html/body/app-root/app-header/header/section[2]/div/div/div[2]/p/span[1]"));
			
			Actions ac=new Actions(driver);
			ac.moveToElement(findElement).perform();
			
		}
		
		public static void tw_Wheeler_Landing_Page(String INDEX,String tw_cus_mobile) throws InterruptedException {
			
		
			btnClick(Al.getTw_twoWheelerLoan());
			
			Thread.sleep(3000);
			
			String pageUrl = getPageUrl();
			
			System.out.println(pageUrl);
			
			if(pageUrl.contains("https://sitsfl.stfc.in/")) {
				
				System.out.println(pageUrl  +  "user landed the two wheeler landing page");
				
				
			}else {
				
				System.out.println("user failed to land the two wheeler loan page");
				
			}
			
			sendKeys(Al.getTw_cus_mobile(), tw_cus_mobile);
			btnClick(Al.getTw_pf_apply_btn());
				
		}
		
		public static void Otp_Pop_Up(String tw_input_field) throws Exception {
			
			List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='input_field']"));
			for(int i = 0; i < findElements.size(); ++i) {
			     WebElement checkbox = findElements.get(i).findElement(By.xpath("./input"));
			     
			     sendKeys(checkbox, tw_input_field);
			     
			}
			   btnClick(Al.getTw_otpVerifybtn());
		}
		
		public static void personal_Details_Page(String tw_residence_pincode, String tw_pan_number, String tw_father_name, String tw_cus_email) throws InterruptedException {
			
			Thread.sleep(5000);
			
			String attribute = Al.getTw_residence_pincode().getAttribute("value");
			
			if(attribute.isEmpty()) {
				
				sendKeys(Al.getTw_residence_pincode(),tw_residence_pincode );
				
			}else {
				
				System.out.println(attribute);
				
			}
			
			String attribute2 = Al.getTw_pan_number().getAttribute("value");
			
			if(attribute2.isEmpty()) {
				
				sendKeys(Al.getTw_pan_number(), tw_pan_number);
				
			}else {
				
				System.out.println(attribute2);
			}
			
			String attribute3 = Al.getTw_father_name().getAttribute("value");
			
			if(attribute3.isEmpty()) {
				
				sendKeys(Al.getTw_father_name(), tw_father_name);
				
			}else {
				
				System.out.println(attribute3);
				
			}
			
			String attribute4 = Al.getTw_cust_email().getAttribute("value");
			
			if(attribute4.isEmpty()) {
				
				sendKeys(Al.getTw_cust_email(), tw_cus_email);
				
				
			}else {
				
				System.out.println(attribute4); 
				
				
			}
			
			if(Al.getTw_stepbtn_1().isDisplayed()) {
				
				btnClick(Al.getTw_stepbtn_1());
				
			}else {
				
				System.out.println("Personal details screen is already done ");
				
			}
			
		
			
		
		}
		



}
