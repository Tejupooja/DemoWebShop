package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.Base_Test;

public class LoginPage extends Base_Test {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Log in")
	private WebElement loginlink;

	public WebElement getLoginlink() {
		return loginlink;
	}

	@FindBy(id = "Email")
	private WebElement Email;

	public WebElement getEmail() {
		return Email;
	}

	@FindBy(id = "Password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath = "//input[@class='button-1 login-button']")
	private WebElement ClickOnLoginButton;

	public WebElement getClickOnLoginButton() {
		return ClickOnLoginButton;
	}
}

