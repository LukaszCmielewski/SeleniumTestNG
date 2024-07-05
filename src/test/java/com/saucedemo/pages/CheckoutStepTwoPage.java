package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.util.List;

public class CheckoutStepTwoPage extends MenuPage {
    @FindBy(id = "finish")
    WebElement finishButton;
    @FindBy(id = "cancel")
    WebElement cancelButton;
    @FindBy(css = "div.summary_total_label")
    WebElement totalPriceLabel;
    @FindBy(css = "div.summary_tax_label")
    WebElement totalTaxLabel;
    @FindBy(css = "div.inventory_item_name")
    List<WebElement> listProductLabels;
    @FindBy(css = "div.inventory_item_price")
    List<WebElement> listPriceProductLabels;

    public CheckoutStepTwoPage() throws IOException {
        super();
    }

    public int getSizeOfProducts() {
        return listProductLabels.size();
    }

    public CheckoutCompletePage finishClick() throws IOException {
        finishButton.click();
        return new CheckoutCompletePage();
    }
}
