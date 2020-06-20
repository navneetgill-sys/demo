package sciencepackage;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Homepackage.HomePage;
import artspackage.ArtsPage;
import culturepackage.CulturePage;
import homepackage.HomeTest;

public class ScienceTest extends HomeTest{
	HomePage homePage;
	   ArtsPage artsPage;
	   SciencePage sciencePage;
	   CulturePage culturePage;
	   @Test
		public void mainPageLaunchTest()
		{
			homePage=new HomePage();
			assertTrue(homePage.ismainPagePresent(),"mainpage is present");
		}
	   @Test(dependsOnMethods="mainPageLaunchTest")
	  public void histortLinkPresent() {
		artsPage = homePage.navigatoToArtsPage();
				assertTrue(artsPage.iscultureLinkPresent(),"artpage present");
	  }
	   @Test(dependsOnMethods="histortLinkPresent")
	  public void navigateToHomePage() {
		homePage=   artsPage.navigateToHomePage();
		assertTrue(homePage.ismainPagePresent(),"homepage present");
	 
	   
	}
	   @Test(dependsOnMethods="navigateToHomePage")
	   public void navigateToSciencePage() {
		sciencePage= homePage.navigatoSciencePage();
	   
		assertTrue(sciencePage.iscultureLinkPresent(),"science page loaded");
}
	   @Test(dependsOnMethods="navigateToSciencePage")
	   public void navigateToCulturePage() {
		  culturePage= sciencePage.navigatoToCulturesPage();
		  assertTrue(culturePage.isnatureLinkPresent(),"culture page loaded");
	   }
	   @Test(dependsOnMethods="navigateToCulturePage")
	   public void navigateToMainPage() {
		sciencePage= culturePage.navigateToSciencePage();
	   
	   assertTrue(sciencePage.iscultureLinkPresent(),"main page loaded");

}}
