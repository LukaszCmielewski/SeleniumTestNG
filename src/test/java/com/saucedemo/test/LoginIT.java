package com.saucedemo.test;

import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.InventoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginIT extends BaseTest {
    @Test
    public void loginTest() throws IOException {
        logger.info("loginTest");
        InventoryPage inventoryPage = new HomePage().loginUser("standard_user", "secret_sauce");
        String title = inventoryPage.returnTitle();
        Assert.assertEquals(title, "Products");
    }

    @Test
    public void loginLogoutTest() throws IOException {
        logger.info("loginLogoutTest");
        InventoryPage inventoryPage = new HomePage().loginUser("standard_user", "secret_sauce");
        String title = inventoryPage.returnTitle();
        Assert.assertEquals(title, "Products");
        inventoryPage.clickLogoutLink();
    }
}
