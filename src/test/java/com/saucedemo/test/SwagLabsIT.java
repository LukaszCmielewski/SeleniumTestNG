package com.saucedemo.test;

import com.saucedemo.pages.CheckoutCompletePage;
import com.saucedemo.pages.CheckoutStepTwoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SwagLabsIT extends ShopTest {

    @Test
    public void goToAboutPageTest() throws IOException {
        String careersTestLink = inventoryPage.clickAboutMenu().getCareersTestLink();
        Assert.assertEquals(careersTestLink, "Careers");
    }

    @Test
    public void checkEmptyCartSizeTest() throws IOException {
        int cartSize = inventoryPage.getCartSize();
        Assert.assertEquals(cartSize, 0);
    }

    @Test
    public void checkOneProductinCartSizeTest() throws IOException {
        int cartSize = inventoryPage.clickRandomProduct().getCartSize();
        Assert.assertEquals(cartSize, 1);
    }

    @Test
    public void checkAddRemoveProductInCartSizeTest() throws IOException {

        int cartSize = inventoryPage.clickRandomProduct().getCartSize();
        Assert.assertEquals(cartSize, 1);
        cartSize = inventoryPage.clickRandomProduct().getCartSize();
        Assert.assertEquals(cartSize, 2);
        cartSize = inventoryPage.clickRemoveButtons().getCartSize();
        Assert.assertEquals(cartSize, 0);
    }

    @Test
    public void buyTwoProductsTest() throws IOException {
        CheckoutStepTwoPage checkoutStepTwoPage = inventoryPage.addRedTShirtToCart()
                                                               .addBoltTShirtToCart()
                                                               .goToCart()
                                                               .goToCheckout().checkoutClick("Fname", "Lname", "54029");
        Assert.assertEquals(checkoutStepTwoPage.getSizeOfProducts(), 2);
        CheckoutCompletePage checkoutCompletePage = checkoutStepTwoPage.finishClick();

        checkoutCompletePage.backHome();
    }
}
