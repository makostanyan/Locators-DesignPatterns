import model.Author;
import org.testng.annotations.Test;
import service.AuthorService;
import service.TestDataReader;

public class SortBooksTest extends BaseTest {

    @Test()
    public void sortedBooksTest() {

        HomePage homePage = new HomePage(driver);
        homePage.clickOnBookDepartment();
        homePage.waitUntilPageLoad();
        homePage.authorSearch(author);
        AuthorBooksPage authorBooksPage = new AuthorBooksPage(driver);
        authorBooksPage.waitUntilPageLoad();
        softAssert.assertTrue(authorBooksPage.isAllBooksAuthors(author.getAuthorName().toLowerCase()),
                "Book was written by another author");
        authorBooksPage.clickOnAuthorName();
        AboutAuthorPage aboutAuthorPage = new AboutAuthorPage(driver);
        aboutAuthorPage.waitUntilPageLoad();
        softAssert.assertEquals(aboutAuthorPage.authorsBooks(), "Titles By " + TestDataReader.getTestData(author.getAuthorName()),
                "Missing statement Books By {Author name} ");
        aboutAuthorPage.clickOnPriceFilter();
        SortedBooksPage sortedBooksPage = new SortedBooksPage(driver);
        sortedBooksPage.waitUntilPageLoad();
        softAssert.assertTrue(sortedBooksPage.isSortedBooksList(), "Books list is not sorted");
        softAssert.assertAll();
    }
}