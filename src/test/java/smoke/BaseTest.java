package smoke;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import static com.testframework.DriverFactory.getChromeDriver;

public class BaseTest {

    public static final String BASE_URL = "https://rozetka.com.ua/ua/";
    static WebDriver driver;

    @Before
    public void setUp() {
        driver = getChromeDriver();
    }

    @After
    public void tearDown() {
        driver.close();
    }

//    @AfterTest
//    public void closeBrowser() {
//        driver.quit();
//    }
}