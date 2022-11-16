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

	public void setRadiobutton(WebElement radiobutton) {
		this.radiobutton = radiobutton;
	}

	public WebElement getEnterFirstName() {
		return EnterFirstName;
	}

	public void setEnterFirstName(WebElement enterFirstName) {
		EnterFirstName = enterFirstName;
	}

	public WebElement getEnterLastName() {
		return EnterLastName;
	}

	public void setEnterLastName(WebElement enterLastName) {
		EnterLastName = enterLastName;
	}

	public WebElement getEnterEmail() {
		return EnterEmail;
	}

	public void setEnterEmail(WebElement enterEmail) {
		EnterEmail = enterEmail;
	}

	public WebElement getEnterPassword() {
		return EnterPassword;
	}

	public void setEnterPassword(WebElement enterPassword) {
		EnterPassword = enterPassword;
	}

	public WebElement getEnterConfirmPassword() {
		return EnterConfirmPassword;
	}

	public void setEnterConfirmPassword(WebElement enterConfirmPassword) {
		EnterConfirmPassword = enterConfirmPassword;
	}

	public WebElement getClickOnRigisterButton() {
		return ClickOnRigisterButton;
	}

	public void setClickOnRigisterButton(WebElement clickOnRigisterButton) {
		ClickOnRigisterButton = clickOnRigisterButton;
	}

	@FindBy(id = "FirstName")
	private WebElement EnterFirstName;

	@FindBy(id = "LastName")
	private WebElement EnterLastName;

	@FindBy(id = "Email")
	private WebElement EnterEmail;

	@FindBy(name = "Password")
	private WebElement EnterPassword;

	@FindBy(name = "ConfirmPassword")
	private WebElement EnterConfirmPassword;

	@FindBy(name = "register-button")
	private WebElement ClickOnRigisterButton;
}
