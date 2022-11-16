package Tests;

import org.testng.annotations.Test;
import POMpages.RegisterPage;
import genericLibrary.Base_Test;

public class RegisterPageTest extends Base_Test{
	@Test
	public void registertestExecution() {
		RegisterPage register = new RegisterPage(driver);
		register.getRegisterLink().click();		
		register.getEnterFirstName().sendKeys("Tejaswini");
		register.getEnterLastName().sendKeys("R");
		register.getEnterEmail().sendKeys("tejaswini38@gmail.com");
		register.getEnterPassword().sendKeys("tejupooja");
		register.getEnterConfirmPassword().sendKeys("tejupooja");
		register.getClickOnRigisterButton().click();
	
	}
}
