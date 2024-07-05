package com.saucedemo.test;

import com.saucedemo.pages.CartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Random;

public class CartIT extends ShopTest{
    @Test
    public void cartWithoutProductsTest() throws IOException {
        CartPage cartPage = goToCart(0);
        Assert.assertEquals(cartPage.getSizeOfCart(),0);
        Assert.assertTrue(cartPage.checkMenuElements());
    }

    @Test
    public void cartWithOneProduct() throws IOException {
        CartPage cartPage = goToCart(4);
        Assert.assertEquals(cartPage.getSizeOfCart(),4);
        Assert.assertTrue(cartPage.checkMenuElements());
    }

    @Test
    public void clearCartbyRemoveButton() throws IOException {
        CartPage cartPage = goToCart(5);
        Assert.assertEquals(cartPage.getSizeOfCart(),5);
        cartPage.clickAllRemoveButton();
        Assert.assertEquals(cartPage.getSizeOfCart(),0);
    }
    @Test
    public void checkMenuElementsTest() throws IOException {
        Random rand = new Random();
        CartPage cartPage = goToCart(rand.nextInt(6));
        Assert.assertTrue(cartPage.checkMenuElements());
        Assert.assertTrue(cartPage.checkCartElements());
    }
}
