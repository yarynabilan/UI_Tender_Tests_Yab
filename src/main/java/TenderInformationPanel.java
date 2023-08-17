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

    private final static String TITLE = "Tender";

    public TenderInformationPanel(WebDriver driver) {
        super(driver);
    }

    public WebElement getTenderDescriptionSubTabElement() {
        return driver.findElement(tenderDescriptionSubTab);
    }

    public WebElement getEditTenderDescriptionButtonElement() {
        return driver.findElement(editTenderDescriptionButton);
    }
    public WebElement getInputElement(){
        return driver.findElement(projectNoInput);
    }

    public void clickOnTenderDescriptionSubTab() {
        getTenderDescriptionSubTabElement().click();
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

}
