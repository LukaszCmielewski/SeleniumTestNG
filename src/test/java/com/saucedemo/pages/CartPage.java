package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class CartPage extends MenuPage {
    public CartPage() throws IOException {
        super();
    }

    @FindBy(id = "continue-shopping")
    WebElement continueShopingButton;
    @FindBy(id = "checkout")
    WebElement checkoutButton;

}
