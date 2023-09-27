package main;

import com.codeborne.selenide.SelenideElement;
import main.tenderInformation.TenderDescription;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import lombok.Getter;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertTrue;
@Getter
public class PublicTenderPage extends BasePage {

    public TenderDescription tenderInformationPanel;
//    public SubmissionRequirementsTab submissionRequirementsTab;
private final SelenideElement tenderHeaderType = $(byXpath("//div[@class='header_title' and @id='username']"));
    private By tenderAdminProfile = By.xpath("//td[@class='modulHeading']");
    private By publicTenderTab = By.xpath("//span[@style='font-size: 12px;; white-space: nowrap;']");
    private By tenderInformationTab = By.xpath("//*[@id=\"tender_information_node\"]/span");

//    private By tenderDescriptionSubTab = By.xpath("//img[@src='/images/info/large_tender_description.png']");
    private By submissionRequirementsTab = By.xpath("//*[@id=\"tender_requirements_node\"]/span");
    private By tenderSpecificationDocumentsTab = By.xpath("//*[@id=\"tender_doclisting_node\"]/span");
    private By questionsAndAnswersTab = By.xpath("//*[@id=\"tender_questions_node\"]/span");
    private By messagesfromTenderAdministratorTab = By.xpath("//*[@id=\"admin_messages_node\"]/span");
    private By usersTab = By.xpath("//*[@id=\"tender_allusers_node\"]/span");
    private By logFilesTab = By.xpath("//*[@id=\"tender_log_root_node\"]/span");
    private By guidanceTab = By.xpath("//*[@id=\"tender_log_root_node\"]/span");
    private By submittedTenderOffersTab = By.xpath("//*[@id=\"tender_submitted_offer_root_node\"]/span");
    private By tenderResultTab = By.xpath("//*[@id=\"tender_result\"]/span");
    private By browserFrame = By.xpath("//frame[@name='browser']\"");

    private final static String TITLE = "Tender";

    public PublicTenderPage(WebDriver driver) {
        super(driver);
    }

    public WebElement tenderHeaderType() {
        return driver.findElement((By) tenderHeaderType);

    }

    public WebElement tenderAdminProfile() {
        return driver.findElement(tenderAdminProfile);

    }

    public void switchToNewWindow(String mainWindowHandle) {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }

    public WebElement publicTenderTab() {
        return driver.findElement(publicTenderTab);

    }
    public WebElement tenderInformationTab() {
        return driver.findElement(tenderInformationTab);
    }
    public WebElement browserFrame() {
        return driver.findElement(browserFrame);
    }
    public void clickOnElement(By elementLocator){
        driver.findElement(elementLocator).click();
    }

    public void switchToBrowserFrame() {
        driver.switchTo().frame(driver.findElement(browserFrame));

    }
    }



