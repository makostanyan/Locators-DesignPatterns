import driver.DriverSingleton;
import model.Author;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.asserts.SoftAssert;
import service.AuthorService;
import utils.TestListener;

@Listeners(TestListener.class)
public class BaseTest {

    protected WebDriver driver;
    SoftAssert softAssert = new SoftAssert();
    Author author = AuthorService.authorData();

    @BeforeMethod
    public void openPage() {

        driver = DriverSingleton.getDriver();
        driver.get("https://www.amazon.com/");

    }

    @AfterMethod
    public void quitDriver() {
        DriverSingleton.closeDriver();
    }
}
