package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class AuthorBooksPage extends BasePage implements WaitHelper {

    private final String authorNameLoc = "//div[@class='a-section a-spacing-none']//div[@class='a-row a-size-base a-color-secondary']";
    @FindBy(xpath = authorNameLoc )
    List<WebElement> authorNameList;
    @FindBy(xpath = "//div[@class='a-row a-size-base a-color-secondary']//a[@class='a-size-base a-link-normal']")
    WebElement authorNameLink;
    @FindBy(css = "[class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']")
    List<WebElement> bookName;

    public WebElement getBookNameFromList(int index){
        return bookName.get(index);
    }

    public List<WebElement> getBookName() {
        return bookName;
    }

    public AuthorBooksPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getAuthorNameFromList(int index){
        return authorNameList.get(index);
    }

    public List<WebElement> getAuthorNameList() {
        return authorNameList;
    }

    public boolean isAllBooksAuthors(String authorName){

        boolean checkCondition = true;
        for (WebElement i : authorNameList){
            if (!i.getText().toLowerCase().contains(authorName)){
                 checkCondition = false;
                 break;
            }
        } return checkCondition;
    }

    public void clickOnAuthorName(){

        authorNameLink.click();
    }

    @Override
    public void waitUntilPageLoad(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(authorNameLoc)));
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath(authorNameLoc), 12));
    }
}