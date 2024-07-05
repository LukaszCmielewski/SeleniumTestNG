package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class CheckoutCompletePage extends MenuPage {
    @FindBy(id = "back-to-products")
    WebElement backInventory;
    @FindBy(id = "back-to-products")
    WebElement backHomeButton; //back to Inventory
    @FindBy(css = "h2.complete-header")
    WebElement completeHeaderLabel;
    @FindBy(css = "div.complete-text")
    WebElement completeTextLabel;
    @FindBy(css = "img.pony_express")
    WebElement OkImg;

    public CheckoutCompletePage() throws IOException {
        super();
    }

    public InventoryPage backHome() throws IOException {
        backHomeButton.click();
        return new InventoryPage();
    }
}
