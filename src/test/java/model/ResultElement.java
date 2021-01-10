package model;

import org.openqa.selenium.WebDriver;

public class ResultElement {

    public WebDriver driver;

    public ResultElement(WebDriver driver){
        this.driver = driver;
    }

    public String findText(){
        return driver.getTitle();
    }
}