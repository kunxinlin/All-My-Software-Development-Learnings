package LocatorsAndIdentifyingObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\KrisLin\\Desktop\\Selenium_dependicies\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("http://facebook.com");
        //put cursor on the text box
        driver.findElement(By.id("email")).sendKeys("Hello World");
        driver.findElement(By.id("pass")).sendKeys(("12345"));

        //if multiple element has the same name, selenium will select the first one it encounters
        //selenium doesnt accept compound classes/names with spaces ex. sm wide container

        //find link element by their text
        driver.findElement(By.linkText("Forgot Password?")).click();

        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("Krissss");
        driver.findElement(By.name("pw")).sendKeys("password");
        driver.findElement(By.className("button r4 wide primary")).click(); //error this wont work
    }
}
