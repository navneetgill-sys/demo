package artspackage;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Basepackage.BaseTest;
import Homepackage.HomePage;

public class ArtsTest extends BaseTest{
	HomePage homePage;
   ArtsPage artsPage;
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
 
   
}}
