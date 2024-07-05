package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class CheckoutPage extends MenuPage {
    @FindBy(id = "continue")
    WebElement continueButton;
    @FindBy(id = "cancel")
    WebElement cancelButton;
    @FindBy(id = "first-name")
    WebElement firstNameInput;
    @FindBy(id = "last-name")
    WebElement lastNameInput;
    @FindBy(id = "postal-code")
    WebElement postalCodeInput;

    public CheckoutPage() throws IOException {
        super();
    }

    public CheckoutStepTwoPage checkoutClick(String fname, String lname, String postalCode) throws IOException {
        firstNameInput.sendKeys(fname);
        lastNameInput.sendKeys(lname);
        postalCodeInput.sendKeys(postalCode);
        continueButton.click();
        return new CheckoutStepTwoPage();
    }

    public CartPage cancelCheckout() throws IOException {
        cancelButton.click();
        return new CartPage();
    }
}
