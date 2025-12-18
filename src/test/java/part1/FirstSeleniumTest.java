package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver driver;
    @BeforeClass
    public void  setUp(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void testLoggingIntoApplication(){
        WebElement username driver.findElement(By.name("username"));
        username.sendKeys("Admin");
    }
}
