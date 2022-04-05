package pages;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import locators.BaseLocators;

public class BasePage {
    public static WebDriver driver;

    public void initBrowser(String browser) {

        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "lib/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
    }

    public void openUrl(String url) {
        driver.get(url);
    }

    public void validateTheMenu(List<String> expected) {
        List<WebElement> allLinks = driver.findElements(By.xpath(BaseLocators.MENU_ITEMS));
        List<String> actual = new ArrayList<String>();

        for (WebElement link : allLinks) {
            actual.add(link.getText());
        }
        assertEquals(expected, actual);
    }

    public void clickOnDismiss() {
        driver.findElement(By.xpath(BaseLocators.DISMISS)).click();
    }

}
