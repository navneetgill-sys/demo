package inter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDataProvider {
	WebDriver driver;
	@BeforeSuite
	public void init() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\navi4\\OneDrive\\Desktop\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://mishoppingkart.com/ShoppingCart/");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@DataProvider(name ="credentials")
	public Object[][] login() {
		Object[][] loginData = { { "sss","snn" }, { "aaa","eee" }, { "admin","admin" }

		};
		return loginData;
	}
	
	@Test(dataProvider="credentials")
	public void login(String username, String password) {
		driver.findElement(By.xpath("//span[@class=\"glyphicon glyphicon-log-in\"]")).click();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	}


}
	