import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    @FindBy(id = "glow-ingress-block")
    WebElement deliverTo;
    @FindBy(id = "nav-search-dropdown-card")
    WebElement searchDropdown;
    @FindBy(css = "[value='search-alias=stripbooks-intl-ship']")
    WebElement booksDepartment;
    @FindBy(id = "twotabsearchtextbox")
    WebElement search;
    @FindBy(id = "navbar")
    WebElement homePageLoad;

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public String deliveryToArmenia(){

        return deliverTo.getText().replaceAll("\\s", "");
    }

    public void clickOnBookDepartment(){
        actions.click(searchDropdown).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(booksDepartment));
        booksDepartment.click();
    }

    public void authorSearch(String authorName){
        actions.sendKeys(search, authorName + Keys.ENTER).build().perform();
    }

    public void waitUntilPageLoad(){

        wait.until(ExpectedConditions.visibilityOf(homePageLoad));
    }
}