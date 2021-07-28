import driver.DriverSingleton;
import factory_method.DriverType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import model.Author;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.asserts.SoftAssert;
import service.AuthorService;
import utils.TestListener;

@Listeners(TestListener.class)
public class BaseTest {

    protected WebDriver driver = DriverSingleton.getDriver(DriverType.CHROME);
    SoftAssert softAssert = new SoftAssert();
    public static final Logger log = LoggerFactory.getLogger(DriverSingleton.class);
    Author author = AuthorService.authorData();


    @BeforeMethod
    public void openPage() {
        driver = DriverSingleton.getDriver(DriverType.CHROME);
        driver.get("https://www.amazon.com/");
    }

    @AfterMethod(alwaysRun = true)
    public void quitDriver() {
        DriverSingleton.closeDriver();
    }

}
