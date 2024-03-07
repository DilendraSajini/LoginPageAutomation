package drivers;

import org.openqa.selenium.WebDriver;

import config.AppConfig;

public interface BrowserDriver {
	static final String DRIVER_NAME = AppConfig.loadProperties().getProperty("driver.name");
	static final String DRIVER_PATH = AppConfig.loadProperties().getProperty("driver.path");
	static final String DRIVER_BINARY_PATH = AppConfig.loadProperties().getProperty("driver.binary.path");
	static final String DIVER_TYPE = AppConfig.loadProperties().getProperty("driver.type");
	WebDriver getDriver();
}
