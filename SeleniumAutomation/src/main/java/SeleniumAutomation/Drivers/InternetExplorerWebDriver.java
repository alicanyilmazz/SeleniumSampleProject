package SeleniumAutomation.Drivers;

import SeleniumAutomation.Abstract.IWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerWebDriver implements IWebDriver {

    private String _internetExplorerDriver=DriverType.InternetExplorerWebDriver.toString();
    private String _driverName=DriverName.InternetExplorerDriverName.toString();
    private WebDriver _webDriver;

    public WebDriver get_webDriver(){return _webDriver;}

    public InternetExplorerWebDriver()
    {
        System.setProperty(_driverName,_internetExplorerDriver);
        _webDriver=new InternetExplorerDriver();
    }
}
