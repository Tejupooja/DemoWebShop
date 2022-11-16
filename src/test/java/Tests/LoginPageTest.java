package Tests;

import org.testng.annotations.Test;

import POMpages.LoginPage;
import genericLibrary.Base_Test;

public class LoginPageTest extends Base_Test {
	@Test
	public void LogintestExecution() {
		LoginPage login = new LoginPage(driver);
		login.getLoginlink().click();
		login.getEmail().sendKeys("tejaswini38@gmail.com");
		login.getPassword().sendKeys("tejupooja");
		login.getClickOnLoginButton().click();

	}
}