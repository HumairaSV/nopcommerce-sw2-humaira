package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        //click on the Computers link
        clickOnElement(By.linkText("Computers"));
        //declaring the variable for expected tab name  from requirements
        String expectedTabName = "Computers";
        //getting the actual message from the element
        String actualTabName = getTextFromElement(By.xpath("//div[@class = 'page-title']/h1[text() = 'Computers']"));
        //verifying the text for the tab
        Assert.assertEquals("Not navigated to Computers tab", expectedTabName, actualTabName);

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //click on the Electronics link
        clickOnElement(By.linkText("Electronics"));
        //declaring the variable for expected tab name  from requirements
        String expectedTabName = "Electronics";
        //getting the actual message from the element
        String actualTabName = getTextFromElement(By.xpath("//div[@class = 'page-title']/h1[text() = 'Electronics']"));
        //verifying the text for the tab
        Assert.assertEquals("Not navigated to Electronics page", expectedTabName, actualTabName);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {

        //click on the Apparel link
        clickOnElement(By.linkText("Apparel"));
        //declaring the variable for expected tab name  from requirements
        String expectedTabName = "Apparel";
        //getting the actual message from the element
        String actualTabName = getTextFromElement(By.xpath("//div[@class = 'page-title']/h1[text() = 'Apparel']"));
        //verifying the text for the tab
        Assert.assertEquals("Not navigated to Apparel page", expectedTabName, actualTabName);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {

        //click on the Digital downloads link
        clickOnElement(By.linkText("Digital downloads"));
        //declaring the variable for expected tab name  from requirements
        String expectedTabName = "Digital downloads";
        //getting the actual message from the element
        String actualTabName = getTextFromElement(By.xpath("//div[@class = 'page-title']/h1[text() = 'Digital downloads']"));
        //verifying the text for the tab
        Assert.assertEquals("Not navigated to Digital downloads", expectedTabName, actualTabName);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        //click on the Books link
        clickOnElement(By.linkText("Books"));
        //declaring the variable for expected tab name  from requirements
        String expectedTabName = "Books";
        //getting the actual message from the element
        String actualTabName = getTextFromElement(By.xpath("//div[@class = 'page-title']/h1[text() = 'Books']"));
        //verifying the text for the tab
        Assert.assertEquals("Not navigated to Books tab", expectedTabName, actualTabName);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        //click on the Jewelry link
        clickOnElement(By.linkText("Jewelry"));
        //declaring the variable for expected tab name  from requirements
        String expectedTabName = "Jewelry";
        //getting the actual message from the element
        String actualTabName = getTextFromElement(By.xpath("//div[@class = 'page-title']/h1[text() = 'Jewelry']"));
        //verifying the text for the tab
        Assert.assertEquals("Not navigated to Jewelry tab", expectedTabName, actualTabName);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        //click on the Gift cards link
        clickOnElement(By.linkText("Gift Cards"));
        //declaring the variable for expected tab name  from requirements
        String expectedTabName = "Gift Cards";
        //getting the actual message from the element
        String actualTabName = getTextFromElement(By.xpath("//div[@class = 'page-title']/h1[text() = 'Gift Cards']"));
        //verifying the text for the tab
        Assert.assertEquals("Not navigated to Gift Cards tab", expectedTabName, actualTabName);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
