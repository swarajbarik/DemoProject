package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import locators.BaseLocators;

public class BasePage {
	public static WebDriver driver;
	
	public  void initBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
	}

	public void navigateToManuItem(String menu) {
		driver.findElement(By.xpath(BaseLocators.MENU_ITEM)).click();
	}

	public void openUrl(String url) {
		driver.get(url);
	}
}
