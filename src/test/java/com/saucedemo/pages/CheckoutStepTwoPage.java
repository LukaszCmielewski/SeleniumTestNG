package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class CheckoutStepTwoPage extends MenuPage{
    public CheckoutStepTwoPage() throws IOException {
        super();
    }
    @FindBy(id = "finish")
    WebElement finishButton;
    @FindBy(id = "cancel")
    WebElement cancelButton;



}
