package com.testinium.page;

import com.testinium.method.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class AddressPage {


      Methods methods;
      Logger logger= LogManager.getLogger(AddressPage.class);

   public AddressPage(){

    methods=new Methods();

}  public void address(){
        methods.click(By.xpath("//a[.='Yeni bir adres kullanmak istiyorum.']"));
        methods.waitBysecond(2);
        methods.sendKeys(By.id("address-firstname-companyname"), "Enis");
        methods.waitBysecond(1);
        methods.sendKeys(By.id("address-lastname-title"), "Parlar");
        methods.waitBysecond(1);
        methods.selectByText(By.cssSelector("#address-zone-id"), "İstanbul");
        methods.waitBysecond(2);
        methods.selectByText(By.xpath("//select[@id='address-county-id']"), "ÜMRANİYE");
        methods.waitBysecond(1);
        methods.sendKeys(By.cssSelector("#address-address-text"), "Altın mah. 2344.sokak");
        methods.waitBysecond(1);
        methods.sendKeys(By.cssSelector("#address-telephone"), "3229812333");
        methods.waitBysecond(2);
        methods.sendKeys(By.cssSelector("#address-mobile-telephone"), "5324556634");
        methods.waitBysecond(1);
        methods.click(By.cssSelector("#button-checkout-continue"));
        methods.waitBysecond(2);
        methods.click(By.cssSelector("#button-checkout-continue"));
        methods.waitBysecond(3);

      }


}
