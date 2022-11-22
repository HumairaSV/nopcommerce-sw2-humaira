package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //click on the login link
        clickOnElement(By.xpath("//a[@href = '/login?returnUrl=%2F']"));

        //declaring variable - this is from the requirement
        String expectedMessage = "Welcome, Please Sign In!";

        //getting the actual message from the element
        String actualMessage = getTextFromElement(By.xpath("//div[@class = 'page-title']/h1[text() = 'Welcome, Please Sign In!']"));

        //verifying the text for Login page
        Assert.assertEquals("Not navigated to the Login Page", expectedMessage, actualMessage);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //click on the login link
        clickOnElement(By.xpath("//a[@href = '/login?returnUrl=%2F']"));

        //sending email address to the email field
        sendTextToElement(By.name("Email"), "linda.smith_1@yahoo.com");

        //sending password to the password field
        sendTextToElement(By.name("Password"), "password123");

        //click on the login button
        clickOnElement(By.xpath("//button[@class = 'button-1 login-button']"));

        //declaring the variable for expected text from requirements
        String expectedDisplay = "Log out";

        //getting the actual message from the element
        String actualDisplay = getTextFromElement(By.linkText("Log out"));

        //verifying the 'Log out' text is displayed
        Assert.assertEquals("'Log out' text is not displayed", expectedDisplay, actualDisplay);

    }

    @Test
    public void verifyTheErrorMessage() {

        //click on the login link
        clickOnElement(By.xpath("//a[@href = '/login?returnUrl=%2F']"));

        //sending invalid email address to the email field
        sendTextToElement(By.xpath("//input[@name = 'Email']"), "linda.smith_2@yahoo.com");

        //sending invalid password to the password field
        sendTextToElement(By.xpath("//input[@name = 'Password']"), "password1234");

        //click on the login button
        clickOnElement(By.xpath("//button[@class = 'button-1 login-button']"));

        //declaring the variable for expected error  from requirements
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        //getting the actual error message from the element
        String actualErrorMessage = getTextFromElement(By.xpath("//form[@novalidate = 'novalidate']/div[text() ='Login was unsuccessful. Please correct the errors and try again.']"));

        //verifying the error message
        Assert.assertEquals("Login unsuccessful error message not displayed", expectedErrorMessage, actualErrorMessage);

    }


    @After
    public void tearDown() {
        closeBrowser();
    }


}
