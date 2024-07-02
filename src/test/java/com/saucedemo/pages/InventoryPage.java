package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class InventoryPage extends BasePage{
    public InventoryPage() throws IOException {
        super();
    }
    @FindBy(css = ".title")
    WebElement titleText;

    public String returnTitle(){
        return titleText.getText();
    }
}
