package SeleniumAutomation.Abstract;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.xml.bind.ValidationException;
import java.util.Random;

public  class BasicOperations {

    WebDriver driver;

    public BasicOperations(){

    }

    public BasicOperations(WebDriver driver){

        this.driver=driver;
    }

    public void goToUrl(String url){
        driver.get(url);
    }
    public void getCurrentTitle(){
        System.out.println( driver.getTitle());
    }
    public String  getCurrentUrl(){
        return driver.getCurrentUrl();
    }
    public void navigateTo(String url){
        driver.navigate().to(url);
    }
    public void Close(){
        driver.close();
    }
    public void Quit(){
        driver.quit();
    }
    public boolean verifyUrl(String url,String expectedUrl){
        if (url.contentEquals(expectedUrl)){
            return true;
        }
        return false;
    }
    //TODO Refactor this operation as a primitive type casting and Trim()
    public boolean verifyPrice(String productprice,String basketprice){
        if (productprice.contentEquals(basketprice)){
            return true;
        }
        return false;
    }


}
