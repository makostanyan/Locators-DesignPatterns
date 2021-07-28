package factory_method;

import org.openqa.selenium.WebDriver;

public abstract class WebDriverCreator {

    public static WebDriver driver;
   public abstract WebDriver getWebDriver();
    public abstract void quitWebDriver();
}
