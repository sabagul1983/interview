package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestRunner {
    WebDriver driver;
    String browser;
    Registration registration;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        browser= "https://demo.nopcommerce.com/register?returnUrl=%2F";
        driver.get(browser);
        System.out.println("I am on:" + browser);
        registration = new Registration(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @Test
    public void test(){
        registration.doSearch();
        registration.putName("saba");
        registration.putLast("gul");
        registration.choseDate("6");
        registration.selectMonth("October");
        registration.selectYear("1982");
        registration.putEmail("sabagul1983@yahoo.com");
        registration.companyName("concrate LMD");
        registration.tickBox();
        registration.putPassword("null123");
        registration.newPass("null123");
        registration.doRegister();
    }
    @After
    public void close(){
        driver.close();
    }
}
