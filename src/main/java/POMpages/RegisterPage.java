package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.Base_Test;

public class RegisterPage extends Base_Test {

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement RegisterLink;

	public WebElement getRegisterLink() {
		return RegisterLink;

	}

	@FindBy(id = "gender-female")
	private WebElement radiobutton;

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	@FindBy(id = "FirstName")
	private WebElement EnterFirstName;

	public WebElement getEnterFirstName() {
		return EnterFirstName;
	}

	@FindBy(id = "LastName")
	private WebElement EnterLastName;

	public WebElement getEnterLastName() {
		return EnterLastName;
	}

	@FindBy(id = "Email")
	private WebElement EnterEmail;

	public WebElement getEnterEmail() {
		return EnterEmail;
	}

	@FindBy(name = "Password")
	private WebElement EnterPassword;

	public WebElement getEnterPassword() {
		return EnterPassword;
	}

	@FindBy(name = "ConfirmPassword")
	private WebElement EnterConfirmPassword;

	public WebElement getEnterConfirmPassword() {
		return EnterConfirmPassword;
	}

	@FindBy(name = "register-button")
	private WebElement ClickOnRigisterButton;

	public WebElement getClickOnRigisterButton() {
		return ClickOnRigisterButton;
	}

}
