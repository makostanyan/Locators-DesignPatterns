package factory_method;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxWebDriverCreator extends WebDriverCreator{

    @Override
    public  WebDriver getWebDriver() {
        WebDriverManager.firefoxdriver().setup();
        return driver = new FirefoxDriver();
    }

    @Override
    public void quitWebDriver() {
        driver.quit();
        driver = null;
    }
}
