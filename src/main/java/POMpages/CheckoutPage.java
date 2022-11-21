package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.Base_Test;

public class CheckoutPage extends Base_Test {

	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@id='billing-address-select']")
	private WebElement billingaddressDropdown;

	

	public WebElement getBillingaddressDropdown() {
		return billingaddressDropdown;
	}

	@FindBy(xpath = "//option[text()='New Address']")
	private WebElement NewAddress;

	public WebElement getNewAddress() {
		return NewAddress;
	}

	@FindBy(id = "BillingNewAddress_FirstName")
	private WebElement FirstName;

	public WebElement getFirstName() {
		return FirstName;
	}

	@FindBy(id = "BillingNewAddress_LastName")
	private WebElement LastName;

	public WebElement getLastName() {
		return LastName;
	}

	@FindBy(id = "BillingNewAddress_Email")
	private WebElement Email;

	public WebElement getEmail() {
		return Email;
	}

	@FindBy(id = "BillingNewAddress_Company")
	private WebElement Company;

	public WebElement getCompany() {
		return Company;
	}

	@FindBy(id = "BillingNewAddress_CountryId")
	private WebElement Country;

	public WebElement getCountry() {
		return Country;
	}

	@FindBy(xpath = "//option[text()='India']")
	private WebElement ClickonIndia;

	public WebElement getClickonIndia() {
		return ClickonIndia;
	}

	@FindBy(id = "BillingNewAddress_City")
	private WebElement City;

	public WebElement getCity() {
		return City;
	}

	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement Address;

	public WebElement getAddress() {
		return Address;
	}

	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement ZipPostalCode;

	public WebElement getZipPostalCode() {
		return ZipPostalCode;
	}

	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement Phonenumber;

	public WebElement getPhonenumber() {
		return Phonenumber;
	}

	@FindBy(xpath = "//input[@onclick='Billing.save()']")
	private WebElement ClickonContinuebutton;

	public WebElement getClickonContinuebutton() {
		return ClickonContinuebutton;
	}
	@FindBy(id = "PickUpInStore")
	private WebElement StoreInSecureCheckbox;

	public WebElement getStoreInSecureCheckbox() {
		return StoreInSecureCheckbox;
	}

	@FindBy(xpath = "(//input[@title='Continue'])[2]")
	private WebElement ContinueInShippingAddress;

	public WebElement getContinueInShippingAddress() {
		return ContinueInShippingAddress;
	}
	@FindBy(xpath = "//label[text()='Cash On Delivery (COD) (7.00)']")
	private WebElement Radiobutton;

	public WebElement getRadiobutton() {
		return Radiobutton;
	}

	@FindBy(xpath = "//input[@class='button-1 payment-method-next-step-button']")
	private WebElement ContinueButtonInPaymentmethod;

	public WebElement getContinueButtonInPaymentmethod() {
		return ContinueButtonInPaymentmethod;
	}

	@FindBy(xpath = "//input[@class='button-1 payment-info-next-step-button']")
	private WebElement ContinueButtonInPaymentInformation;

	public WebElement getContinueButtonInPaymentInformation() {
		return ContinueButtonInPaymentInformation;
	}

	@FindBy(xpath = "//input[@class='button-1 confirm-order-next-step-button']")
	private WebElement ConfirmButtonInConfirmOrder;

	public WebElement getConfirmButtonInConfirmOrder() {
		return ConfirmButtonInConfirmOrder;
	}

	@FindBy(xpath = "//input[@class='button-2 order-completed-continue-button']")
	private WebElement ContinueButtonInThankyouPage;

	public WebElement getContinueButtonInThankyouPage() {
		return ContinueButtonInThankyouPage;
	}

}



