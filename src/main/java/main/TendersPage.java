package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertTrue;

public class TendersPage extends BasePage {

    //   List<WebElement> repositoriesList = driver.findElements(By.xpath("//td[text() = 'AutoTest Public Tender']"));

    private By publicTenderLink = By.xpath("//td[text() = 'AutoTest Public Tender']");
    private By browserFrame = By.xpath("//frame[@name='browser']");
    private By functionsFrame = By.xpath("//frame[@name='functions']");
    private final static String TITLE = "Tenders";

    public TendersPage(WebDriver driver) {
        super(driver);
    }

    public TendersPage openPublicTender() {
        driver.findElement(publicTenderLink).click();
        return this;
    }

//    public WebElement browserFrame() {
//        return driver.findElement(browserFrame);
//    }
    public WebElement functionsFramme() {
        return driver.findElement(functionsFrame);
    }

    public void switchToBrowserFrame() {
        driver.switchTo().frame(driver.findElement(browserFrame));
    }    public void switchToFunctionsFrame() {
        driver.switchTo().frame(driver.findElement(functionsFrame));
    }
    }


