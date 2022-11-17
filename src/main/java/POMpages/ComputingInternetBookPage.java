package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.Base_Test;

public class ComputingInternetBookPage extends Base_Test {

	public ComputingInternetBookPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='product-price']")
	private WebElement Price;

	public WebElement getPrice() {
		return Price;
	}

	@FindBy(xpath = "//label[@class='qty-label']")
	private WebElement Quantity;

	public WebElement getQuantity() {
		return Quantity;
	}

	@FindBy(id = "add-to-cart-button-13")
	private WebElement ClickonAddToCartbutton;

	public WebElement getClickonAddToCartbutton() {
		return ClickonAddToCartbutton;
	}

	@FindBy(xpath = "//p[contains(text(),'The product has been added to your ')]")
	private WebElement ConfirmMessage;

	public WebElement getConfirmMessage() {
		return ConfirmMessage;
	}

}
