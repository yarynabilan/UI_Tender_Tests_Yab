import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

import static org.testng.Assert.assertTrue;

public class TendersPage extends BasePage {

 //   List<WebElement> repositoriesList = driver.findElements(By.xpath("//td[text() = 'AutoTest Public Tender']"));

    private By publicTenderLink = By.xpath("//td[text() = 'AutoTest Public Tender']");
    private final static String TITLE = "Tenders";

    public TendersPage(WebDriver driver) {
        super(driver);
    }

    public TendersPage openPublicTender(){
        driver.findElement(publicTenderLink).click();
        return this;
        }
    }

//    public List<String> getRepositories() {
//        List<String> repositList = repositoriesList.stream().map(rep -> rep.getText()).collect(Collectors.toList());
//        return repositList;
//    }
//}

