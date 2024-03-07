package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	private DriverFactory() {
	}

	public static WebDriver getDriver(String driverType) {
		Drivers driver = Drivers.valueOf(driverType);
		switch (driver) {
		case CHROME:
			return getCromeDriver();
		}
		return getCromeDriver();
	}

	private static WebDriver getCromeDriver() {
		return new ChromeDriver();
	}
}
