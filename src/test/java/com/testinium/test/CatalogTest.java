package com.testinium.test;

import com.testinium.method.Methods;
import com.testinium.page.CatalogPage;
import org.junit.Test;

    public class CatalogTest {
@Test

    public void catalogTest(){
    CatalogPage catalogPage=new CatalogPage();
    catalogPage.pointCatalogPage();

    catalogPage.classicSection();

    catalogPage.selectText();

    catalogPage.clickBooks();

    catalogPage.clickHobby();


        }


}
