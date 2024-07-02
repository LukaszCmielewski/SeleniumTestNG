package com.saucedemo.test;

import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.InventoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SwagLabsTest extends BaseTest{
    @Test
    public void loginTest() throws IOException {
        HomePage homePage = new HomePage();
        String title = homePage.loginUser("standard_user", "secret_sauce").returnTitle();
        Assert.assertEquals(title, "Products");
    }

}
