package com.saucedemo.test;

import com.github.lukaszcmielewski.utils.DriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {
    protected static final Logger logger = LogManager.getLogger();
    public Wait<WebDriver> wait;
    protected WebDriver driver;

    public void waiter(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public void waitUntil(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    @BeforeClass
    public void beforeClass() throws IOException {
        logger.info("Running before class");
        //driver = DriverFactory.getDriver();

    }

    @BeforeMethod
    public void setup() {
        logger.info("Running before method");


        try {
            driver = DriverFactory.getDriver();

            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();
            wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(15))//ile bedzie czekał
                                                    .pollingEvery(Duration.ofMillis(100))//co ile
                                                    .ignoring(NoSuchElementException.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
        logger.info("Running after method");
    }

    @AfterClass
    public void afterClass() {
        logger.info("Running after class");
    }
}
