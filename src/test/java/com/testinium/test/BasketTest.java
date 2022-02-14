package com.testinium.test;

import com.testinium.page.BasketPage;
import org.junit.Test;

public class BasketTest {

    @Test

    public void basketTest(){

        BasketPage basketPage=new BasketPage();

        basketPage.randomProduct();

        basketPage.clickList();

        basketPage.goFavorites();

        basketPage.goBasket();

    }
}
