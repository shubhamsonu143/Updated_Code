package Runner_Lib;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Https {

	public static WebDriver driver;

	static HttpURLConnection huc = null;
	static int respCode;

	public static void main(String[] args) {
		// simple page (without many resources so that the output is
		// easy to understand
		String url = "https://beta.shriram.com/twl-call-center-entry?token=697d2162d5ea7bc92ed6c33ab6cb9c0b&agent_id=A234";
		downloadPage(url);
	}

	private static void downloadPage(String url) {
		try {
			ChromeOptions options = new ChromeOptions();
			LoggingPreferences logPrefs = new LoggingPreferences();
			logPrefs.enable(LogType.PERFORMANCE, Level.ALL);
			options.setCapability("goog:loggingPrefs", logPrefs);
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			// navigate to the page
			System.out.println("Navigate to " + url);
			driver.navigate().to(url);
			// and capture the last recorded url (it may be a redirect, or the
			// original url)
			String currentURL = driver.getCurrentUrl();
			int status = -1;
			System.out.println("\\nList of log entries:\\n");
			List<LogEntry> entries = driver.manage().logs().get(LogType.PERFORMANCE).getAll();
			System.out.println(entries.size() + " " + LogType.PERFORMANCE + " log entries found");

			List<WebElement> links = driver.findElements(By.tagName("a"));

			Iterator<WebElement> it = links.iterator();

			for (LogEntry entry : entries) {

				while (it.hasNext()) {

					url = it.next().getAttribute("href");

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

						System.out.println(entry.getMessage());

						JSONObject json = new JSONObject(entry.getMessage());
						System.out.println(json.toString());
						JSONObject message = json.getJSONObject("message");
						String method = message.getString("method");
						if (method != null && "Network.responseReceived".equals(method)) {
							JSONObject params = message.getJSONObject("params");
							JSONObject response = params.getJSONObject("response");
							String messageUrl = response.getString("url");
							if (currentURL.equals(messageUrl)) {
								status = response.getInt("status");
								System.out.println("---------- bingo !!!!!!!!!!!!!! returned response for " + messageUrl
										+ ": " + status);
								System.out
										.println("---------- bingo !!!!!!!!!!!!!! headers: " + response.get("headers"));
							}
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
