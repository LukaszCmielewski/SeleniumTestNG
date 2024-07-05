package com.saucedemo.test;

import com.saucedemo.pages.*;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class ShopTest extends BaseTest {
    protected InventoryPage inventoryPage;

    @BeforeMethod
    public void setup() throws IOException {
        super.setup();
        inventoryPage = new HomePage().loginUser("standard_user", "secret_sauce");
    }

    public CartPage goToCart(int amountOfProducts) throws IOException {
        logger.info("Add "+amountOfProducts+ " products");
        for (int i = 0; i < amountOfProducts; i++)
            inventoryPage.clickRandomProduct().getCartSize();

        return inventoryPage.goToCart();
    }
}
