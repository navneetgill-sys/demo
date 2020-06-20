package homepackage;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Basepackage.BaseTest;
import Homepackage.HomePage;

public class HomeTest extends BaseTest {
	HomePage homePage;
	@Test
	public void mainPageLaunchTest()
	{
		homePage=new HomePage();
		assertTrue(homePage.ismainPagePresent(),"mainpage is present");
	}
}
