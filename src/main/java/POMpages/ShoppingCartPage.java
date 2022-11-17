package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.Base_Test;

public class ShoppingCartPage extends Base_Test {

	public ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement ShoppingcartLink;

	public WebElement getShoppingcartLink() {
		return ShoppingcartLink;
	}

	@FindBy(id = "termsofservice")
	private WebElement ClickonCheckbox;

	public WebElement getClickonCheckbox() {
		return ClickonCheckbox;
	}

	@FindBy(id = "checkout")
	private WebElement ClickOnCheckoutbutton;

	public WebElement getClickOnCheckoutbutton() {
		return ClickOnCheckoutbutton;
	}

}
