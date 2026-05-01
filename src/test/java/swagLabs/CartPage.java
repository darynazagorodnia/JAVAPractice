package swagLabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage {
    @FindBy(className = "inventory_item_name")
    List<WebElement> cartItems;//список усіх товарів у кошику
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkoutButton;

    //мозок каже що робити зі знайденими елементами
    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    //перевірка кількості товарів у кошику
    public int getCartItemsCount(){
        return cartItems.size();
    }
    public String getItemNameByIndex(int index){
        return cartItems.get(index).getText();
    }
    public void clickCheckout(){
        checkoutButton.click();
    }
}
