import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;
import pages.AboutAuthorPage;
import pages.AuthorBooksPage;
import pages.HomePage;
import pages.SortedBooksPage;
import service.TestDataReader;

@Log4j2
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
        log.info("sortedBooksTest ended");
        softAssert.assertAll();
    }
}