package SeleniumAutomation.Drivers;

import SeleniumAutomation.Abstract.IWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxWebDriver implements IWebDriver {

    private String _firefoxDriver=DriverType.FirefoxWebDriver.toString();
    private String _driverName=DriverName.FirefoxDriverName.toString();
    private WebDriver _webDriver;

    public WebDriver get_webDriver(){return _webDriver;}

    public FirefoxWebDriver()
    {
        System.setProperty(_driverName,_firefoxDriver);
        _webDriver=new FirefoxDriver();
    }
}
