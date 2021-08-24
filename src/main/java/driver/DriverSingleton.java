package driver;

import factory_method.ChromeDriverCreator;
import factory_method.DriverType;
import factory_method.FireFoxWebDriverCreator;
import factory_method.WebDriverCreator;
import org.openqa.selenium.WebDriver;

public class DriverSingleton {

    private static WebDriverCreator webDriverCreator;

    private DriverSingleton() {}

    private static WebDriver driver;

    public static WebDriver getDriver(DriverType driverType) {
        if (driver == null) {
            switch (driverType) {
                case FIREFOX:
                    webDriverCreator = new FireFoxWebDriverCreator();

                case CHROME:
                    webDriverCreator = new ChromeDriverCreator();

            }
            driver = webDriverCreator.getWebDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void closeDriver() {
        webDriverCreator.quitWebDriver();

    }
}
