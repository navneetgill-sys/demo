package healthpackage;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Basepackage.BaseTest;
import Homepackage.HomePage;
import artspackage.ArtsPage;

public class HealthTest extends BaseTest {
	HomePage homePage;
	   ArtsPage artsPage;
	   HealthPage healthPage;
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
	   public void navigatetoHealthPage() {
		 healthPage=  artsPage.navigateToHealthPage();
		 assertTrue(healthPage.ishistoryLinkPresent(),"health page loaded");
	}
	   @Test(dependsOnMethods="navigatetoHealthPage")
	   public void navigateToArtsPage()
	   {
	artsPage=healthPage.navigateToArtPage() ;
	assertTrue(artsPage.iscultureLinkPresent(),"artspage loaded");
	
	   }
	   
	   @Test(dependsOnMethods="navigateToArtsPage")
	   public void navigateToHomePage() throws InterruptedException {
		homePage=   artsPage.navigateToHomePage();
		Thread.sleep(3000);
		System.out.print("homepage");
		assertTrue(homePage.isscienceLinkPresent(),"homepageloaded");
		
	   }


}


