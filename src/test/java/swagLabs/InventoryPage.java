package swagLabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//інструменти:
public class InventoryPage {
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addButtonBackpack;
    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement addButtonTShort;
    @FindBy(xpath = "//a[@data-test='shopping-cart-link']")
    WebElement shoppingCartBadge;

    // конструктор - це мозок, активує анотації @FindBy
    public InventoryPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    // методи для дій
    public void addItemToBasket(WebElement element) { //передавати на кнопку
        element.click();

    }

    public void clickCart(){
        shoppingCartBadge.click();
    }
}