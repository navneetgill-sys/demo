package sciencepackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Basepackage.BasePage;
import culturepackage.CulturePage;

public class SciencePage  extends BasePage{
	@FindBy(xpath="//a[contains(text(),'Culture')]")
	WebElement cultureLink;
	
	public boolean iscultureLinkPresent() {
		  return isElementPresent(cultureLink);
}
	public CulturePage navigatoToCulturesPage() {
		cultureLink.click();
		return  new CulturePage();
	

}
}