package com.testinium.test;

import com.testinium.page.CartPage;
import org.junit.Test;

public class CartTest {
    @Test
    public void cartTest(){

        CartPage cartPage=new CartPage();
        cartPage.addCart();

    }
}
