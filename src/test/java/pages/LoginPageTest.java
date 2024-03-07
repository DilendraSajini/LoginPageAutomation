package pages;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class LoginPageTest extends BaseTestPage {

	private LoginPage login;

	@BeforeEach
	void init() {
	}

	@Test
	@Disabled
	void testValidLogin() {

	}

	@Test
	@Disabled
	void testEmptyUsernameAndPassword() {

	}

	@Nested
	class TestUseName {
		@Test
		@Disabled
		void testInvalidUsername() {

		}

		@Test
		@Disabled
		void testEmptyPassword() {

		}
	}

	@Nested
	class TestPassword {
		@Test
		@Disabled
		void testInvalidPassword() {

		}
		
		@Test
		@Disabled
		void testEmptyPassword() {

		}
	}

	@Test
	@Disabled
	void testForgotPasswordLink() {

	}

	@Test
	@Disabled
	public void testRememberMeCheckbox() {

	}

}
