package steps;

import driver.DriverSingleton;
import factory_method.DriverType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import pages.AuthorBooksPage;
import pages.HomePage;

@Log4j2
public class AmazonSteps {

    @Given("Initialize driver")
    public WebDriver initializeDriver() {
        return DriverSingleton.getDriver(DriverType.CHROME);
    }

    WebDriver driver = initializeDriver();
    HomePage homePage = new HomePage(driver);
    AuthorBooksPage authorBooksPage = new AuthorBooksPage(driver);
    SoftAssert softAssert = new SoftAssert();

    @Given("The user opens Amazon website")
    public void userOpensAmazon() {
        driver.get("https://www.amazon.com/");
    }

    @When("The user gets delivery country")
    public void userGetsCountry() {
        homePage.waitUntilPageLoad();
    }

    @When("Click on books department")
    public void clickOnBooksDepartment() {
        homePage.clickOnBookDepartment();
        homePage.waitUntilPageLoad();
    }

    @And("^Search (.*) name$")
    public void searchAuthorsName(String authors) {
        homePage.authorSearch(authors);
        authorBooksPage.waitUntilPageLoad();
    }

    @Then("^Check if all books (.*)$")
    public void checkIfAllBooksAuthors(String authors) {
        softAssert.assertTrue(authorBooksPage.isAllBooksAuthors(authors.toLowerCase()),
                "Book was written by another author");
        softAssert.assertAll();
    }

    @Then("Delivery to Armenia is displayed")
    public void isCountryArmenia() {
        softAssert.assertEquals(homePage.deliveryToArmenia(), "DelivertoArmenia",
                "It is not delivery to Armenia");
        softAssert.assertAll();
    }
}
