package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class CheckoutComplete extends MenuPage {
    @FindBy(id = "back-to-products")
    WebElement backInventory;

    public CheckoutComplete() throws IOException {
        super();
    }
}
