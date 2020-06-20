package activitypackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AutoIt2 {
	public  WebDriver driver;

	@Test
	public void t1() throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\navi4\\OneDrive\\Desktop\\geckodriver.exe");
		driver = new FirefoxDriver();
	   
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//div[@id='uploadBtnCont']")).click();
		 Runtime runtime = Runtime.getRuntime();
		 runtime.exec("C:\\Users\\navi4\\OneDrive\\Desktop\\vin.exe");

}
}