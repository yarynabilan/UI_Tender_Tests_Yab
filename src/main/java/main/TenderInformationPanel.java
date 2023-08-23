package main;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Getter
public class TenderInformationPanel extends PublicTenderPage {
    private By tenderInformationExtendIcon = By.xpath("//*[@id=\"zpTreetree_tender_root_nodeNode2SignElement\"]/img");
    private By tenderDescriptionSubTab = By.xpath("//img[contains(@src, '/images/info/large_tender_description.png')]");
    private By editTenderDescriptionButton = By.xpath("//img[@src='https://testdociaweb.byggeweb.dk/images/buttons/edit_tender_on.png']");
    private By deadlinesAndConditionsSubTab = By.xpath("//*[@id=\"tender_timelimits_node\"]/span");
    private By editTenderSettingsButton = By.xpath("//img[@src=\"https://testdociaweb.byggeweb.dk/images/buttons/edit_tender_settings_on.png\" and @title=\"Edit tender settings\"]\n");
    private By tenderSettingsSubTab = By.xpath("//img[@src=\"/images/info/large_tender_settings.png\"]\n");
    private By accessDocumentsBySubcontractorDropdown = By.xpath("//select[@class=\"contentNormal\" and @name=\"subcontractor\"]");
    private By onlyTenderersMayDownloadDropdownOption = By.xpath("//option[@value=\"0\" and text()=\"Only tenderers may download\"]\n");
    private By projectNoInput = By.xpath("//input[@class='contentNormal' and @type='TEXT' and @name='pn']");
    private By okButton = By.xpath("//input[@type='button' and @name='x']");
    private By deadlinesSubTab = By.xpath("//img[@src='/images/info/large_tender_deadlines.png']");
    private By submissionDeadlineInput = By.xpath("//td[@class='value']//input[@type='text' and @class='time' and @name='PRI_endtime']");
    private By saveButton = By.xpath("//button[text()='Save']");
    private By directoryFrame = By.xpath("//frame[@name='directory']");

    private final static String TITLE = "Tender";
    public TenderInformationPanel(WebDriver driver) {
        super(driver);
    }

    public WebElement getTenderDescriptionSubTabElement() {
        return driver.findElement(tenderDescriptionSubTab);
    }
    public WebElement getDeadlinesSubTab() {
        return driver.findElement(deadlinesSubTab);
    }
    public WebElement getTenderSettingsSubTab() {return driver.findElement(tenderSettingsSubTab);}
    public WebElement getEditTenderDescriptionButtonElement() { return driver.findElement(editTenderDescriptionButton);}
    public WebElement getEditTenderSettingsButton() { return driver.findElement(editTenderSettingsButton); }
    public WebElement getInputElement(){ return driver.findElement(projectNoInput);}
    public WebElement okButton(){
        return driver.findElement(okButton);
    }
    public WebElement submissionDeadlineInput(){return driver.findElement(submissionDeadlineInput);}
    public WebElement saveButton(){
        return driver.findElement(saveButton);
    }
    public WebElement accessDocumentsBySubcontractorDropdown(){return driver.findElement(accessDocumentsBySubcontractorDropdown);}
    public WebElement onlyTenderersMayDownloadDropdownOption(){return driver.findElement(onlyTenderersMayDownloadDropdownOption);}
    public WebElement directoryFrame(){return driver.findElement(directoryFrame);}

    public void clickOnTenderDescriptionSubTab() {
        getTenderDescriptionSubTabElement().click();
    }
    public void clickOnDeadlineSubTab() {
        getDeadlinesSubTab().click();
    }
    public void clickSaveButton() {
        saveButton().click();
    }
    public void clickOnTenderSettingsSubTab() { getTenderSettingsSubTab().click(); }
    public void clickOnEditTenderSettingsButton() { getEditTenderSettingsButton().click(); }

    public void clickOnEditTenderDescriptionButton() {
        getEditTenderDescriptionButtonElement().click();
    }
    public void clickOnAccessDocumentsBySubcontractorDropdown() {
        accessDocumentsBySubcontractorDropdown().click();
    }public void clickOnlyTenderersMayDownloadDropdownOption() {
        onlyTenderersMayDownloadDropdownOption().click();
    }
    public TenderInformationPanel enterTextInInput(String test){
        WebElement inputElement = getInputElement();
        inputElement.clear();
        inputElement.sendKeys(test);
        return this;
    }
    public TenderInformationPanel changeSubmissionDeadline(String newTime) {
        WebElement inputElementTime = submissionDeadlineInput(); // Виправлено тут
        inputElementTime.clear();
        inputElementTime.sendKeys(newTime); // Виправлено тут
        return this;
    }
    public void switchToDirectoryFrame() {
        driver.switchTo().frame((WebElement) directoryFrame);
    }

    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }
    }


