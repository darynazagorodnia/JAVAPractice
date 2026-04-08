package SeleniumHW9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Swag Labs";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("УРА!!! Заголовок: " + actualTitle);
        } else {
            System.out.println("ПРОВАЛ!!! Заголовок: " + expectedTitle);
        }
        driver.quit();
    }
}
