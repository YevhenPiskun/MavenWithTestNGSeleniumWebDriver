package smoke;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.assertTrue;

public class SimpleTest extends BaseTest {

    @Test
    public void navigateToRozetkaWebSiteAndSearchHeader() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        String mobilePhonesHeader = "Мобільні телефони";
        String page = "https://rozetka.com.ua/ua/mobile-phones/c80003/";
        WebDriver driver = new ChromeDriver();
        driver.get(page);
        WebElement element = driver.findElement(By.cssSelector("div.c-cols-inner-l > h1"));
        assertTrue(element.getText().equals(mobilePhonesHeader));
        driver.quit();
    }
}