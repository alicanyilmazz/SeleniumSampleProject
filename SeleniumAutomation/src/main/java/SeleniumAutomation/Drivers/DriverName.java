package SeleniumAutomation.Drivers;

public enum DriverName {

    ChromeDriverName("webdriver.chrome.driver"),
    FirefoxDriverName("webdriver.gecko.driver"),
    InternetExplorerDriverName("webdriver.ie.driver");

    private final String text;

    /**
     * @param text
     */
    DriverName(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}