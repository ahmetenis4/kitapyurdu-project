package com.testinium.test;

import com.testinium.page.ProductPage;
import driver.BaseTest;
import org.junit.Test;

public class ProductTest extends BaseTest {


    @Test

    public void productTest(){

        ProductPage productPage=new ProductPage();
        productPage.product();

    }

    @Test

    public void scrollTest(){

        ProductPage productPage=new ProductPage();
        productPage.scroll();
    }
    @Test

    public void favoritesTest(){
        ProductPage productPage=new ProductPage();
        productPage.favorites();

    }

}
