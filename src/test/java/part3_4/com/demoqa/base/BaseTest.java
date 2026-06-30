package part3_4.com.demoqa.base;

import com.demoqa.pages.HomePage;
import com.saucedemo.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    private WebDriver driver;
    protected BasePage baspage;
    protected HomePage homePage;
    private String DEMOQA_URL ="https://demoqa.com/";

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @BeforeMethod

}
