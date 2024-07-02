package com.github.lukaszcmielewski.utils;

import java.io.*;
import java.util.Properties;

public class PropertiesLoader {public static String loadProperty(String propertyName) throws IOException {
    InputStream inputStream = new FileInputStream("src/test/resources/config.properties");
    Properties properties = new Properties();
    properties.load(inputStream);
    return properties.getProperty(propertyName);
}
}
