package Tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import POMpages.HomePage;
import genericLibrary.Base_Test;

public class HomePageTest extends Base_Test{
		@Test
		public void HomePageExecution() {
			HomePage home = new HomePage(driver);
			home.getClickonBooksMenu().click();
		    Reporter.log("Clicking on books menu");
		}
}
