package Homepackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Basepackage.BasePage;
import artspackage.ArtsPage;
import sciencepackage.SciencePage;

public class HomePage extends BasePage {
	@FindBy(xpath="//a[contains(text(),'Main Page')]")
	WebElement mainPage;

	@FindBy(xpath="//a[contains(text(),'Arts')]")
	WebElement artsLink;
	@FindBy(xpath="//a[contains(text(),'Science')]")
	WebElement scienceLink;
	
	@FindBy(xpath="//a[contains(text(),'History')]")
	WebElement historyLink;
	
	public boolean ismainPagePresent() {
	return isElementPresent(mainPage);
	}
	
	public boolean isartsLinkPresent() {
		return isElementPresent(artsLink);
		
	}
	public boolean isscienceLinkPresent() {
		return isElementPresent(scienceLink);
	}
	public boolean ishistoryLinkPresent() {
		return isElementPresent(historyLink);
		
	
	}
	
	public ArtsPage navigatoToArtsPage() {
		artsLink.click();
		return  new ArtsPage();
	}
	public SciencePage navigatoSciencePage() {
		scienceLink.click();
		return  new SciencePage();
	
	
	
	
	
	
	
	
	
	
	
}}
