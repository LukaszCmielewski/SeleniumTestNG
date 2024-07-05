package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class HomePage extends BasePage {
    @FindBy(id = "user-name")
    WebElement userNameInput;
    @FindBy(id = "password")
    WebElement passwordInput;
    @FindBy(id = "login-button")
    WebElement loginButton;

    @FindBy(css = ".login_logo")
    WebElement loginLogo;

    @FindBy(css = ".error-button")
    WebElement errorButton;

    public HomePage() throws IOException {
        super();
    }

    public void openHomePage() {

    }

    public InventoryPage loginUser(String userName, String passwd) throws IOException {
        userNameInput.sendKeys(userName);
        passwordInput.sendKeys(passwd);
        loginButton.click();
        return new InventoryPage();
    }
}
