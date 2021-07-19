import org.testng.annotations.Test;

public class DeliveryCountryTest extends BaseChromeTest {

    @Test()
    public void deliveryToArmeniaTest(){

        HomePage homePage = new HomePage(driver);
        homePage.waitUntilPageLoad();
        softAssert.assertEquals(homePage.deliveryToArmenia(), "DelivertoArmenia",
                "It is not delivery to Armenia");
        softAssert.assertAll();
    }
}
