package swagLabs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SwagLabsTest extends BaseTest {
    @Test
    public void checkPage() {
        MainPage mainPage = new MainPage(driver);
        mainPage.enterUserName("standard_user");
        mainPage.enterPassword("secret_sauce");
        mainPage.clickLoginButton();
        Assert.assertEquals(driver.getCurrentUrl(), "https://saucedemo.com");
        Assert.assertEquals(mainPage.getTitleText(), "Product");
    }
}
