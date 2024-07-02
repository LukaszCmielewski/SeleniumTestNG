package com.github.lukaszcmielewski.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class SeleniumHelper {
    public static void waitForClikable(WebElement element, WebDriver driver){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitForClikable(By locator, WebDriver driver){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public static void waitForSelected(By locator, WebDriver driver){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeSelected(locator));
    }
    public static void waitForVisability(By locator, WebDriver driver){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public static void waitForElementToexist(By locator) throws IOException {
        WebDriverWait wait=new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(5));
        wait.until(driver -> driver.findElements(locator).size()>0);
    }
}
