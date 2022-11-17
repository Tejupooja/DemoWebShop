package Tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import POMpages.LoginPage;
import genericLibrary.Base_Test;

public class LoginPageTest extends Base_Test {
	@Test
	public void LogintestExecution() {
		LoginPage login = new LoginPage(driver);
		login.getLoginlink().click();
		Reporter.log("Clicking on login link");

		login.getEmail().sendKeys("teju95@gmail.com");
		Reporter.log("Entered Email in Email textfield");

		login.getPassword().sendKeys("tejupooja");
		Reporter.log("Entered Password in password textfield");

		login.getClickOnLoginButton().click();
		Reporter.log("Clicking on Login Button");
	}
}