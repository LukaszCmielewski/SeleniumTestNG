package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.util.List;

public class CartPage extends MenuPage {
    @FindBy(id = "continue-shopping")
    WebElement continueShopingButton;
    @FindBy(id = "checkout")
    WebElement checkoutButton;
    @FindBy(css = "div.inventory_item_name")
    List<WebElement> listProductLabels;
    @FindBy(css = "div.inventory_item_price")
    List<WebElement> listPriceProductLabels;

    public CartPage() throws IOException {
        super();
    }

    public InventoryPage continueShopping() throws IOException {
        continueShopingButton.click();
        return new InventoryPage();
    }

    public CheckoutPage goToCheckout() throws IOException {
        checkoutButton.click();
        return new CheckoutPage();
    }
}
