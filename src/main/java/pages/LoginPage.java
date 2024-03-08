package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import config.AppConfig;

public class LoginPage {

	public static final String baseUrl = AppConfig.loadProperties().getProperty("base.url");

	private WebDriverWait wait;

	@FindBy(how = How.XPATH, using = "//*[@id=\"login-form\"]/div[2]/input")
	@CacheLookup
	private WebElement username;

	@FindBy(how = How.ID, using = "password")
	@CacheLookup
	private WebElement password;

	@FindBy(how = How.XPATH, using = "//*[@id=\"login-form\"]/div[5]/input")
	@CacheLookup
	private WebElement signin;

	// need to change
	@FindBy(how= How.LINK_TEXT, using="Forgot password?")
	@CacheLookup
	private WebElement forgotPassword;


	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getForgotPassword() {
		return forgotPassword;
	}

	public LoginPage(WebDriver driver) {
		driver.get(baseUrl);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		PageFactory.initElements(driver, this);
	}

	protected void setUsername(String username) {
		this.username.sendKeys(username);
	}

	protected void setPassword(String password) {
		this.password.sendKeys(password);
	}

	protected void clickSignin() {
		wait.until(ExpectedConditions.elementToBeClickable(signin));
		signin.click();
	}

	protected void clickForgotPassword() {
		wait.until(ExpectedConditions.elementToBeClickable(password));
		forgotPassword.click();
	}

	protected void clear() {
		this.username.clear();
		this.password.clear();
	}

}
