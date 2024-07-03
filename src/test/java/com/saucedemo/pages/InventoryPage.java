package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class InventoryPage extends BasePage {
    @FindBy(css = ".title")
    WebElement titleText;

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

    @FindBy(id = "react-burger-menu-btn")
    WebElement rightMenuButton;
    @FindBy(linkText = "All Items")
    WebElement allItemsMenu;
    @FindBy(linkText = "About")
    WebElement aboutMenu;
    @FindBy(id="logout_sidebar_link")
    WebElement logoutMenu;

    public InventoryPage() throws IOException {
        super();
    }

    public InventoryPage goToInventoryPage(){
        driver.get("https://www.saucedemo.com/inventory.html");
        return this;
    }

    public String returnTitle() {
        return titleText.getText();
    }

    public SauceLabsPage clickAboutMenu() throws IOException {
        rightMenuButton.click();
        aboutMenu.click();
        return new SauceLabsPage();
    }
}
