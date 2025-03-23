package com.automation.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;


// This is just a concept to understand the PropertyReader
// We can not use this in our framework (main methods)
//and hence we need to create reusable methods under utils class
// And we gonne use Utils in our framework


public class PropertyReaderBase {
    public static void main(String[] args) throws Exception {

        //Property Initialisation
        Properties property = new Properties();
        property.load(new FileInputStream("src/test/resources/config/config.properties"));

        //Property Reader
        System.out.println(property.getProperty("url"));
        System.out.println(property.getProperty("userName"));

    }

}
