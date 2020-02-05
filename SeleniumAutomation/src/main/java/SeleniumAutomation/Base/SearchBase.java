package SeleniumAutomation.Base;

import SeleniumAutomation.Abstract.StaticBaseOperations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class SearchBase {

    WebDriver driver;

    public SearchBase(WebDriver driver) {
        this.driver = driver;
    }

    String formatted=String.format("/html/body/div[1]/div[2]/div/div/div[2]/section[1]/div[2]/ul/li[%s]/div/div[1]/a/img", StaticBaseOperations.takeRandomProduct());
    By searchInput=By.id("searchData");
    By searchButton=By.className("searchBtn");
    By pagingButton=By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/div[4]/a[2]");
    By productLink=By.xpath(formatted);

    public WebElement takeSearchInput(){
        return driver.findElement(searchInput);
    }

    public WebElement takeSearchButton(){
        return driver.findElement(searchButton);
    }

    public WebElement takePagingButton(){
        return driver.findElement(pagingButton);
    }

    public WebElement takeProductLink(){
        return driver.findElement(productLink);
    }
}
