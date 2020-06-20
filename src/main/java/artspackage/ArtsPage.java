package artspackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Basepackage.BasePage;
import Homepackage.HomePage;
import activitypackage.ActivityPage;
import healthpackage.HealthPage;
import historypackage.HistoryPage;

public class ArtsPage extends BasePage{
	@FindBy(xpath="//h1[@id='firstHeading']")
	WebElement portalArts;
	@FindBy(xpath="//a[contains(text(),'Activities')]")
	WebElement activitiesLink;
	@FindBy(xpath="//a[contains(text(),'Culture')]")
	WebElement cultureLink;
	@FindBy(xpath="//a[contains(text(),'History')]")
	WebElement historyLink;
	@FindBy(xpath="//a[contains(text(),'Health')]")
	WebElement healthLink;
	
	public boolean isHealthLinkPresent() {
		  return isElementPresent(healthLink);
		  
		  
	  }
  public HomePage navigateToHomePage() {
	  driver.navigate().back();
	  return new HomePage();
  }
  public boolean isactivitiesLinkPresent() {
	  return isElementPresent(activitiesLink);
  }
  
  public boolean iscultureLinkPresent() {
	  return isElementPresent(cultureLink);
  }
  public ActivityPage navigateToActivityPage() {
	  activitiesLink.click();
	  return  new ActivityPage();
	  
  }
  public HistoryPage navigateToHistoryPage() {
	  historyLink.click();
	  return new HistoryPage();
	  
  }
  public HealthPage navigateToHealthPage() {
	  healthLink.click();
	  return new HealthPage();
  }
 

  
  
  
}
