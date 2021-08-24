import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;
import pages.HomePage;

@Log4j2
public class DeliveryCountryTest extends BaseTest {

    @Test
    public void deliveryToArmeniaTest(){

        HomePage homePage = new HomePage(driver);
        homePage.waitUntilPageLoad();
        softAssert.assertEquals(homePage.deliveryToArmenia(), "DelivertoArmenia",
                "It is not delivery to Armenia");
        log.info("deliveryToArmeniaTest ended");
        softAssert.assertAll();
    }
}
