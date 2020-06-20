package Basepackage;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	public static WebDriver driver;

	public BasePage() {
		PageFactory.initElements(driver, this);
    
	}
	public boolean isElementPresent(WebElement element) {
		boolean isElementLoaded= false;

		try {
			isElementLoaded= element.isDisplayed();
		} catch (NoSuchElementException e) {
			System.out.println("Element not found ");

		}
		return isElementLoaded;
	}

}
