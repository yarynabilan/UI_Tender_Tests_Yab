package main.tenderInformation;
import org.openqa.selenium.WebDriver;
import lombok.Getter;
import main.PublicTenderPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
    private By supplementaryFilesAcceptedOption = By.xpath("//select[@class='contentNormal' and @name='multiplefiles']/option[1]");
    private By supplementaryFilesNoAcceptedOption = By.xpath("//select[@class='contentNormal' and @name='multiplefiles']/option[@selected='']");
    private By publicationDropdown = By.xpath("//select[@class='contentNormal' and @name='multiplefilespublication']");
    private By publicationDisabled = By.xpath("//select[@class='contentNormal' and @name='multiplefilespublication']/option[@selected='' and @value='0']\n");
    private By publicationAnabled = By.xpath("//select[@class='contentNormal' and @name='multiplefilespublication']/option[@value='1']\n");
    private By securityDropdown = By.xpath("//select[@class='contentNormal' and @name='tenderoffer']");
    private By seeTheStatusYes = By.xpath("//select[@class='contentNormal' and @name='tenderoffer']/option[@selected='' and @value='4']");
    private By seeTheStatusNo = By.xpath("//select[@class='contentNormal' and @name='tenderoffer']/option[@value='5']");
    private By licitationDropdown = By.xpath("//option[@value='0' and text()=\"No\"]");
    private By licitationYes = By.xpath("//option[@value='0' and text()=\"No\"]");
    private By licitationNo = By.xpath("//option[@value='0' and text()=\"No\"]");
    private By qaHandlingDropdown = By.xpath("//option[@value='0' and text()=\"No\"]");
    private By QAmoduleUsedYes = By.xpath("//option[@value='0' and text()=\"No\"]");
    private By QAmoduleUsedNo = By.xpath("//option[@value='0' and text()=\"No\"]");
    private By sendersSettingsDropdown = By.xpath("//option[@value='0' and text()=\"No\"]");
    private By sendersRevealed = By.xpath("//option[@value='0' and text()=\"No\"]");
    private By sendersHidden = By.xpath("//option[@value='0' and text()=\"No\"]");
    private final static String TITLE = "Tender Deadlines";

    public TenderSettings(WebDriver driver) {
        this.driver = driver;
    }

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

    public void clickOnAllowTendersPartnerToAccessDropdownOption() {
        allowTendersPartnerToAccessDropdownOption().click();
    }  public void clickOnlyTenderersMayDownloadDropdownOption() {
        onlyTenderersMayDownloadDropdownOption().click();
    }  public void clickSubcontractorQaDropdown() {
        subcontractorQAdropdown().click();
    }

    public void setNotifyAboutAnswersYes() {
        notifyAboutAnswersYes().click();
    }
    public void setNotifyAboutAnswersNo() {
        notifyAboutAnswersNo().click();
    }

}

