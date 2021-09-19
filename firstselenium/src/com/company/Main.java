package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C://WebDriver//Chr//chromedriver_win32 (1)//chromedriver.exe");
        System.out.println("hi");
        driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.id("gdpr-banner-accept")).click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.id("gh-ac")).sendKeys("mobile");

        driver.findElement(By.id("gh-btn")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        System.out.println("one");
        js.executeScript("window.scrollBy(0,1200)");
        System.out.println("two");



	// write your code here
    }
}
