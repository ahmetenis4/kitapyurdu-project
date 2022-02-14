package com.testinium.page;

import com.testinium.method.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CartPage {
    Methods methods;

    public CartPage(){

        methods=new Methods();

    }
        public void addCart(){

            methods.sendKeys(By.xpath("//input[@id='credit-card-owner']"), "Enis Parlar");
            methods.waitBysecond(3);
            methods.sendKeys(By.cssSelector(".form tr:nth-of-type(5) input:nth-of-type(1)"), "5506");
            methods.waitBysecond(3);
            methods.sendKeys(By.cssSelector("input:nth-of-type(2)"), "9001");
            methods.waitBysecond(3);
            methods.sendKeys(By.cssSelector("input:nth-of-type(3)"), "4020");
            methods.waitBysecond(3);
            methods.sendKeys(By.cssSelector("input:nth-of-type(4)"), "0105");
            methods.waitBysecond(3);
            methods.selectByText(By.cssSelector("#credit-card-expire-date-month"), "12");
            methods.waitBysecond(3);
            methods.selectByText(By.cssSelector("#credit-card-expire-date-year"), "2024");
            methods.sendKeys(By.xpath("//input[@id='credit-card-security-code']"), "112");
            methods.waitBysecond(3);
            WebElement basketCheckBox1 = methods.findElement(By.cssSelector("[for='credit-card-is-3ds']"));
            basketCheckBox1.click();
            methods.click(By.xpath("//button[@id='button-checkout-continue']"));
            methods.waitBysecond(3);
            WebElement basketCheckBox = methods.findElement(By.cssSelector("[name='agree']"));
            basketCheckBox.click();
            methods.waitBysecond(4);
            methods.click(By.xpath("//input[@class='button']"));
            methods.waitBysecond(5);
            methods.click(By.xpath("//img[@alt='kitapyurdu.com']"));
            methods.waitBysecond(2);
            methods.mouseHover(By.cssSelector(".login.menu.top"));
            methods.waitBysecond(2);
            methods.click(By.cssSelector(".login ul li:nth-of-type(4)"));
            methods.waitBysecond(3);


        }
}