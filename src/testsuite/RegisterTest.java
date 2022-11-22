package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class RegisterTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        //click on the Register link
        clickOnElement(By.xpath("//a[text()= 'Register']"));
        //declaring the variable for expected text from requirements
        String expectedText = "Register";
        //getting the actual message from the element
        String actualText = getTextFromElement(By.xpath("//div[@class = 'page-title']/h1[text() = 'Register']"));
        //verifying the 'Register' text is displayed
        Assert.assertEquals("'Log out' text is not displayed", expectedText, actualText);

    }

    @Test
    public void userSholdRegisterAccountSuccessfully(){
        //click on the Register link
        clickOnElement(By.xpath("//a[text()= 'Register']"));

        //selecting the gender using radio button
        clickOnElement(By.xpath("//input[@id='gender-female']"));
        //sending data to the First name field
        sendTextToElement(By.xpath("//input[@id='FirstName']"), "Tester82810");
        //sending data to the Last name field
        sendTextToElement(By.xpath("//input[@id='LastName']"), "automatedTesters");
        //sending data to the Day field in Date of birth
        sendTextToElement(By.xpath("//select[@name = 'DateOfBirthDay']"), "20");
        //sending data to the Month field in Date of birth
        sendTextToElement(By.xpath("//select[@name = 'DateOfBirthMonth']"), "01");
        //sending data to the Year field in the date of birth
        sendTextToElement(By.xpath("//select[@name = 'DateOfBirthYear']"), "2001");
        //sending data to the email address field
        sendTextToElement(By.xpath("//input[@name = 'Email']"), "testerhv1234@gmail.com");
        //sending data to the password field
        sendTextToElement(By.xpath("//input[@name = 'Password']"), "password123");
        //sending data to the confirm password field
        sendTextToElement(By.xpath("//input[@name = 'ConfirmPassword']"), "password123");
        //click on the Register button to Register
        clickOnElement(By.xpath("//button[@name = 'register-button']"));
        //declaring the variable for expected text from requirements
       String expectedText = "Your registration completed";
        //getting the actual message from the element
       String actualText = getTextFromElement(By.xpath("//div[text()= 'Your registration completed']"));
        //verifying that registration was successful
        Assert.assertEquals("Registration was not successful", expectedText, actualText);

    }


    @After
    public void tearDown(){
        closeBrowser();
    }
}
