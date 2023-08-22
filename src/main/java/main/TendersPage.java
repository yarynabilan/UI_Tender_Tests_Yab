package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

