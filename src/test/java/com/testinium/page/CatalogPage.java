package com.testinium.page;

import com.testinium.method.Methods;
import org.openqa.selenium.By;

public class CatalogPage {
    Methods methods;
    public CatalogPage(){
        methods=new Methods();
    }

    public void pointCatalogPage(){
        methods.click(By.cssSelector("div.lvl1catalog"));
        methods.waitBysecond(2);
    }

    public void classicSection(){
methods.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
methods.waitBysecond(2);

    }

    public void selectText(){

        methods.selectByText(By.xpath("//div[@class='sort']/select"),"Yüksek Oylama");
        methods.waitBysecond(2);
    }

    public void clickBooks(){
        methods.click(By.xpath("//span[@class='mn-strong common-sprite' and text()='Tüm Kitaplar']"));
        methods.waitBysecond(2);
    }
    public void clickHobby(){
        methods.click(By.xpath("//a[@class='mn-icon icon-angleRight' and text()='Hobi']"));
        methods.waitBysecond(3);
}

}
