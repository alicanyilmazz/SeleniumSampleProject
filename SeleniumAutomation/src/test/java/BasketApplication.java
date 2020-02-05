import SeleniumAutomation.Abstract.BasicOperations;
import SeleniumAutomation.Base.BasketBase;
import SeleniumAutomation.Drivers.ChromeWebDriver;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BasketApplication {

    ChromeWebDriver chromeWebDriver=new ChromeWebDriver();
    BasicOperations basicOperations=new BasicOperations(chromeWebDriver.get_webDriver());
    BasketBase basketBase=new BasketBase(chromeWebDriver.get_webDriver());
    String product_price,basket_price;

    @Test
    public void addProduct(){

        basicOperations.goToUrl("https://urun.n11.com/dizustu-bilgisayar/hp-15-da1065nt-i5-8265u-8gb-256gb-mx110-win10home-156-6tc05eaq-P404813945");
        basketBase.takeAddBasketButton().click();
        product_price=basketBase.takeProductPrice().getText();
        basketBase.takeMyBasketButton().click();
        basket_price=basketBase.takeMyBasketPrice().getText();
        assertThat(true, is( basicOperations.verifyPrice(product_price,basket_price)));
        basketBase.takeMyBasketIncreaseQuantity().click();
        System.out.println(basketBase.takeMyBasketQuantity().getText());
//       assertThat(2, is(Integer.parseInt(basketBase.takeMyBasketQuantity().getText())));
        basketBase.takeDeleteMyBasket().click();
    }
}
