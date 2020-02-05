package SeleniumAutomation.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasketBase {

    WebDriver driver;

    public BasketBase(WebDriver driver) {
        this.driver = driver;
    }

    By addBasketButton=By.cssSelector("a.btn.btnGrey.btnAddBasket");
    By myBasketButton=By.cssSelector("a.myBasket");
    By productPrice=By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/div[3]/div[2]/div/div[1]/div/ins");
    By myBasketPrice=By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[1]/section/table[2]/tbody/tr/td[3]/div[2]/div/span");
    By myBasketQuantity=By.cssSelector("input[name=quantity]");
    By myBasketIncreaseQuantity=By.cssSelector("span.spinnerUp.spinnerArrow");
    By deleteMyBasket=By.cssSelector("span.removeProd.svgIcon.svgIcon_trash");

    public WebElement takeAddBasketButton(){
        return driver.findElement(addBasketButton);
    }
    public WebElement takeMyBasketButton(){
        return driver.findElement(myBasketButton);
    }
    public WebElement takeProductPrice(){
        return driver.findElement(productPrice);
    }
    public WebElement takeMyBasketPrice(){
        return driver.findElement(myBasketPrice);
    }
    public WebElement takeMyBasketQuantity(){
        return driver.findElement(myBasketQuantity);
    }
    public WebElement takeMyBasketIncreaseQuantity(){
        return driver.findElement(myBasketIncreaseQuantity);
    }
    public WebElement takeDeleteMyBasket(){
        return driver.findElement(deleteMyBasket);
    }
}
