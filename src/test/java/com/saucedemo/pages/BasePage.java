package com.saucedemo.pages;

import com.github.lukaszcmielewski.utils.DriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class BasePage {
    protected static final Logger logger = LogManager.getLogger();
    protected WebDriver driver;

    public BasePage() throws IOException {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
    }
}
