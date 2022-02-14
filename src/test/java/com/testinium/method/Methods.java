package com.testinium.method;

import driver.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Methods {

    WebDriver driver;
    FluentWait<WebDriver> wait;
    JavascriptExecutor jsdriver;


    public Methods(){

        driver=BaseTest.driver;
        wait=new FluentWait<WebDriver>(driver);
        jsdriver=(JavascriptExecutor) driver;

        //3 sn ile tekrarlı şekilde elementi arasın ,30 sn içinde bulamassa fail versin.
        wait.withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class);

    }
    public WebElement findElement(By by){
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
}

    public void click(By by){
        findElement(by).click();
}

    public void sendKeys(By by, String text){

        findElement(by).sendKeys(text);


    }

          // Bekleme methodu
    public void waitBysecond(long seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (Exception e){
            e.printStackTrace();
        }

}     // Sayfada görünür olduğumuzu gösteren method
    public boolean isElementVisible(By by){

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));

            return true;

        }catch (Exception e){
            return false;
        }

}   public void scrollWithAction(By by){
        Actions actions=new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }
    public void scrollWithJs(By by){
        jsdriver.executeScript("arguments[0].scrollIntoView();",findElement(by));
    }
public List<WebElement> findAll(By by){
        return driver.findElements(by);
}
    public void selectSome(By by, int index)
    {
        findAll(by).get(index).click();
    }

    // Herhangi bir box seçip içinde istenilen kısmı tıklama işlemi için..

    public Select getSelect(By by){
        return new Select(findElement(by));

    }

    public void selectByText(By by, String text){

        getSelect(by).selectByVisibleText(text);
    }

    public void randomSelect(By by) { //random seçme
        Random rand = new Random();
        findAll(by).get(rand.nextInt(findAll(by).size())).click();

    } // Yazılı ifadeyi siler
    public void clear(By by)
    {
        findElement(by).clear();
        }


    public void mouseHover(By by) {
        WebElement element = driver.findElement(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }
}