package SeleniumAutomation.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginBase {
    WebDriver driver;

    public LoginBase(WebDriver driver) {
        this.driver = driver;
    }

    By email=By.id("email");
    By password=By.id("password");
    By loginButton=By.id("loginButton");
    By home=By.linkText("Giriş Yap");

    public WebElement Email(){
        return driver.findElement(email);
    }

    public WebElement Password(){
        return driver.findElement(password);
    }

    public WebElement Submit(){
        return driver.findElement(loginButton);
    }

    public WebElement Verify(){
        return driver.findElement(home);
    }
}
