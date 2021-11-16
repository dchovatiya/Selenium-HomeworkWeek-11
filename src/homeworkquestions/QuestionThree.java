package homeworkquestions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.time.Duration;

public class QuestionThree extends BaseTest
{
    String url="http://automationpractice.com/index.php";

    @Before
    public void openUp()
    {
        openBrowser(url);
    }
    @Test
    public void signIn()
    {
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).sendKeys("dchovatiya@yahoo.com");
        driver.findElement(By.id("passwd")).sendKeys("alksdjfh");
        driver.findElement(By.name("SubmitLogin")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));


    }
    @After
    public void closeDown()
    {
        closeBrowser();
    }

}
