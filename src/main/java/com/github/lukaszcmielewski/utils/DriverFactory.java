package com.github.lukaszcmielewski.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.time.Duration;

public class DriverFactory {private static final Logger logger = LogManager.getLogger();
    private static WebDriver driver;

    public static WebDriver getDriver() throws IOException {
        if (driver == null) {
            String name = PropertiesLoader.loadProperty("broswer.name");
            logger.info("Setting WebDriver as : " + name);
            if (name.equals("firefox")) {
                driver = new FirefoxDriver();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            } else {
                driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            }
        }
        driver.manage().window().maximize();
        return driver;
    }

    public static void waiter(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static void quitDriver(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
