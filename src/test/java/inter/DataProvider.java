package inter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DataProvider {
	WebDriver driver;

	@Test

	public void t1() {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\navi4\\OneDrive\\Desktop\\geckodriver.exe");
		driver = new FirefoxDriver();

		String[] keywords = { "https://www.google.com", "aaa", "https://www.yahoo.com"};
		for (String keyword : keywords) {
			driver.get(keyword);
WebElement searchBox = driver.findElement(By.name("q"));
searchBox.sendKeys(keyword);
searchBox.submit();
		}

	}

}
