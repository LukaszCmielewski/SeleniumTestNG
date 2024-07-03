package com.saucedemo.test;

import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.InventoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SwagLabsTest extends BaseTest {
    @Test
    public void loginTest() throws IOException {
        InventoryPage inventoryPage = new HomePage().loginUser("standard_user", "secret_sauce");
        String title = inventoryPage.returnTitle();
        Assert.assertEquals(title, "Products");
    }

    @Test
    public void goToAboutPageTest() throws IOException {
        InventoryPage inventoryPage = new HomePage().loginUser("standard_user", "secret_sauce");
        String careersTestLink = inventoryPage.clickAboutMenu().getCareersTestLink();
        Assert.assertEquals(careersTestLink, "Careers");
    }
}
