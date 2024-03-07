package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	private WebDriverWait wait;

	@FindBy(how = How.ID, using = "")
	@CacheLookup
	private WebElement username;

	@FindBy(how = How.ID, using = "")
	@CacheLookup
	private WebElement password;

	@FindBy(how = How.ID, using = "")
	@CacheLookup
	private WebElement signin;

	@FindBy(how = How.ID, using = "")
	@CacheLookup
	private WebElement forgotPassword;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void populate() throws InterruptedException {
	}

	protected void setUsername(String username) {
	}

	protected void setPassword(String password) {
	}

	protected void clickSignin() throws InterruptedException {
	}

	protected void clickForgotPassword() throws InterruptedException {
	}
}
