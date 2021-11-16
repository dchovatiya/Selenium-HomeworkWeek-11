package homeworkquestions;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class QuestionFour extends BaseTest
{
    String url="https://opensource-demo.orangehrmlive.com";
    @Before
    public void openUp()
    {
        openBrowser(url);
    }
    @Test
    public void loginAndVerifyText()
    {
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[starts-with(@id,'btnLogin')]")).click();

       /* String expectedMsg="Welcome Paul!";
        WebElement message=driver.findElement(By.xpath("//font[contains(text(),'Welcome Paul')]"));
        String actualMsg=message.getText();
        Assert.assertEquals(expectedMsg,actualMsg);*/
        driver.findElement(By.xpath("//a[@id='welcome']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

        WebElement msg=driver.findElement(By.id("logInPanelHeading"));
        String expected="LOGIN Panel";
        String actual=msg.getText();
        Assert.assertEquals(expected,actual);
    }
    @After
    public void closeDown()
    {
        closeBrowser();
    }


}
