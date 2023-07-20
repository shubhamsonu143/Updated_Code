package run;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ExcelUtils.ExcelUtils;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class article extends BaseClass {

	
	@BeforeTest
	public void browserLaunch() {

		headless("chrome");
	}

	static List<String> data = new ArrayList<String>();

	@DataProvider
	public Iterator<Object[]> getTestData() {

		ArrayList<Object[]> testData = ExcelUtils.getDataFromexcel();
		return testData.iterator();

	}

	@Test(dataProvider = "getTestData")
	public void execute(String INDEX, String Articles_URL) {

		WebDriverWait Webwait = new WebDriverWait(driver, Duration.ofSeconds(30));

		try {

		
			
			System.out.println(INDEX+") ==> "+Articles_URL);
			
			loadUrl(Articles_URL);
			
			WebElement Parent_Tag = driver.findElement(By.xpath("//div[@class='eligi_bility']"));
			
			 Webwait.until(ExpectedConditions.visibilityOf(Parent_Tag));

			List<WebElement> allLinks = Parent_Tag.findElements(By.tagName("a"));

			for (WebElement link : allLinks) {

				String attribute = link.getAttribute("href");
				
				String text = link.getText();
				
//				System.out.println(attribute+" ==> "+text);

				 data.add(attribute+" ==> "+text);

			}

			 String join = String.join(", "+"\n", data );
			 System.out.println(join);
			 int parseInt = Integer.parseInt(INDEX);
			 ExcelUtils.writeinexcel(join, parseInt);
			 data.clear();

		} catch (Exception e) {

			e.printStackTrace();

		}

		// driver.quit();

	}

	@AfterTest
	public void browserQuit() {

		driver.quit();

	}

}