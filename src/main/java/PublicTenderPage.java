import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

import static org.testng.Assert.assertTrue;

public class PublicTenderPage extends BasePage {
    private By tenderHeaderType = By.xpath("//div[@class='header_title' and @id='username']");
    private final static String TITLE = "Tenders";

    public PublicTenderPage(WebDriver driver) {
        super(driver);
    }

    public WebElement tenderHeaderType() {
        return driver.findElement(tenderHeaderType);

    }
}
