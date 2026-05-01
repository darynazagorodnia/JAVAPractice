package seleniumHW9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTests {
    public WebDriver driver; // оголошую змінну драйвера на рівні класу, всі методи мають до неї доступ

    @BeforeMethod //створюю новий екземпляр браузера перед кожним тестом для ізоляції тесту
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/"); // браузер переходить за вказаною адресою
    }

    @DataProvider(name = "loginData") //повертає таблицю даних у дохвимірний масив
    public Object[][] createLoginData() {
        return new Object[][]{
                {"standard_user", "secret_sauce"},
                {"locked_out_user", "secret_sauce"},
                {"problem_user", "secret_sauce"}
        };

    }

    @Test(dataProvider = "loginData") // в дужках записано параметр звідки саме брати дані для цього тесту.
    public void loginParametrizedTests(String userName, String password) {
        System.out.println("Логін: " + userName + " Пароль: " + password);
        String expectedTitle = "Swag Labs"; // створюємо еталон з яким порвівнюємо
        String actualTitle = driver.getTitle(); //запитуємо у селеніум реальний заголовок вкладки
        Assert.assertEquals(actualTitle, expectedTitle, "Тест не пройшов");
        SoftAssert softAssert = new SoftAssert(); // тут я створила блокнот для запису помилок
        WebElement elementLoginButton = driver.findElement(By.id("login-button"));
        WebElement elementLoginField = driver.findElement(By.id("user-name"));
        WebElement elementParolField = driver.findElement(By.id("password"));
        softAssert.assertTrue(elementLoginButton.isDisplayed(), "Кнопку логін не знайдено");// викликаємо метод
        softAssert.assertTrue(elementLoginField.isDisplayed(), "Поле логін не знайдено");
        softAssert.assertTrue(elementParolField.isDisplayed(), "Поле пароль не знайдено");
        elementLoginField.sendKeys(userName);
        elementParolField.sendKeys(password);
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown() {
        //   driver.close();
        driver.quit();
    }

}
