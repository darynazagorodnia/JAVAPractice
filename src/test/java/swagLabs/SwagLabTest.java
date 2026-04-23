package swagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.List;

public class SwagLabTest {
    @Test
    public void login() {
        WebDriver driver = new ChromeDriver(); // створюємо драйвер
        driver.get("https://www.saucedemo.com/");
        WebElement userNameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        userNameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();
        String url = driver.getCurrentUrl(); // умова
        Assert.assertEquals(url, "https://www.saucedemo.com/inventory.html"); // (актуальний, очікуваний) ознака того що ми залогінилися
        driver.quit();
    }
    @Test
    public void incorrectPassword(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement userNameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        userNameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce1");
        loginButton.click();
        List<WebElement> errorButton = driver.findElements(By.cssSelector("[data-test='error']"));
        Assert.assertFalse(errorButton.isEmpty()); //перевіряємо чи список пустий
        driver.quit();
    }
    @Test
    public void incorrectLogin(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement userNameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        userNameField.sendKeys("standard_use");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();
        List<WebElement> errorButton = driver.findElements(By.cssSelector("[data-test='error']"));
        Assert.assertFalse(errorButton.isEmpty()); //перевіряємо чи список пустий
        driver.quit();
    }
    @Test
    public void loginChooseProduct()throws InterruptedException{ //запобігає утворенню помилки
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement userNameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        userNameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();
        List<WebElement> errorButton = driver.findElements(By.cssSelector("[data-test='error']"));
        Assert.assertTrue(errorButton.isEmpty());
        WebElement addButtonBackpack = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addButtonBackpack.click();
        WebElement addButtonTShort = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        addButtonTShort.click();
        //WebElement addButtonTShortRed = driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")); з третім товаром тест не проходить
        //addButtonTShortRed.click();
        WebElement shoppingCartBadge = driver.findElement(By.xpath("//a[@data-test='shopping-cart-link']"));
        shoppingCartBadge.click();
        Thread.sleep(5000); //браузер думає
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/cart.html");
        List<WebElement> goods = driver.findElements(By.className("inventory_item_name"));
        Assert.assertEquals(goods.size(),2);
        String firstItemName = goods.get(0).getText();
        Assert.assertEquals(firstItemName, "Sauce Labs Backpack");
        String secondItemName = goods.get(1).getText();
        Assert.assertEquals(secondItemName, "Sauce Labs Bolt T-Shirt");
        WebElement checkoutButton = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkoutButton.click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/checkout-step-one.html");
        WebElement firstNameField = driver.findElement(By.id("first-name"));
        firstNameField.sendKeys("Daryna");
        WebElement lastNameField = driver.findElement(By.id("last-name"));
        lastNameField.sendKeys("Zagorodnia");
        WebElement zipCoreField = driver.findElement(By.id("postal-code"));
        zipCoreField.sendKeys("07400");
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();
        driver.quit();
    }
}
