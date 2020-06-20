package inter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UrlTest {
	WebDriver driver;
	@BeforeClass
	public void t1() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\navi4\\OneDrive\\Desktop\\geckodriver.exe");
		driver = new FirefoxDriver();
		
	}
	
	@DataProvider(name ="urlData")
	public Object[][] getUrls (){
		
		Object [][] urls = {
				{"https://www.google.com"},{"aaa"},{"https://www.yahoo.com"}
				
		};
		return urls;
		
	}
	
	@Test(dataProvider="urlData")
	public void urlTest(String url) {
		driver.get(url);
		
		
	}

}
