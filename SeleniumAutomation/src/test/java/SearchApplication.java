import SeleniumAutomation.Abstract.BasicOperations;
import SeleniumAutomation.Base.SearchBase;
import SeleniumAutomation.Drivers.ChromeWebDriver;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SearchApplication {

    ChromeWebDriver chromeWebDriver=new ChromeWebDriver();
    BasicOperations basicOperations=new BasicOperations(chromeWebDriver.get_webDriver());
    SearchBase searchBase=new SearchBase(chromeWebDriver.get_webDriver());

    @Test
    public void searchProduct(){

        basicOperations.goToUrl("https://www.n11.com/");
        searchBase.takeSearchInput().sendKeys("Bilgisayar");
        searchBase.takeSearchButton().click();
        searchBase.takePagingButton().click();
        boolean navigateToResult =basicOperations.verifyUrl("https://www.n11.com/arama?q=Bilgisayar&pg=2",basicOperations.getCurrentUrl());
        assertThat(true, is(navigateToResult));
        searchBase.takeProductLink().click();
    }

}
