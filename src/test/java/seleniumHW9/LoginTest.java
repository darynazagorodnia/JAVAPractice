package seleniumHW9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement elementID = driver.findElement(By.id("user-name"));
        WebElement elementClass = driver.findElement(By.className("submit-button"));
        WebElement elementSelector = driver.findElement(By.cssSelector("[data-test=login-button]"));
        WebElement elementXpath = driver.findElement(By.xpath("//input[@id='login-button']"));
        String actualTitle = driver.getTitle();
        String expectedTitle = "Swag Labs";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("УРА!!! Заголовок: " + actualTitle);
        } else {
            System.out.println("ПРОВАЛ!!! Заголовок: " + expectedTitle);
        }
        if (elementID.isDisplayed()) {
            System.out.println("Елемент ID знайдено успішно!");
        } else {
            System.out.println("Елемент ID є в коді, але його не видно на екрані.");
        }
        if (elementClass.isDisplayed()) {
            System.out.println("Елемент ClassName знайдено успішно!");
        } else {
            System.out.println("Елемент ClassName є в коді, але його не видно на екрані!");
        }
        if (elementSelector.isDisplayed()){
            System.out.println("Елемент CSS Selector знайдено успішно!");
        } else {
            System.out.println("Елемент CSS Selector є в коді, але його не видно на екрані!");
        }
        if (elementXpath.isDisplayed()){
            System.out.println("Елемент XPath знайдено успішно!");
        } else {
            System.out.println("Елемент XPath є в коді, але його не видно на екрані!");
        }

        driver.quit();
    }
}
