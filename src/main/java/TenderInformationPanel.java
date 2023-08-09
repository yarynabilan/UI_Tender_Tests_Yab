
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

@Getter
public class TenderInformationPanel extends PublicTenderPage {

 // public TenderInformationTab tenderInformationTab;
 // public TenderDescriptionSubTab tenderDescriptionSubTab;
 //   private final SelenideElement TenderInformationPanel = $(byXpath("//*[@id=\"tender_information_node\"]/span"));
    private final SelenideElement TenderDescriptionSubTab = $(byXpath("//*[@id=\"tender_description_node\"]/span"));
    private final SelenideElement editTenderDescriptionButton = $(byXpath("//*[@id=\"tender_description_node\"]/span"));

    private final SelenideElement DeadlinesAndConditionsSubTab = $(byXpath("//*[@id=\"tender_timelimits_node\"]/span"));
    private final SelenideElement TenderSettingsSubTab = $(byXpath("//*[@id=\"tender_settings_node\"]/span"));

    private final static String TITLE = "Tender";

    public TenderInformationPanel(WebDriver driver) {
        super(driver);
    }

    public WebElement TenderDescriptionSubTab() {
        return driver.findElement((By) TenderDescriptionSubTab);

    }
    public WebElement TenderDescriptionEditButton() {
        return driver.findElement((By) editTenderDescriptionButton);

    }
    public void clickOnElement(By elementLocator){
        driver.findElement(elementLocator).click();
    }
    @Step
    public void navigateToTenderInformation() {
        tenderInformationTab().click();
        //     new TenderInformationPanel();
    }
    @Step
    public void navigateToTenderDescriptionSubTab() {
        TenderDescriptionSubTab.click();
    } @Step
    public void clickOnEditTenderDescriptionButton() {
        editTenderDescriptionButton.click();
    }
}