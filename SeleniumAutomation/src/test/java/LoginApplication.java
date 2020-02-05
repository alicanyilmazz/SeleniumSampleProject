import SeleniumAutomation.Abstract.BasicOperations;
import SeleniumAutomation.Abstract.IWebDriver;
import SeleniumAutomation.Base.LoginBase;
import SeleniumAutomation.Drivers.ChromeWebDriver;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.openqa.selenium.InvalidArgumentException;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class LoginApplication  extends BasicOperations {

//    ChromeWebDriver moc_chromeWebDriver=Mockito.mock(ChromeWebDriver.class);
    ChromeWebDriver chromeWebDriver=new ChromeWebDriver();
    BasicOperations basicOperations=new BasicOperations(chromeWebDriver.get_webDriver());
    LoginBase loginBase=new LoginBase(chromeWebDriver.get_webDriver());

    @Test()
    public void login(){

        basicOperations.goToUrl("https://www.n11.com/");
        boolean goToUrlResult =basicOperations.verifyUrl("https://www.n11.com/",basicOperations.getCurrentUrl());
        assertThat(true, is(goToUrlResult));

        basicOperations.navigateTo("https://www.n11.com/giris-yap");
        loginBase.Email().sendKeys("ali_ylmz03@hotmail.com");
        loginBase.Password().sendKeys("Alican12345");
        loginBase.Submit().click();
        boolean navigateToResult =basicOperations.verifyUrl("https://www.n11.com/",basicOperations.getCurrentUrl());
        assertThat(true, is(navigateToResult));


    }
}
