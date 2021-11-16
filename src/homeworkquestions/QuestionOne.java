package homeworkquestions;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class QuestionOne extends BaseTest
{
    String url="https://www.google.com/";
    @Before
    public void openUp()
    {
        openBrowser(url);
    }
    @Test
    public void navigateComputers()
    {

        driver.findElement(By.name("q")).sendKeys("demo nopCommerce Store");
        driver.findElement(By.name("btnK")).click();
        driver.findElement(By.xpath("//h3[(text()='nopCommerce demo store')]")).click();
        //finding web element by xpath.
        WebElement computersLink = driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
        computersLink.click();
    }


    @Test
    public void navigateElectronics()
    {

        driver.findElement(By.name("q")).sendKeys("demo nopCommerce Store");
        driver.findElement(By.name("btnK")).click();
        driver.findElement(By.xpath("//h3[(text()='nopCommerce demo store')]")).click();
        //finding web element by xpath.
        WebElement electronicsLink = driver.findElement(By.xpath("//a[contains(text(),'Electronics')]"));
        electronicsLink.click();
    }
    @Test
    public void navigateApparel()
    {

        driver.findElement(By.name("q")).sendKeys("demo nopCommerce Store");
        driver.findElement(By.name("btnK")).click();
        driver.findElement(By.xpath("//h3[(text()='nopCommerce demo store')]")).click();
        //finding web element by xpath.
        WebElement apparelLink=driver.findElement(By.xpath("//a[contains(text(),'Apparel')]"));
        apparelLink.click();

    }
    @Test
    public void navigateDigitalDownloads()
    {

        driver.findElement(By.name("q")).sendKeys("demo nopCommerce Store");
        driver.findElement(By.name("btnK")).click();
        driver.findElement(By.xpath("//h3[(text()='nopCommerce demo store')]")).click();
        //finding web element by xpath.
        WebElement digitalDownloadsLink=driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]"));
        digitalDownloadsLink.click();
    }
    @Test
    public void navigateBooks()
    {

        driver.findElement(By.name("q")).sendKeys("demo nopCommerce Store");
        driver.findElement(By.name("btnK")).click();
        driver.findElement(By.xpath("//h3[(text()='nopCommerce demo store')]")).click();
        //finding web element by xpath.
        WebElement booksLink=driver.findElement(By.xpath("//a[contains(text(),'Books')]"));
        booksLink.click();
    }
    @Test
    public void navigateJewellery()
    {

        driver.findElement(By.name("q")).sendKeys("demo nopCommerce Store");
        driver.findElement(By.name("btnK")).click();
        driver.findElement(By.xpath("//h3[(text()='nopCommerce demo store')]")).click();
        //finding web element by xpath.
        WebElement jewelleryLink=driver.findElement(By.xpath("//a[contains(text(),'Jewelry')]"));
        jewelleryLink.click();
    }
    @Test
    public void navigateGiftCards()
    {

        driver.findElement(By.name("q")).sendKeys("demo nopCommerce Store");
        driver.findElement(By.name("btnK")).click();
        driver.findElement(By.xpath("//h3[(text()='nopCommerce demo store')]")).click();
        //finding web element by xpath.
        WebElement giftsCardsLink=driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]"));
        giftsCardsLink.click();
    }

    @After
    public void closeDown()
    {
        closeBrowser();
    }

}
