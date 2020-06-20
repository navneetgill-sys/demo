package historypackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Basepackage.BasePage;

public class HistoryPage extends BasePage{
	@FindBy(xpath="//a[contains(text(),'Health')]")
	WebElement healthLink;
	
	public boolean isHealthLinkPresent() {
		  return isElementPresent(healthLink);
		  
		  
	  }
	
	
}
