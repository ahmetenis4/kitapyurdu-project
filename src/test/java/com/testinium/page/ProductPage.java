package com.testinium.page;

import com.testinium.method.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage {
    Methods methods;

    public ProductPage(){
        methods=new Methods();
    }
    public void product(){

        methods.sendKeys(By.id("search-input"),"Oyuncak");
        methods.waitBysecond(3);
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBysecond(3);

    } public void scroll(){

        methods.scrollWithAction(By.cssSelector("div[class='scrollbox rating-filters']"));
        methods.waitBysecond(3);

    }
    public void favorites(){

        for (int i=3; i<7; i++){

        methods.selectSome(By.cssSelector(".add-to-favorites"),i);
        methods.waitBysecond(3);
            Assert.assertTrue(methods.isElementVisible(By.cssSelector(".swal2-success-ring")));

        }

}   public void backHome(){
        methods.click(By.className("logo-icon"));
        methods.waitBysecond(3);
    }
    }

