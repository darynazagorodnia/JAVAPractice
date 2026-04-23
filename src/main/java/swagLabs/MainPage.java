package swagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    WebDriver driver;
    @FindBy(id = "user-name")
    private WebElement usernameField;
    @FindBy(id = "password")
    private WebElement passwordField;
    @FindBy(id = "login-button")
    private WebElement loginButton;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void enterUserName(String user) {
        usernameField.sendKeys(user);
    }
    public void enterPassword(String pass) {
        passwordField.sendKeys(pass);
    }
    public void clickLoginButton() {
        loginButton.click();
    }
    public String getTitleText(){
        return driver.findElement(By.className("title")).getText();
    }

}
