package SeleniumHW9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main (String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.className("submit-button")).click();
        String productText = driver.findElement(By.cssSelector(".title")).getText();
        System.out.println("Ми на сторінці: " + productText);

        driver.quit();
    }
}
