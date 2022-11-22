package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility extends BaseTest {
    //this method will click on element
    public void clickOnElement(By by){
        driver.findElement(by).click();
    }

    //this method will send text to the field
    public void sendTextToElement(By by, String text){
        driver.findElement(by).sendKeys(text);
    }

    //this method will get text from the element
    public String getTextFromElement(By by){
        WebElement actualTextMessageFromElement = driver.findElement(by);
        return actualTextMessageFromElement.getText();
    }

}
