package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.util.List;
import java.util.Random;

public class InventoryPage extends MenuPage {


    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    WebElement add2CartFleeceJacketButton;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement add2CartBackpackButton;
    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement add2CartBoltTShirtButton;
    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    WebElement add2CartTShirtRedButton;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement add2CartBikeLightButton;
    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    WebElement add2CartOnesieButton;

    @FindBy(id = "remove-sauce-labs-fleece-jacket")
    WebElement removeFleeceJacketButton;
    @FindBy(id = "remove-sauce-labs-backpack")
    WebElement removeBackpackButton;
    @FindBy(id = "remove-sauce-labs-bolt-t-shirt")
    WebElement removeBoltTShirtButton;
    @FindBy(id = "remove-test.allthethings()-t-shirt-(red)")
    WebElement removeTShirtRedButton;
    @FindBy(id = "remove-sauce-labs-bike-light")
    WebElement removeBikeLightButton;
    @FindBy(id = "remove-sauce-labs-onesie")
    WebElement removeOnesieButton;

    @FindBy(css = ".inventory_item button.btn_secondary")
    List<WebElement> listRemoveButtons;
    @FindBy(css = ".inventory_item button.btn_primary")
    List<WebElement> listAddtoCartButtons;



    @FindBy(css = "span.shopping_cart_badge")
    List<WebElement> cartSize;

    public InventoryPage() throws IOException {
        super();
    }

    public InventoryPage goToInventoryPage() {
        driver.get("https://www.saucedemo.com/inventory.html");
        return this;
    }

    public String returnTitle() {
        return titleText.getText();
    }

    public int getCartSize() {
        if (cartSize.size() > 0) {
            return Integer.parseInt(cartSize.getFirst().getText());
        } else {
            return 0;
        }
    }

    public InventoryPage clickRandomProduct() {
        Random rand = new Random();
        listAddtoCartButtons.get(rand.nextInt(listAddtoCartButtons.size())).click();
        return this;
    }
    public InventoryPage clickRemoveButtons(){
        listRemoveButtons.forEach((btn)->{btn.click();});
        return this;
    }
}
