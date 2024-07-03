package com.saucedemo.test;

import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.InventoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SwagLabsTest extends BaseTest {
    @Test
    public void loginTest() throws IOException {
        logger.info("loginTest");
        InventoryPage inventoryPage = new HomePage().loginUser("standard_user", "secret_sauce");
        String title = inventoryPage.returnTitle();
        Assert.assertEquals(title, "Products");
    }

    @Test
    public void goToAboutPageTest() throws IOException {
        logger.info("goToAboutPageTest");
        InventoryPage inventoryPage = new HomePage().loginUser("standard_user", "secret_sauce");
        String careersTestLink = inventoryPage.clickAboutMenu().getCareersTestLink();
        Assert.assertEquals(careersTestLink, "Careers");
    }
    @Test
    public void loginLogoutTest() throws IOException {
        logger.info("loginLogoutTest");
        InventoryPage inventoryPage = new HomePage().loginUser("standard_user", "secret_sauce");
        String title = inventoryPage.returnTitle();
        Assert.assertEquals(title, "Products");
        inventoryPage.clickLogoutLink();

    }

    @Test
    public void checkEmptyCartSizeTest() throws IOException {
        logger.info("checkEmptyCartSizeTest");
        InventoryPage inventoryPage = new HomePage().loginUser("standard_user", "secret_sauce");
        int cartSize = inventoryPage.getCartSize();
        Assert.assertEquals(cartSize,0);
    }
    @Test
    public void checkOneProductinCartSizeTest() throws IOException {
        logger.info("checkOneProductinCartSizeTest");
        InventoryPage inventoryPage = new HomePage().loginUser("standard_user", "secret_sauce");
        int cartSize = inventoryPage.clickRandomProduct().getCartSize();
        Assert.assertEquals(cartSize,1);
    }

    @Test
    public void checkAddRemoveProductInCartSizeTest() throws IOException {
        logger.info("checkAddRemoveProductInCartSizeTest");
        InventoryPage inventoryPage = new HomePage().loginUser("standard_user", "secret_sauce");
        int cartSize = inventoryPage.clickRandomProduct().getCartSize();
        Assert.assertEquals(cartSize,1);
        cartSize = inventoryPage.clickRandomProduct().getCartSize();
        Assert.assertEquals(cartSize,2);
        cartSize = inventoryPage.clickRemoveButtons().getCartSize();
        Assert.assertEquals(cartSize,0);
    }

}
