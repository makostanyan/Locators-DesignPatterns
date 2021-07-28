package factory_method;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverCreator extends WebDriverCreator{

    @Override
    public WebDriver getWebDriver() {
        WebDriverManager.chromedriver().setup();
        return driver = new ChromeDriver();
    }

    @Override
    public void quitWebDriver() {
        driver.quit();
        driver = null;
    }
}
