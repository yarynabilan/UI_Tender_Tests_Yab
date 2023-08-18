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
    private By projectNoInput = By.xpath("//input[@class='contentNormal' and @type='TEXT' and @name='pn']");
    private By okButton = By.xpath("//input[@type='button' and @name='x']");
    //  private By deadlinesSubTab = By.xpath("//*[@id=\"tender_timelimits_node\"]/span");
    private By deadlinesSubTab = By.xpath("//img[@src='/images/info/large_tender_deadlines.png']");
    private By submissionDeadlineInput = By.xpath("//td[@class='value']//input[@type='text' and @class='time' and @name='PRI_endtime']");
    private By saveButton = By.xpath("//button[text()='Save']");

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

    public WebElement getEditTenderDescriptionButtonElement() {
        return driver.findElement(editTenderDescriptionButton);
    }
    public WebElement getInputElement(){
        return driver.findElement(projectNoInput);
    }
    public WebElement okButton(){
        return driver.findElement(okButton);
    }
    public WebElement submissionDeadlineInput(){
        return driver.findElement(submissionDeadlineInput);
    }public WebElement saveButton(){
        return driver.findElement(saveButton);
    }

    public void clickOnTenderDescriptionSubTab() {
        getTenderDescriptionSubTabElement().click();
    }
    public void clickOnDeadlineSubTab() {
        getDeadlinesSubTab().click();
    }
    public void clickSaveButton() {
        saveButton().click();
    }

    public void clickOnEditTenderDescriptionButton() {
        getEditTenderDescriptionButtonElement().click();
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

    }


