package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public ResultElement getHeader() {
        driver.findElement(By.cssSelector("h1.catalog-heading"));
        return new ResultElement(driver);
    }
}