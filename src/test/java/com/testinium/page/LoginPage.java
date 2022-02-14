package com.testinium.page;

import com.testinium.method.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {

    Methods methods;

    public LoginPage(){
        methods=new Methods();
    }

    public void login(){

        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBysecond(4);
        methods.sendKeys(By.id("login-email"),"ahmetenis.parlar@outlook.com");
        methods.waitBysecond(3);
        methods.sendKeys(By.id("login-password"),"1q2w3e4r5t");
        methods.click(By.cssSelector("button[class='ky-btn ky-btn-orange w-100 ky-login-btn']"));
        methods.waitBysecond(3);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//h1[@class='section']")));
    }

}
