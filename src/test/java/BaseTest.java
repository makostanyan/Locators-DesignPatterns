import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    protected WebDriver driver;
    SoftAssert softAssert = new SoftAssert();
    String authorName = "Agatha Christie";

    @BeforeMethod
    public void openPage() throws MalformedURLException {

        driver = new RemoteWebDriver(new URL("http://10.22.221.58:4444/wd/hub"), new ChromeOptions());
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void quitDriver() {
        driver.quit();
    }
}
