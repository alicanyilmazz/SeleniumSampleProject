package SeleniumAutomation.Drivers;

import SeleniumAutomation.Abstract.IWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWebDriver implements IWebDriver {

    private String _chromeDriver=DriverType.ChromeWebDriver.toString();
    private String _driverName=DriverName.ChromeDriverName.toString();
    private WebDriver _webDriver;

    public WebDriver get_webDriver(){return _webDriver;}

    public ChromeWebDriver()
    {
        System.setProperty(_driverName,_chromeDriver);
        _webDriver=new ChromeDriver();
    }

}
