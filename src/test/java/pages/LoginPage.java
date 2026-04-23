package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public boolean isProductsTitleDisplayed() {
        return productsTitle.isDisplayed();
    }

    // описую елементи
    @FindBy(className = "title")
    private WebElement productsTitle;

    @FindBy(id = "user-name")
    private WebElement userNameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Методи дії
    public void enterUsername(String user) {
        userNameField.sendKeys(user);
    }

    public void enterPassword(String pass) {
        passwordField.sendKeys(pass);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

}
