
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertTrue;
public class ApplicationsPage {

    private final SelenideElement tenderLink = $(byXpath("//li[@id='docia_tender']"));

    public ApplicationsPage(WebDriver driver) {


    }
}
//    public WebElement tenderLink()
//    {
//        return driver.findElement(tenderLink);
//    }
//}


//    public void clickOnTender() {
//        tenderLink.click();
//    }
//}