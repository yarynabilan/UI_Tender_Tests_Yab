
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Getter;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

@Getter
public class TenderInformationPanel extends PublicTenderPage {

    private final SelenideElement TenderInformationParentNode = $(byXpath("//*[@id=\"tender_information_node\"]/span"));
    private final SelenideElement TenderDescriptionSubTab = $(byXpath("//*[@id=\"tender_description_node\"]/span"));
    private final SelenideElement DeadlinesAndConditionsSubTab = $(byXpath("//*[@id=\"tender_timelimits_node\"]/span"));
    private final SelenideElement TenderSettingsSubTab = $(byXpath("//*[@id=\"tender_settings_node\"]/span"));

    public TenderInformationPanel(WebDriver driver) {
        super(driver);
    }

    @Step
    public void navigateToTenderInformation() {
        tenderInformationTab().click();
        //     new TenderInformationPanel();
    }
}