package com.saucedemo.test;

import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.InventoryPage;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class ShopTest extends BaseTest {
    protected InventoryPage inventoryPage;

    @BeforeMethod
    public void setup() throws IOException {
        super.setup();
        inventoryPage = new HomePage().loginUser("standard_user", "secret_sauce");
    }
}
