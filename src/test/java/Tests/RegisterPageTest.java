package Tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import POMpages.RegisterPage;
import genericLibrary.Base_Test;

public class RegisterPageTest extends Base_Test {
	@Test
	public void registertestExecution() {
		RegisterPage register = new RegisterPage(driver);
		register.getRegisterLink().click();
		Reporter.log("Clicking on Register Link");

		register.getRadiobutton().click();
		Reporter.log("Clicking on radio button");

		register.getEnterFirstName().sendKeys("Tejaswini");
		Reporter.log("Entered FirstName in FirstName Textfield");

		register.getEnterLastName().sendKeys("R");
		Reporter.log("Entered LastName in LastName Textfield");

		register.getEnterEmail().sendKeys("teju95@gmail.com");
		Reporter.log("Entered Email in Email Textfield");

		register.getEnterPassword().sendKeys("tejupooja");
		Reporter.log("Entered Password in password Textfield");

		register.getEnterConfirmPassword().sendKeys("tejupooja");
		Reporter.log("Entered confirmPassword in confirmPassword Textfield");

		register.getClickOnRigisterButton().click();
		Reporter.log("Clicking on Register button");

	}
}
