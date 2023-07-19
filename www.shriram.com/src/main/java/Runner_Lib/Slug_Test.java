package Runner_Lib;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Common_Package.BaseClass;

public class Slug_Test extends BaseClass {

	public static void main(String[] args) {

		String homePage = "https://www.stfc.in/media-kit/";
		String url = "";
		HttpURLConnection huc = null;
		int respCode;

		browserLaunch("EDGE");
		loadUrl(homePage);

		List<WebElement> links = driver.findElements(By.tagName("a"));

		Iterator<WebElement> it = links.iterator();

		while (it.hasNext()) {

			url = it.next().getAttribute("href");

//		if(url == null || url.isEmpty()){
//		System.out.println("URL is either not configured for anchor tag or it is empty");
//		continue;
//		}
//
//		if(!url.startsWith(homePage)){
//		System.out.println("URL belongs to another domain, skipping it.");
//		continue;
//		}

			try {
				huc = (HttpURLConnection) (new URL(url).openConnection());

				huc.setRequestMethod("HEAD");

				huc.connect();

				respCode = huc.getResponseCode();

				if (respCode == 200) {
					System.out.println(url + " is a 200 link");
				} else if (respCode <= 304) {
					System.out.println(url + " is a 301 link");
				} else {

					System.out.println("oops something went wrong");
				}

			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		driver.quit();

	}

}
