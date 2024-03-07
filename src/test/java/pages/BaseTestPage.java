package pages;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

import drivers.BrowserDriver;
import drivers.DriverFactory;

class BaseTestPage {

	static final WebDriver webdriver = DriverFactory.getDriver(BrowserDriver.DIVER_TYPE);

	@BeforeAll
	static void setup() {
	}

	@AfterAll
	static void tearDown() {
		webdriver.quit();
	}
}
