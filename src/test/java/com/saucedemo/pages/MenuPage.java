package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.IOException;

public class MenuPage extends BasePage {
    public boolean chceckLeftMenu(){
        leftMenuButton.click();
        Assert.assertTrue(allItemsMenu.isDisplayed());
        Assert.assertTrue(aboutMenu.isDisplayed());
        Assert.assertTrue(logoutMenu.isDisplayed());
        Assert.assertTrue(resetAppStateMenu.isDisplayed());
        return true;
    }
    @FindBy(id = "react-burger-menu-btn")
    WebElement leftMenuButton;
    @FindBy(linkText = "All Items")
    WebElement allItemsMenu;
    @FindBy(linkText = "About")
    WebElement aboutMenu;
    @FindBy(id = "logout_sidebar_link")
    WebElement logoutMenu;
    @FindBy(id = "reset_sidebar_link")
    WebElement resetAppStateMenu;

    @FindBy(css = "div.app_logo")
    WebElement appLogo;
    @FindBy(css = "a.shopping_cart_link")
    WebElement cartLink;

    @FindBy(css = "span.title")
    WebElement titleText;

    @FindBy(linkText = "Twitter")
    WebElement twitterLink;
    @FindBy(linkText = "Facebook")
    WebElement facebookLink;
    @FindBy(linkText = "LinkedIn")
    WebElement linkedInLink;

    @FindBy(css = "div.footer_copy")
    WebElement footerCopy;

    public MenuPage() throws IOException {
        super();
    }

    public SauceLabsPage clickAboutMenu() throws IOException {
        leftMenuButton.click();
        aboutMenu.click();
        return new SauceLabsPage();
    }

    public HomePage clickLogoutLink() throws IOException {
        leftMenuButton.click();
        logoutMenu.click();
        return new HomePage();
    }

    public CartPage goToCart() throws IOException {
        cartLink.click();
        return new CartPage();
    }

    public String returnPageTitle() {
        return titleText.getText();
    }

    public boolean checkMenuElements(){
        Assert.assertTrue(footerCopy.isDisplayed());
        Assert.assertTrue(linkedInLink.isDisplayed());
        Assert.assertTrue(facebookLink.isDisplayed());
        Assert.assertTrue(twitterLink.isDisplayed());
        Assert.assertTrue(cartLink.isDisplayed());
        Assert.assertTrue(leftMenuButton.isDisplayed());
        Assert.assertTrue(appLogo.isDisplayed());
        Assert.assertTrue(chceckLeftMenu());
        return true;
    }
}
