import org.testng.annotations.Test;

public class AuthorsBooksTest extends BaseTest {

    @Test()
    public void authorBooksTest() {

        HomePage homePage = new HomePage(driver);
        homePage.waitUntilPageLoad();
        softAssert.assertEquals(homePage.deliveryToArmenia(), "DelivertoArmenia",
                "It is not delivery to Armenia");
        homePage.clickOnBookDepartment();
        homePage.waitUntilPageLoad();
        homePage.authorSearch(author);
        AuthorBooksPage authorBooksPage = new AuthorBooksPage(driver);
        authorBooksPage.waitUntilPageLoad();
        softAssert.assertTrue(authorBooksPage.isAllBooksAuthors(author.getAuthorName().toLowerCase()),
                "Book was written by another author");
        softAssert.assertAll();
    }
}