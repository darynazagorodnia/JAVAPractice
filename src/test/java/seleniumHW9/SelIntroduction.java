package seleniumHW9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {
    public static void main (String[] args){
        WebDriver driver = new ChromeDriver();
        // WebDriver driver1 = new FirefoxDriver();
        // WebDriver driver2 = new EdgeDriver();
        // driver.get("https://rozetka.com.ua/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        // WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
        // driver.close();
        driver.quit();
    }

}
