package com.testinium.test;

import com.testinium.page.LoginPage;
import driver.BaseTest;
import org.junit.Test;

public class LoginTest extends BaseTest {

@Test

    public void loginTest(){
    LoginPage loginPage=new LoginPage();

    loginPage.login();

}

}
