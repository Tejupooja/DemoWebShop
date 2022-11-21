package Tests;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;
import POMpages.BooksPage;
import POMpages.CheckoutPage;
import POMpages.ComputingInternetBookPage;
import POMpages.HomePage;
import POMpages.LoginPage;
import POMpages.ShoppingCartPage;
import genericLibrary.Base_Test;

public class BooksPageTest extends Base_Test {

	@Test(priority = 1)
	public void LoginPageExecution() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		login.getLoginlink().click();
		Reporter.log("Clicking on login link");

		login.getEmail().sendKeys("teju95@gmail.com");
		assertTrue(login.getEmail().isDisplayed(), "Email id is not entered");
		Reporter.log("Entered Email in Email textfield");

		login.getPassword().sendKeys("tejupooja");
		assertTrue(login.getPassword().isDisplayed(), "password is not entered");
		Reporter.log("Entered Password in password textfield");

		login.getClickOnLoginButton().click();
		Reporter.log("Clicking on Login Button");
	}

	@Test(priority = 2)
	public void HomePageExecution() {
		HomePage home = new HomePage(driver);
		home.getClickonBooksMenu().click();
		Reporter.log("Clicking on books menu");
	}

	@Test(priority = 3)
	public void BooksPageExecution() {
		BooksPage book = new BooksPage(driver);
		assertTrue(book.getDropdownPosition().isDisplayed(), "by default sortby dropdown position is not selected");
		assertTrue(book.getDisplayDropdown().isDisplayed(), "by default display dropdown 8 is not selected");
		assertTrue(book.getViewAsGrid().isDisplayed(), "by default viewas dropdown grid is not selected");
		book.getClickonComputinginternetbook().click();
		Reporter.log("Clicking on Computing and Internet book");
	}

	@Test(priority = 4)
	public void ComputingInternetBookExecution() {
		ComputingInternetBookPage book1 = new ComputingInternetBookPage(driver);
		book1.getClickonAddToCartbutton().click();
		Reporter.log("Clicking on Add to Cart button");
		assertTrue(book1.getPrice().isDisplayed(), "price is not displayed");
		Reporter.log("Price is displayed");
		assertTrue(book1.getQuantity().isDisplayed(), "qunatity is not displayed");
		Reporter.log("Quantity is displayed");
		assertTrue(book1.getConfirmMessage().isDisplayed(), "Not displaying Confirmation Message");
		Reporter.log("Confirm message popup is displayed");
	}

	@Test(priority = 5)
	public void ShoppingcartPageExecution() {
		ShoppingCartPage cart = new ShoppingCartPage(driver);
		cart.getShoppingcartLink().click();
		assertTrue(cart.getShoppingcartLink().isDisplayed(), "Not displaying ShoppingCart Page ");
		Reporter.log("Click on Shopping cart link");
		Select sel = new Select(cart.getCountryDropdown());
		sel.selectByVisibleText("India");
		Reporter.log("Country Dropdown India is Selected");

		cart.getClickonCheckbox().click();
		Reporter.log("Click on Terms and Condition Checkbox");
		cart.getClickOnCheckoutbutton().click();
		Reporter.log("Clicking on Checkout Button");
	}

	@Test(priority = 6)
	public void CheckoutPageExecution() {
		CheckoutPage checkout = new CheckoutPage(driver);
		Select drop = new Select(checkout.getBillingaddressDropdown());
		drop.selectByVisibleText("New Address");

		checkout.getFirstName().clear();
		checkout.getFirstName().sendKeys("Tejaswini");
		Reporter.log("Entering firstname in firstname textfield");

		checkout.getLastName().clear();
		checkout.getLastName().sendKeys("R");
		Reporter.log("Entering lastname in lastname textfield");

		checkout.getEmail().clear();
		checkout.getEmail().sendKeys("teju95@gmail.com");
		Reporter.log("Entering Email in Email textfield");

		checkout.getCompany().sendKeys("Testyantra");
		Reporter.log("Entering Company in Company textfield");

		Select drop1 = new Select(checkout.getCountry());
		drop1.selectByVisibleText("India");
		Reporter.log("Country Dropdown India is Selected");

		checkout.getCity().sendKeys("Bengaluru");
		Reporter.log("Entering city in city textfield");

		checkout.getAddress().sendKeys("Katthriguppe");
		Reporter.log("Entering Address in Address textfield");

		checkout.getZipPostalCode().sendKeys("560085");
		Reporter.log("Entering ZipPostalcode in postalcode textfield");

		checkout.getPhonenumber().sendKeys("9856322547");
		Reporter.log("Entering phonenumber in phonenumber textfield");

		checkout.getClickonContinuebutton().click();
		Reporter.log("Clicking on Continue Button in BillingAddress");

		checkout.getStoreInSecureCheckbox().click();
		Reporter.log("Clicking on StoreInSecure Checkbox in ShippingAddress");

		checkout.getContinueInShippingAddress().click();
		Reporter.log("Clicking on Continue Button in ShippingAddress");

		checkout.getRadiobutton().click();
		Reporter.log("Clicking on Radio Button in PaymentMethod");

		checkout.getContinueButtonInPaymentmethod().click();
		Reporter.log("Clicking on Continue Button in PaymentMethod");

		checkout.getContinueButtonInPaymentInformation().click();
		Reporter.log("Clicking on Continue Button in PaymentInformation");

		checkout.getConfirmButtonInConfirmOrder().click();
		Reporter.log("Clicking on Confirm Button in ConfirmOrder");

		checkout.getContinueButtonInThankyouPage().click();
		Reporter.log("Clicking on Continue Button in Thankyou");

	}
}
