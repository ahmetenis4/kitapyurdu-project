package com.testinium.test;

import com.testinium.page.*;
import driver.BaseTest;
import org.junit.Test;

public class MainTest extends BaseTest {
    @Test

    public void mainTest(){

        LoginPage loginPage=new LoginPage();
        loginPage.login();

        ProductPage productPage=new ProductPage();
        productPage.product();
        productPage.scroll();
        productPage.favorites();
        productPage.backHome();

        CatalogPage catalogPage=new CatalogPage();
        catalogPage.pointCatalogPage();
        catalogPage.classicSection();
        catalogPage.selectText();
        catalogPage.clickBooks();
        catalogPage.clickHobby();

        BasketPage basketPage=new BasketPage();
        basketPage.randomProduct();
        basketPage.clickList();
        basketPage.goFavorites();
        basketPage.goBasket();

        AddressPage addressPage=new AddressPage();
        addressPage.address();

        CartPage cartPage=new CartPage();
        cartPage.addCart();
    }
}
