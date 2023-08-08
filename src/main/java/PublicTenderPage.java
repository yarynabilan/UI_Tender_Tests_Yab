
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.qameta.allure.Step;
import lombok.Getter;
import java.util.List;
import java.util.stream.Collectors;

import static org.testng.Assert.assertTrue;
@Getter
public class PublicTenderPage extends BasePage {

    public TenderInformationPanel tenderInformationPanel;
//    public SubmissionRequirementsTab submissionRequirementsTab;
    private By tenderHeaderType = By.xpath("//div[@class='header_title' and @id='username']");
    private By tenderAdminProfile = By.xpath("//td[@class='modulHeading']");
    private By publicTenderTab = By.xpath("//span[@style='font-size: 12px;; white-space: nowrap;']");
    private By tenderInformationTab = By.xpath("//*[@id=\"tender_information_node\"]/span");
    private By submissionRequirementsTab = By.xpath("//*[@id=\"tender_requirements_node\"]/span");
    private By tenderSpecificationDocumentsTab = By.xpath("//*[@id=\"tender_doclisting_node\"]/span");
    private By questionsAndAnswersTab = By.xpath("//*[@id=\"tender_questions_node\"]/span");
    private By messagesfromTenderAdministratorTab = By.xpath("//*[@id=\"admin_messages_node\"]/span");
    private By usersTab = By.xpath("//*[@id=\"tender_allusers_node\"]/span");
    private By logFilesTab = By.xpath("//*[@id=\"tender_log_root_node\"]/span");
    private By guidanceTab = By.xpath("//*[@id=\"tender_log_root_node\"]/span");
    private By submittedTenderOffersTab = By.xpath("//*[@id=\"tender_submitted_offer_root_node\"]/span");
    private By tenderResultTab = By.xpath("//*[@id=\"tender_result\"]/span");



    private final static String TITLE = "Tender";

    public PublicTenderPage(WebDriver driver) {
        super(driver);
    }


//    @Step("Navigate to Tender Information")
//    public void navigateToTenderInformation(){
//        tenderInformationTab().click();
//        tenderInformationTab = new TenderInformationPanel();
//    }

    public WebElement tenderHeaderType() {
        return driver.findElement(tenderHeaderType);

    }

    public WebElement tenderAdminProfile() {
        return driver.findElement(tenderAdminProfile);

    }

    public void switchToNewWindow() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }

    public WebElement publicTenderTab() {
        return driver.findElement(publicTenderTab);

    }

    //        public void clickPublicTenderTab(){
//            WebDriverWait wait = new WebDriverWait(driver, 10);
//            WebElement publicTenderTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@style='font-size: 12px;; white-space: nowrap;']")));
//            publicTenderTab.click();
//        }
//        }
    public WebElement tenderInformationTab() {
        return driver.findElement(tenderInformationTab);

    }
    public void clickOnElement(By elementLocator){
        driver.findElement(elementLocator).click();
    }

    @Step
    public void navigateToTenderInformation(){
        tenderInformationTab().click();
        //     new TenderInformationPanel();

    }

}


