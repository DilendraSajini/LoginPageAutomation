package drivers;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

	private DriverFactory() {
	}

	public static WebDriver getDriver(String driverType) {
		Drivers driver = Drivers.valueOf(driverType);
		switch (driver) {
		case CHROME:
			return new ChromeBrowserDriver().getDriver();
		}
		return new ChromeBrowserDriver().getDriver();
	}
}
