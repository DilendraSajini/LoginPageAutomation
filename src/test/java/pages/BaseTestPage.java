package pages;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

class BaseTestPage {

	protected WebDriver webdriver;

	@BeforeAll
	void setup() {
	}

	@BeforeEach
	void init() {

	}

	@AfterAll
	void tearDown() {
		webdriver.close();
	}
}
