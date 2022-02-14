package com.testinium.page;

import com.testinium.method.Methods;
import org.openqa.selenium.By;

public class BasketPage {

    Methods methods;

    public BasketPage(){

        methods=new Methods();
    }

    public void randomProduct(){
        methods.randomSelect(By.xpath("//a[@class='pr-img-link']"));
        methods.waitBysecond(1);
        methods.click(By.xpath("//span[contains(text(),'Sepete Ekle')]"));
        methods.waitBysecond(2);
    }

    public void clickList(){
        methods.click(By.cssSelector(".menu.top.my-list"));
        methods.waitBysecond(2);
    }
    public void goFavorites(){
        methods.click(By.xpath("//a[@href='https://www.kitapyurdu.com/index.php?route=account/favorite&selected_tags=0']"));
        methods.waitBysecond(2);
        methods.click(By.xpath("//span[@class='display-item sprite sprite-icon-list-selected']"));
        methods.waitBysecond(5);
        methods.click(By.xpath("//div[@class='product-list']/div[3]//i[@class='fa fa-heart-o']"));
        methods.waitBysecond(5);

    }public void goBasket(){
        methods.click(By.id("sprite-cart-icon"));
        methods.waitBysecond(2);
        methods.click(By.id("js-cart"));
        methods.waitBysecond(3);
        methods.clear(By.xpath("//input[@style='width:22px']"));
        methods.waitBysecond(2);
        methods.sendKeys(By.xpath("//input[@style='width:22px']"),"2");
        methods.waitBysecond(2);
        methods.click(By.xpath("//i[@title='Güncelle']"));
        methods.waitBysecond(2);
        methods.click(By.xpath("//div[@class='right']/a"));
        methods.waitBysecond(2);

    }

}
