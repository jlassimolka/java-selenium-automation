package part2.com.saucedemo.base;

import com.saucedemo.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;
    protected BasePage basePage;
    private String url="https://www.saucedemo.com";

    @BeforeClass
    public void setUp(){
        
    };
}
