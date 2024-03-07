package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowserDriver implements BrowserDriver {

	@Override
	public WebDriver getDriver() {
		System.setProperty(DRIVER_NAME, DRIVER_PATH);
		ChromeDriver driver = new ChromeDriver(getChromeDriverOptions());
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
	}

	private static ChromeOptions getChromeDriverOptions() {
		ChromeOptions options = new ChromeOptions();
		options.setBinary(DRIVER_BINARY_PATH);
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		return options;
	}
}
