package SeleniumAutomation.Drivers;

public enum DriverType {

    ChromeWebDriver("C:\\Users\\alican\\Desktop\\Selenium\\Drivers\\Chrome\\chromedriver.exe"),
    FirefoxWebDriver("C:\\Users\\alican\\Desktop\\Selenium\\Drivers\\FireFox\\64\\geckodriver.exe"),
    InternetExplorerWebDriver("C:\\Users\\alican\\Desktop\\Selenium\\Drivers\\The Internet Explorer\\IEDriverServer.exe");

    private final String text;

    /**
     * @param text
     */
    DriverType(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}