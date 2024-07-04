package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class CheckoutPage extends MenuPage{
    public CheckoutPage() throws IOException {
        super();
    }
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

    public CheckoutStepTwoPage continueClick(String fname, String lname, String postalcode) throws IOException {
        firstNameInput.sendKeys(fname);
        lastNameInput.sendKeys(lname);
        postalCodeInput.sendKeys(postalcode);
        continueButton.click();
        return new CheckoutStepTwoPage();
    }
}
