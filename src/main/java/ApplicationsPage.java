
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertTrue;
public class ApplicationsPage extends BasePage{
    public By tenderLink = By.xpath("//li[@id='docia_tender']");
    private final static String TITLE = "Applications page";
    public ApplicationsPage(WebDriver driver) {
        super(driver);
    }
    public WebElement tenderLink()
    {
        return driver.findElement((By) tenderLink);
    }
}
