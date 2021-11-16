package homeworkquestions;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.Random;

public class QuestionTwo extends BaseTest
{
    String url="https://demo.nopcommerce.com/";
    @Before
    public void openUp()
    {
        openBrowser(url);
    }
    @Test
    public void clickOnRegisterAndFillTheForm()
    {
        //finding web element by xpath
        WebElement registerLink=driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        registerLink.click();
        //finding by id

        WebElement maleRadioButton=driver.findElement(By.id("gender-male"));
        maleRadioButton.click();

        WebElement femaleRadioButton=driver.findElement(By.id("gender-female"));
        femaleRadioButton.click();

        WebElement firstName=driver.findElement(By.id("FirstName"));
        firstName.sendKeys("Dimple");

        WebElement lastName=driver.findElement(By.id("LastName"));
        lastName.sendKeys("Patel");

        //Using select class for selecting specific value from the dropdown
        Select day=new Select(driver.findElement(new By.ByName("DateOfBirthDay")));
        day.selectByIndex(26);
        Select month=new Select(driver.findElement(new By.ByName("DateOfBirthMonth")));
        month.selectByIndex(11);
        Select year=new Select(driver.findElement(new By.ByName("DateOfBirthYear")));
        year.selectByValue("1983");

        WebElement emailTxt=driver.findElement(By.id("Email"));
        Random random=new Random();
        int randomInt=random.nextInt(100);
        emailTxt.sendKeys("Dimple"+randomInt+"@yahoo.com");
        driver.findElement(By.name("Company")).sendKeys("Prime Testing");
        driver.findElement(By.name("Newsletter")).click();

        driver.findElement(By.id("Password")).sendKeys("**********");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("**********");
        driver.findElement(By.name("register-button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
    }
    @After
    public void closeDown()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
        closeBrowser();
    }

}
