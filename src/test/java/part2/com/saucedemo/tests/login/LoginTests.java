package part2.com.saucedemo.tests.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class LoginTests extends BaseTest {
    @Test
    public void testLoginErrorMessage(){
        loginpage.setUsername("standard_user");
        loginpage.setPassword("xyz3400");
        loginpage.clickLoginButton();
        String actualMessage=loginpage.getErrorMessage();
        Assert.assertTrue(actualMessage.contains("Epic sadface"));
    }
}
