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

