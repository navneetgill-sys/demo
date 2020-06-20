package culturepackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Basepackage.BasePage;
import sciencepackage.SciencePage;

public class CulturePage extends BasePage{
	@FindBy(xpath="//a[contains(text(),'Nature')]")
	WebElement natureLink;
	public boolean isnatureLinkPresent() {
		  return isElementPresent(natureLink);
	}
	public SciencePage navigateToSciencePage() {
			  driver.navigate().back();
			  return new SciencePage();
		  }
}

