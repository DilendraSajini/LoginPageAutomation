package pages;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Login PageTest Suite")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class LoginPageTest extends BaseTestPage {

	private static LoginPage login;

	@BeforeAll
	static void setup() {
		login = new LoginPage(webdriver);
	}

	@BeforeEach
	void init() {

	}

	/*
	 * Valid passwords:
	 * 
	 * - A strong password containing at least 8 characters, including uppercase
	 * letters, lowercase letters, numbers, and special characters
	 * 
	 * - A moderately strong password containing a mix of uppercase letters,
	 * lowercase letters, and numbers: Secret123
	 * 
	 * - A simple but valid password containing only lowercase letters and numbers:
	 * password123
	 * 
	 * Valid email addresses:
	 * 
	 * - A standard email address with a valid format: user@example.com
	 * 
	 * -An email address with a subdomain: user@mail.example.com
	 * 
	 * -An email address with a hyphen in the domain: user-name@example.com
	 * 
	 * - An email address with a plus sign in the local part: user+label@example.com
	 */

	@ParameterizedTest
	@Order(1)
	@DisplayName("Valid Username Password Login enable Sign In Button")
	@CsvSource({ "'user@example.com', 'P@ssw0rd' ", "'user@mail.example.com', 'P@ssw0rd'",
			"'user-name@example.com', 'P@ssw0rd'", "'user+label@example.com', 'P@ssw0rd'" })
	void testValidLoginEnableSignInButton(String username, String password) {
		login.clear();
		login.setUsername(username);
		login.setPassword(password);
		assertTrue(login.getSignin().isEnabled());
	}

	@DisplayName("Invalid Username Login disable Sign In Button")
	@ParameterizedTest
	@Order(2)
	@ValueSource(strings = { " ", "userexample.com", "user@example", "user@example!com", "user@example .com",
			"user@example..com" })
	void testInvalidUsername(String username) {
		login.clear();
		login.setUsername(username);
		String password = "P@ssw0rd";
		login.setPassword(password);
		assertFalse(login.getSignin().isEnabled());
	}

	@DisplayName("Invalid Password Login disable Sign In Button")
	@ParameterizedTest
	@Order(3)
	@ValueSource(strings = { "", "abc123", "password", "123456", "!@#$%^&*", "pa ssword" })
	void testInvalidPassword(String password) {
		login.clear();
		String username = "user@example.com";
		login.setUsername(username);
		login.setPassword(password);
		assertFalse(login.getSignin().isEnabled());
	}

	@Test
	@DisplayName("Reset Password")
	@Disabled
	@Order(4)
	void testForgotPasswordLink() {
		// login.clickForgotPassword();
		// login.clickSignin();
	}

	@Test
	@Order(5)
	@DisplayName("Valid Username Password Login")
	void testValidLogin() {
		login.clear();
		String username = "user@example.com";
		String password = "P@ssw0rd";
		login.setUsername(username);
		login.setPassword(password);
		assertTrue(login.getSignin().isEnabled());
		login.clickSignin();
		assertEquals("ATRAS Running!", webdriver.getTitle());
	}

	@AfterAll
	static void tearDown() {

	}
}
