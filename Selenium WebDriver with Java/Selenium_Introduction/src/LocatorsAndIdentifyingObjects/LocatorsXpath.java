package LocatorsAndIdentifyingObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsXpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\KrisLin\\Desktop\\Selenium_dependicies\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //xpath and CSS can be defined in N number of ways
        driver.get("http://facebook.com");
        //put cursor on the text box
        driver.findElement(By.cssSelector("#email")).sendKeys("Hello World");
        driver.findElement(By.id("pass")).sendKeys(("12345"));

        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("Krissss");
        driver.findElement(By.name("pw")).sendKeys("password");
        //full xpath which starts with /html/body/etc/etc are not reliable.
        driver.findElement(By.xpath("//*[@id=\"Login\"]")).click(); //have to escape the double quotes or turn them into single quotes
        System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());

    }
}
