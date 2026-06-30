package com.demoqa.pages;

import com.saucedemo.pages.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    private By formsCard =  By.xpath("//div[@id='app']//h5[text()='Forms']");
    public FormsPage goToForms(){
     click(formsCard);
     return newFormsPage();
    }
}
