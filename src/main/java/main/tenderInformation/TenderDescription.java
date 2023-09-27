package main.tenderInformation;

import lombok.Getter;
import main.PublicTenderPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Getter
public class TenderDescription extends PublicTenderPage {
    private By tenderInformationExtendIcon = By.xpath("//*[@id=\"zpTreetree_tender_root_nodeNode2SignElement\"]/img");
    private By tenderDescriptionSubTab = By.xpath("//img[contains(@src, '/images/info/large_tender_description.png')]");
    private By editTenderDescriptionButton = By.xpath("//img[@src='https://testdociaweb.byggeweb.dk/images/buttons/edit_tender_on.png']");
    private By deadlinesAndConditionsSubTab = By.xpath("//*[@id=\"tender_timelimits_node\"]/span");
    private By editTenderSettingsButton = By.xpath("//img[@src=\"https://testdociaweb.byggeweb.dk/images/buttons/edit_tender_settings_on.png\" and @title=\"Edit tender settings\"]\n");
    private By tenderSettingsSubTab = By.xpath("//img[@src=\"/images/info/large_tender_settings.png\"]\n");
    private By accessDocumentsBySubcontractorDropdown = By.xpath("//select[@class=\"contentNormal\" and @name=\"subcontractor\"]");
    private By onlyTenderersMayDownloadDropdownOption = By.xpath("//option[@value=\"0\" and text()=\"Only tenderers may download\"]\n");
    private By projectNoInput = By.xpath("//input[@class='contentNormal' and @type='TEXT' and @name='pn']");
    private By contractingAuthorityInput = By.xpath("//input[@name='tenderowner']");
    private By contractTypeInput = By.xpath("//input[@name='contracttype']");
    private By descriptionInput = By.xpath("//textarea[@name='description']");
    private By contactPersonInput = By.xpath("//textarea[@name='contactperson']");
    private By okButton = By.xpath("//input[@type='button' and @name='x']");
    private By deadlinesSubTab = By.xpath("//img[@src='/images/info/large_tender_deadlines.png']");
    private By startDateHoursInput = By.xpath("//td[@class='value']//input[@type='text' and @class='time' and @name='PRI_starttime']");
    private By submissionDeadlineInput = By.xpath("//td[@class='value']//input[@type='text' and @class='time' and @name='PRI_endtime']");
    private By deadlineForReceivingQuestionsInput = By.xpath("//td[@class='value']//input[@type='text' and @class='time' and @name='PRI_qatime']");
    private By saveButton = By.xpath("//button[text()='Save']");
    private By directoryFrame = By.xpath("//frame[@name='directory']");
    private By awardCriteria = By.xpath("//select[@name='awardcriteria']");
    private By bestQualityOption = By.xpath("//option[@value='2' and text()='Best price/quality ratio']");
    private By tenderType = By.xpath("//select[@name='tendertype']");
    private By secretTypeOption = By.xpath("//select[@name='tendertype']/option[@value='4' and @data-procedure='7']");
    private By publicTypeOption = By.xpath("//select[@name='tendertype']/option[@value='1' and @data-procedure='1']");

    private final static String TITLE = "Tender";
    public TenderDescription(WebDriver driver) {
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
    public WebElement projectNoInput(){ return driver.findElement(projectNoInput);}
    public WebElement descriptionInput(){ return driver.findElement(descriptionInput);}
    public WebElement contractingAuthorityInput(){ return driver.findElement(contractingAuthorityInput);}
    public WebElement contractTypeInput(){ return driver.findElement(contractTypeInput);}
    public WebElement contactPersonInput(){ return driver.findElement(contactPersonInput);}
    public WebElement okButton(){
        return driver.findElement(okButton);
    }
    public WebElement startDateHoursInput(){return driver.findElement(startDateHoursInput);}
    public WebElement submissionDeadlineHoursInput(){return driver.findElement(submissionDeadlineInput);}
    public WebElement deadlineForReceivingQuestionsHoursInput(){return driver.findElement(deadlineForReceivingQuestionsInput);}
    public WebElement saveButton(){
        return driver.findElement(saveButton);
    }
    public WebElement accessDocumentsBySubcontractorDropdown(){return driver.findElement(accessDocumentsBySubcontractorDropdown);}
    public WebElement onlyTenderersMayDownloadDropdownOption(){return driver.findElement(onlyTenderersMayDownloadDropdownOption);}
    public WebElement directoryFrame(){return driver.findElement(directoryFrame);}
    public WebElement awardCriteria(){return driver.findElement(awardCriteria);}
    public WebElement bestQualityOption(){return driver.findElement(bestQualityOption);}
    public WebElement tenderType(){return driver.findElement(tenderType);}
    public WebElement secretTypeOption(){return driver.findElement(secretTypeOption);}
    public WebElement publicTypeOption(){return driver.findElement(publicTypeOption);}

    public void clickOnTenderDescriptionSubTab() {
        getTenderDescriptionSubTabElement().click();
    }
    public void clickOnAwardCriteriaDropdown() {
        awardCriteria().click();  }
    public void clickOnTenderTypeDropdown() {
        tenderType().click();  }
    public void changeTenderTypeToSecret() {
        secretTypeOption().click();  }
    public void changeTenderTypeToPublic() {
        publicTypeOption().click();  }

    public void clickOnBestQualityOption() {
            bestQualityOption().click();
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
    public TenderDescription fillInProjectNo(String test) {
        WebElement projectNoInput = projectNoInput();
        projectNoInput.clear();
        projectNoInput.sendKeys(test);
        return this;
    }
        public TenderDescription fillInDescriptionInput(String descriptionInputText) {
            WebElement descriptionInput = descriptionInput();
            descriptionInput.clear();
            descriptionInput.sendKeys(descriptionInputText);
            return this;
    }
    public TenderDescription fillInContractingAuthorityInput(String ContractingAuthorityFieldTest){
        WebElement contractingAuthorityInput = projectNoInput();
        contractingAuthorityInput.clear();
        contractingAuthorityInput.sendKeys(ContractingAuthorityFieldTest);
        return this;
    }  public TenderDescription fillInContractTypeInput(String contractTypeInputFieldTest){
        WebElement contractTypeInput = contractTypeInput();
        contractTypeInput.clear();
        contractTypeInput.sendKeys(contractTypeInputFieldTest);
        return this;
    }
        public TenderDescription fillInContactPersonInput(String contactPersonInputTextTest){
        WebElement contactPersonInput = contactPersonInput();
            contactPersonInput.clear();
            contactPersonInput.sendKeys(contactPersonInputTextTest);
        return this;
    }
    public TenderDescription changeSubmissionDeadline(String newTime) {
        WebElement inputElementTime = submissionDeadlineHoursInput(); // Виправлено тут
        inputElementTime.clear();
        inputElementTime.sendKeys(newTime); // Виправлено тут
        return this;
    }
    public TenderDescription changeDeadlineForReceivingQuestions(String newTime) {
        WebElement inputElementTime = deadlineForReceivingQuestionsHoursInput();
        inputElementTime.clear();
        inputElementTime.sendKeys(newTime);
        return this;
    }public TenderDescription changeStartDateHours(String newTime) {
        WebElement inputElementTime = startDateHoursInput();
        inputElementTime.clear();
        inputElementTime.sendKeys(newTime);
        return this;
    }
    public void switchToDirectoryFrame() {
        driver.switchTo().frame((WebElement) directoryFrame);
    }

    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }
    }


