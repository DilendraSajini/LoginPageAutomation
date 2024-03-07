package main;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import drivers.BrowserDriver;
import drivers.DriverFactory;
import pages.LoginPage;

public class LoginPageMain {

	public static void main(String args[]) throws InterruptedException, IOException {
		WebDriver webdriver = DriverFactory.getDriver(BrowserDriver.DIVER_TYPE);
		LoginPage login = new LoginPage(webdriver);
		webdriver.close();
	}

}
