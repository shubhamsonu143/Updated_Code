package FD_Execution;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import XPATHS.fd_xpaths;
import commonPackage.BaseClass;

public class Executions_fd extends BaseClass{
	
	@BeforeSuite
    public void startTest() {
		
		browserLaunch("CHROME");
        loadUrl("https://sitsfl.stfc.in/");
        System.out.println("SFL Web Application is Launched");
    }

	
	@Test
    public void deposit() throws InterruptedException {
		fd_xpaths dp = new fd_xpaths();

		BaseClass bc = new BaseClass();
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        WebElement deposits = dp.getDeposits();
        actions.moveToElement(deposits).perform();
        Thread.sleep(1000);
        WebElement fixedDeposits = dp.getFixedDeposits();
        fixedDeposits.click();
        Thread.sleep(2000);
        WebElement mobileNum = dp.getMobileNum();
        mobileNum.sendKeys("8801439001");
        WebElement pincode = dp.getPincode();
        pincode.sendKeys("603210");
        Thread.sleep(2000);
        WebElement investNow = dp.getInvestNow();
        investNow.click();
        Thread.sleep(5000);
//        List<WebElement> enterOTP = dp.getEnterOTP().findElements("//div[@class='input_field']")
//        enterOTP.sendKeys("111111");
        
//        
//        List<String> data = new ArrayList<String>();
//
//        data.add("1");
//        data.add("1");
//        data.add("1");
//        data.add("1");
//        data.add("1");
//        data.add("1");
//        int counter = 0;
//
//        driver.switchTo().frame("result");
//
//        List<WebElement> elements = driver.findElement(By.xpath("//div[@class='input_field']")).findElements(By.id("./input"));
//        for(WebElement element : elements)
//        {
//            element.sendKeys(data.get(counter));
//            counter++;
//        }
        List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='input_field']"));
		for(int i = 0; i < findElements.size(); ++i) {
		     WebElement checkbox = findElements.get(i).findElement(By.xpath("./input"));
		     
		     sendKeys(checkbox, "111111");
		     
		}
		Thread.sleep(3000);
		WebElement otpVerifyBtn = dp.getOtpVerifyBtn();
		otpVerifyBtn.click();
		
		Thread.sleep(5000);
		WebElement investmentAmount = dp.getInvestmentAmount();
		investmentAmount.sendKeys("700");
		Thread.sleep(2000);
		WebElement tenureMonth = dp.getTenureMonth();
		tenureMonth.sendKeys("12");
		
		Thread.sleep(2000);
//		Actions actions1 = new Actions(driver);
		WebElement interestPayout = dp.getInterestPayout();
		interestPayout.click();
			
		
		
//		dropDown(interestPayout, "value", "Monthly");
		
//		dropDown(interestPayout,"Monthly");
        
    }

}
