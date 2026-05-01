package swagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class PurchaseTest extends BaseTest {
    @Test
    public void loginChooseProduct() throws InterruptedException { //запобігає утворенню помилки
        driver.get("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(driver); //створюємо об'єкт для сторінки
        loginPage.login("standard_user", "secret_sauce");
        List<WebElement> errorButton = driver.findElements(By.cssSelector("[data-test='error']"));
        Assert.assertTrue(errorButton.isEmpty());

        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.addItemToBasket();
        inventoryPage.clickCart();

        CartPage cartPage = new CartPage(driver);
        Assert.assertEquals(cartPage.getCartItemsCount(),2);
        Assert.assertEquals(cartPage.getItemNameByIndex(0),"Sauce Labs Backpack");
        cartPage.clickCheckout();


        /*WebElement addButtonBackpack = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addButtonBackpack.click();
        WebElement addButtonTShort = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        addButtonTShort.click();
        //WebElement addButtonTShortRed = driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")); з третім товаром тест не проходить
        //addButtonTShortRed.click();
        WebElement shoppingCartBadge = driver.findElement(By.xpath("//a[@data-test='shopping-cart-link']"));
        shoppingCartBadge.click();
        Thread.sleep(5000); //браузер думає бажано не додавати необхідно додати EcsplisitWaiter
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/cart.html"); //крайній випадок, перевіряємо по загоровкам
        List<WebElement> goods = driver.findElements(By.className("inventory_item_name"));
        Assert.assertEquals(goods.size(), 2);
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
        continueButton.click();*/

    }
}
