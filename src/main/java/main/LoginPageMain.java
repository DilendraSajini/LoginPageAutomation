package main;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import config.AppConfig;
import drivers.DriverFactory;
import pages.LoginPage;

public class LoginPageMain {

	public static void main(String args[]) throws InterruptedException, IOException {
		String driverType = AppConfig.loadProperties().getProperty("driver.type");
		WebDriver webdriver = DriverFactory.getDriver(driverType);
		LoginPage login = new LoginPage(webdriver);
		webdriver.close();
	}

}
