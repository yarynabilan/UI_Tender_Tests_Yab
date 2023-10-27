package main.tenderInformation;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import lombok.Getter;
import main.PublicTenderPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

@Getter
public class TenderSettings {
    private WebDriver driver;
    private By editTenderSettingsButton = By.xpath("//img[@src=\"https://testdociaweb.byggeweb.dk/images/buttons/edit_tender_settings_on.png\" and @title=\"Edit tender settings\"]\n");
    private By accessDocumentsBySubcontractorDropdown = By.xpath("//select[@class=\"contentNormal\" and @name=\"subcontractor\"]");
    private By onlyTenderersMayDownloadDropdownOption = By.xpath("//option[@value=\"0\" and text()=\"Only tenderers may download\"]\n");
    private By allowTendersPartnerToAccessDropdownOption = By.xpath("//option[@value='1' and text()=\"Allow tenderers' partner access to tender material\"]");
    private By tenderSettingsSubTab = By.xpath("//img[@src=\"/images/info/large_tender_settings.png\"]\n");
    private By subcontractorQA = By.xpath("//select[@class=\"contentNormal\" and @name=\"subcontractor_qa\"]");
    private By notifyAboutAnswersYes = By.xpath("//option[@value='1' and text()=\"Yes\"]");
    private By notifyAboutAnswersNo = By.xpath("//option[@value='0' and text()=\"No\"]");

    private By employmentDropdown = By.xpath("//select[@class='contentNormal' and @name='multiplefiles']\n");

    private By supplementaryFilesAcceptedOption = By.xpath("//select[@class='contentNormal' and @name='multiplefiles']/option[contains(text(), 'Supplementary files are accepted')]");
    private By supplementaryFilesNoAcceptedOption = By.xpath("//select[@class='contentNormal' and @name='multiplefiles']/option[contains(text(), 'Supplementary files are not accepted')]\n");
    private By publicationDropdown = By.xpath("//select[@class='contentNormal' and @name='multiplefilespublication']");
    private By publicationDisabled = By.xpath("//select[@class='contentNormal' and @name='multiplefilespublication']/option[@selected='' and @value='0']\n");
    private By publicationAnabled = By.xpath("//select[@class='contentNormal' and @name='multiplefilespublication']/option[@value='1']\n");
    private By securityDropdown = By.xpath("//select[@class='contentNormal' and @name='tenderoffer']");
    private By seeTheStatusYes = By.xpath("//select[@class='contentNormal' and @name='tenderoffer']/option[contains(text(), 'See status of submitted')]\n");
    private By seeTheStatusNo = By.xpath("//option[contains(text(), 'Not see status of submitted')]");
    private By qaHandlingDropdown = By.xpath("//select[@class='contentNormal' and @name='tender_questions']\n");
    private By QAmoduleUsedYes = By.xpath("//select[@class='contentNormal' and @name='tender_questions']/option[contains(text(), 'RIB Q&A module is used')]\n");
    private By QAmoduleUsedNo = By.xpath("//select[@class='contentNormal' and @name='tender_questions']/option[contains(text(), 'Q&A is handled otherwise')]");
    private By sendersSettingsDropdown = By.xpath("//select[@class='contentNormal' and @name='tender_questions']\n");
    private By sendersRevealed = By.xpath("//select[@class='contentNormal' and @name='questions_senders']/option[contains(text(), 'Are revealed to administrators') ]");
    private By sendersHidden = By.xpath("//select[@class='contentNormal' and @name='questions_senders']/option[contains(text(), 'Are hidden to all users')]\n");
    private final static String TITLE = "Tender Settings";

    public TenderSettings(WebDriver driver) {this.driver = driver;}

    public WebElement getEditTenderSettingsButton() {return driver.findElement(editTenderSettingsButton);}
    public WebElement accessDocumentsBySubcontractorDropdown() {return driver.findElement(accessDocumentsBySubcontractorDropdown);}
    public WebElement onlyTenderersMayDownloadDropdownOption() {return driver.findElement(onlyTenderersMayDownloadDropdownOption);}
    public WebElement notifyAboutAnswersYes() {return driver.findElement(notifyAboutAnswersYes); }
    public WebElement notifyAboutAnswersNo() {return driver.findElement(notifyAboutAnswersNo);}
    public WebElement allowTendersPartnerToAccessDropdownOption() {return driver.findElement(allowTendersPartnerToAccessDropdownOption);}
    public WebElement subcontractorQAdropdown() {return driver.findElement(subcontractorQA);}
    public void clickOnAccessDocumentsBySubcontractorDropdown() {
        accessDocumentsBySubcontractorDropdown().click();
    }

    public void clickOnAllowTendersPartnerToAccessDropdownOption() {allowTendersPartnerToAccessDropdownOption().click();}
    public void clickOnlyTenderersMayDownloadDropdownOption() {onlyTenderersMayDownloadDropdownOption().click();}
    public void clickSubcontractorQaDropdown() {subcontractorQAdropdown().click();}

    public void setNotifyAboutAnswersYes() {
        notifyAboutAnswersYes().click();
    }
    public void setNotifyAboutAnswersNo() {
        notifyAboutAnswersNo().click();
    }
    public void selectSupplementaryFilesAccepted() {
        WebElement employmentDropdown = driver.findElement(this.employmentDropdown);
        employmentDropdown.click();
        WebElement supplementaryFilesAcceptedOption = driver.findElement(this.supplementaryFilesAcceptedOption);
        supplementaryFilesAcceptedOption.click();
    }
    public void selectSupplementaryFilesNoAccepted() {
        WebElement employmentDropdown = driver.findElement(this.employmentDropdown);
        employmentDropdown.click();
        WebElement supplementaryFilesNoAcceptedOption = driver.findElement(this.supplementaryFilesNoAcceptedOption);
        supplementaryFilesNoAcceptedOption.click();
    }
    public void updateSecuritySettings() {
        WebElement securityDropdown = driver.findElement(this.securityDropdown);
        securityDropdown.click();
        WebElement seeTheStatusYes = driver.findElement(this.seeTheStatusYes);
        seeTheStatusYes.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String expectedTextPart = "Warning!";
        String actualText = alert.getText();
        Assert.assertTrue(actualText.contains(expectedTextPart));
        alert.accept();
        securityDropdown.click();
        WebElement seeTheStatusNo = driver.findElement(this.seeTheStatusNo);
        seeTheStatusNo.click();
    }
    public void updateQAhandlingNoYes() {
        WebElement QAmoduleUsedNo = driver.findElement(this.QAmoduleUsedNo);
        QAmoduleUsedNo.click();
        WebElement QAmoduleUsedYes = driver.findElement(this.QAmoduleUsedYes);
        QAmoduleUsedYes.click();
    }
    public void updateSendersVisibilitySettings() {
        WebElement sendersSettingsDropdown = driver.findElement(this.sendersSettingsDropdown);
        sendersSettingsDropdown.click();
        WebElement sendersHidden = driver.findElement(this.sendersHidden);
        sendersHidden.click();
        WebElement sendersRevealed = driver.findElement(this.sendersRevealed);
        sendersRevealed.click();

    }
    public void updatePublicationSettings() {
        WebElement publicationDropdown = driver.findElement(this.publicationDropdown);
        publicationDropdown.click();
        WebElement publicationDisabled = driver.findElement(this.publicationDisabled);
        publicationDisabled.click();
        WebElement publicationAnabled = driver.findElement(this.publicationAnabled);
        publicationAnabled.click();

    }
}

