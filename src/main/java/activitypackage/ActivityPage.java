package activitypackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Basepackage.BasePage;
import Homepackage.HomePage;
import artspackage.ArtsPage;

public class ActivityPage extends BasePage {
	@FindBy(xpath="//a[contains(text(),'Human activities')]")
	WebElement humanActivitiesLink;

	public boolean ishumanActivitiesLinkPresent() {
		  return isElementPresent(humanActivitiesLink);
}
	public ArtsPage navigateToHomePage() {
		  driver.navigate().back();
		  return new ArtsPage();
	  }
	
}
