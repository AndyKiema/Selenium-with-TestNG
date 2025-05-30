package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Trialwithseleniumcode {
    @Test
    void login(){
        ChromeDriver cd=new ChromeDriver();
        cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        cd.get("https://resolve.vote/");
        WebElement pricing=cd.findElement(By.xpath("/html/body/div/header/div/nav/a[2]"));
        pricing.click();
    }

}
