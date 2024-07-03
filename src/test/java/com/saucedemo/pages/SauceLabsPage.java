package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class SauceLabsPage extends BasePage{
    public SauceLabsPage() throws IOException {
        super();
    }
    @FindBy(linkText = "Careers")
    WebElement careersLink;

    public String getCareersTestLink(){
        return careersLink.getText();
    }
}
