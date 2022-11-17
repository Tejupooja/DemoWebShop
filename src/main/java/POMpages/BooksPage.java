package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.Base_Test;

public class BooksPage extends Base_Test {
	public BooksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Computing and Internet")
	private WebElement ClickonComputinginternetbook;

	public WebElement getClickonComputinginternetbook() {
		return ClickonComputinginternetbook;
	}

	@FindBy(xpath = "//option[text()='Position']")
	private WebElement DropdownPosition;

	public WebElement getDropdownPosition() {
		return DropdownPosition;
	}

	@FindBy(xpath = "//option[text()='8']")
	private WebElement DisplayDropdown;

	public WebElement getDisplayDropdown() {
		return DisplayDropdown;
	}

	@FindBy(xpath = "//option[text()='Grid']")
	private WebElement ViewAsGrid;

	public WebElement getViewAsGrid() {
		return ViewAsGrid;
	}
}
