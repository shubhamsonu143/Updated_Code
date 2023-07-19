package Runner_Lib;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Common_Package.BaseClass;
import Excel_Lib.Excel_Utils;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Excel_Run extends BaseClass {

	int respCode = 200;

	@BeforeTest
	public void launch() {

		browserLaunch("CHROME");

	}

	@DataProvider
	public static Iterator<Object[]> getTestData() {
		ArrayList<Object[]> dataFromExcel = Excel_Utils.getDataFromexcel();
		return dataFromExcel.iterator();
	}

	@Test(dataProvider = "getTestData")
	public void slug(String INDEX, String PageURL) throws Exception {

		loadUrl(PageURL);

		RestAssured.baseURI = PageURL;
		RequestSpecification request = RestAssured.given();
		Response response = request.get();

		int statusCode = response.getStatusCode();

		int parseInt = Integer.parseInt(INDEX);

		if (statusCode == respCode) {

			Excel_Utils.writeinexcel("PASS" + statusCode , parseInt);

		} else {

			Excel_Utils.writeinexcel("FAIL" + statusCode, parseInt);
		}

	}

}
