# LoginPageAutomation

Automate the login functionality of a web application with Java, Selenium, JUnit 5, Maven, and Surefire reporting.

## Overview
This automation framework provides a robust structure for automating web page login functionality. It includes sample test cases to automate the login process, covering both positive and negative scenarios. While the current implementation focuses on a subset of test cases, additional scenarios can be incorporated in the future for comprehensive test coverage.

## Setup Instructions
1. Ensure that Java Development Kit (JDK) is installed on your machine and properly configured.
 
2. Clone the repository `git clone https://github.com/DilendraSajini/LoginPageAutomation.git`.
3. Checkout to development branch. `git checkout development`

4. Before running the test suite, ensure that the necessary properties and dependency locations are configured in the `application.properties` file located in `src/main/resources`.

- `driver.type`: Specify the browser for testing (currently supports only Chrome).
If you require additional browser options, you'll need to configure them in the Drivers.java file located in src/main/java/drivers/ directory. After configuring the drivers, ensure they are synchronized with the settings specified in the application.properties file.
- `driver.name`: Provide the web driver name for the chosen browser.
- `driver.path`: Set the path to the web driver executable.
- `driver.binary.path`: Configure the path to the web browser binary.
- `base.url`: Define the URL of the web page for testing.

5. Install dependencies `mvn clean install` if required.
6. Run the project with `mvn clean test site` to generate Surefire reports in target folder.

## Positive Test Cases for Login Page
1. **Log in with valid credentials**:
   - Verify that valid email and password formats enable the Sign-in button.
   - Validate redirection to the next page upon clicking the Sign-in button.
2. Check the Show Password feature
3. Check the Remember Me checkbox
4. Check the autofill functionality
5. Check the Log Out button functionality
6. Restore the password with a registered email
7. Check the Forgot Password email functionality
8. Create a new password using valid data
9. Log into the account using the new password
10. Switch between input fields using Tab key
11. Log into the system using the Enter key
12. Log in with valid credentials in different browsers
13. Log in with valid credentials using different devices

## Negative Test Cases for Login Page
1. **Log in with empty required fields**
2. **Log in with an invalid email format**:
   - Verify that invalid email and password formats disable the Sign-in button.
3. **Log in with an unregistered email**
4. **Log in with an invalid password**
5. **Log in with both email and password invalid**
6. Restore a password with an invalid email format
7. Restore a password with an unregistered email
8. Restore a password with empty required fields
9. Restore a password using non-matching new passwords
10. Log in to the account using an old password

## Design Choices
The framework employs the Page Object Model (POM) and Template Design Pattern to reduce boilerplate code and ensure consistency across the project implementation. Parameterized Tests are utilized to increase test coverage, improve readability, and reduce code duplication. Surefire reporting generates standard XML-based test reports compatible with CI/CD tools, while Maven Surefire Plugin also supports HTML-based test reports for enhanced visualization of results.

## Additional Improvements
Future enhancements may include:
- Expanding test coverage to cover all positive and negative scenarios.
- Implementing improve meaningful messaging, logging, exception handling and richer reporting with attached screenshots.
- Discussing usability enhancements with experts to evolve the framework into an enterprise-level solution, potentially incorporating features like localization support.

By continuously iterating and improving the framework, we aim to maintain its solid structure and ensure long-term maintainability and effectiveness.
