package Basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	public  WebDriver driver;

@BeforeSuite
public void bS() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\navi4\\OneDrive\\Desktop\\geckodriver.exe");
	driver = new FirefoxDriver();
    BasePage.driver= driver;
	driver.get("https://en.wikipedia.org/wiki/Main_Page");
}
 @AfterSuite
 public void tearDown() {
	 
	  driver.quit();

}
}
