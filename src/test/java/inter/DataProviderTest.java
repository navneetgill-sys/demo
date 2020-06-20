package inter;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	WebDriver driver;
	@BeforeSuite
	public void init() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\navi4\\OneDrive\\Desktop\\geckodriver.exe");
		driver = new FirefoxDriver();
		

}
	@DataProvider(name="credentials")
	public Object[][] getCredentials() {
		Object[][] credentials= { { "admin","admin" }, { "hello","hello" }, { "akash","akash" }

		};
		return credentials;
	}
	@Test(dataProvider="credentials")
	public void t2(String username ,String password) {
		driver.get("http://mishoppingkart.com/ShoppingCart/login");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		assertTrue(driver.findElements(By.linkText("Logout")).size()>0,"Login Failed");


		
		System.out.println("userName is :"  +username   +password);
		
		
	}
	
	
}