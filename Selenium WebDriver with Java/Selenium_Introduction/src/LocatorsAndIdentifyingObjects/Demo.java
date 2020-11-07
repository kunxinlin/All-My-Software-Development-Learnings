package LocatorsAndIdentifyingObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\KrisLin\\Desktop\\Selenium_dependicies\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");

        //simple validation to see if your on the correct page
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.get("http://yahoo.com");
        driver.close(); //closes current window
        //driver.quit(); //closes all windows opened by selenium scripts
    }
}
