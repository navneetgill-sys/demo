package healthpackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Basepackage.BasePage;
import activitypackage.ActivityPage;
import artspackage.ArtsPage;

public class HealthPage extends BasePage {
	@FindBy(xpath="//a[contains(text(),'History')]")
	WebElement historyLink;
	
	public boolean ishistoryLinkPresent() {
		  return isElementPresent(historyLink);
}
	public ArtsPage navigateToArtPage() {
		 driver.navigate().back();
	return new ArtsPage();

}
}