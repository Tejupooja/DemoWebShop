package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[contains(text(),'Books')])[1]")
	private WebElement ClickonBooksMenu;

	public WebElement getClickonBooksMenu() {
		return ClickonBooksMenu;
	}

}
