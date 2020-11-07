package LocatorsAndIdentifyingObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXPathCSS {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\KrisLin\\Desktop\\Selenium_dependicies\\chromedriver.exe");

        WebDriver driver =new ChromeDriver();
        driver.get("http://facebook.com");

        ////tagName[@attribute='value']  - xpath
/*		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("myown xpath");  //can use * but better to be more specific and have tagname
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();*/

        //tagName[attribute='value']  -CSS
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("myowncss");
        driver.findElement(By.cssSelector("[name='login']")).click(); //dont need * for CSS


    }
}
