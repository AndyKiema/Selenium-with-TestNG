package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Trialwithseleniumcode {
    @Test
    void login() throws InterruptedException {
        ChromeDriver cd=new ChromeDriver();
        cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        cd.get("https://resolve.vote/");
        cd.manage().window().maximize();
        WebElement pricing=cd.findElement(By.xpath("/html/body/div/header/div/nav/a[2]"));
        pricing.click();
        Thread.sleep(5000);
        cd.quit();
    }
    @Test
    void logovisibility(){
        ChromeDriver ch=new ChromeDriver();
        ch.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ch.get("https://resolve.vote/");
        ch.manage().window().maximize();
        WebElement logo=ch.findElement(By.xpath("/html/body/div/header/div/div[1]/a/img[1]"));
        logo.isDisplayed();
        ch.quit();
    }

}
