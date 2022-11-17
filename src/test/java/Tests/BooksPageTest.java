package Tests;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

import POMpages.BooksPage;
import POMpages.ComputingInternetBookPage;
import POMpages.HomePage;
import POMpages.ShoppingCartPage;
import genericLibrary.Base_Test;

public class BooksPageTest extends Base_Test {

	@Test
	public void BooksPageExecution() throws InterruptedException {
		HomePage home = new HomePage(driver);
		home.getClickonBooksMenu().click();
		Reporter.log("Clicking on books menu");

		BooksPage book = new BooksPage(driver);
		assertTrue(book.getDropdownPosition().isDisplayed(), "by default sortby dropdown position is not selected");
		assertTrue(book.getDisplayDropdown().isDisplayed(), "by default display dropdown 8 is not selected");
		assertTrue(book.getViewAsGrid().isDisplayed(), "by default viewas dropdown grid is not selected");
		book.getClickonComputinginternetbook().click();
		Reporter.log("Clicking on Computing and Internet book");

		ComputingInternetBookPage book1 = new ComputingInternetBookPage(driver);
		book1.getClickonAddToCartbutton().click();
		Reporter.log("Clicking on Add to Cart button");
		assertTrue(book1.getPrice().isDisplayed(), "price is not displayed");
		assertTrue(book1.getQuantity().isDisplayed(), "qunatity is not displayed");
		assertTrue(book1.getConfirmMessage().isDisplayed(), "Not displaying Confirmation Message");

		ShoppingCartPage cart = new ShoppingCartPage(driver);
		cart.getShoppingcartLink().click();
		assertTrue(cart.getShoppingcartLink().isDisplayed(), "Not displaying ShoppingCart Page ");
		Reporter.log("Click on Shopping cart link");

		cart.getClickonCheckbox().click();
		Reporter.log("Click on Terms and Condition Checkbox");

		cart.getClickOnCheckoutbutton().click();
		Reporter.log("Clicking on Checkout Button");

	}
}
