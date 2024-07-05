package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class MenuPage extends BasePage {
    @FindBy(id = "react-burger-menu-btn")
    WebElement rightMenuButton;
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
        rightMenuButton.click();
        aboutMenu.click();
        return new SauceLabsPage();
    }

    public HomePage clickLogoutLink() throws IOException {
        rightMenuButton.click();
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
}
