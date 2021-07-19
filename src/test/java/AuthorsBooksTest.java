import org.testng.annotations.Test;

public class AuthorsBooksTest extends BaseChromeTest {

    @Test()
    public void authorBooksTest() {

        HomePage homePage = new HomePage(driver);
        homePage.waitUntilPageLoad();
        softAssert.assertEquals(homePage.deliveryToArmenia(), "DelivertoArmenia",
                "It is not delivery to Armenia");
        homePage.clickOnBookDepartment();
        homePage.waitUntilPageLoad();
        homePage.authorSearch(authorName);
        AuthorBooksPage authorBooksPage = new AuthorBooksPage(driver);
        authorBooksPage.waitUntilPageLoad();
        softAssert.assertTrue(authorBooksPage.isAllBooksAuthors(authorName.toLowerCase()),
                "Book was written by another author");
        softAssert.assertAll();
    }
}