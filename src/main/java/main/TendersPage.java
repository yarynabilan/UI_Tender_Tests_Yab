package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Set;

import static org.testng.Assert.assertTrue;

public class TendersPage extends BasePage {

    //   List<WebElement> repositoriesList = driver.findElements(By.xpath("//td[text() = 'AutoTest Public Tender']"));

    private By publicTenderLink = By.xpath("//td[text() = 'AutoTest Public Tender']");
    private By limitedTenderLink = By.xpath("//td[text() = 'Limited Test rib']");

    private By browserFrame = By.xpath("//frame[@name='browser']");
    private By functionsFrame = By.xpath("//frame[@name='functions']");
    private By navigationFrame = By.xpath("//frame[@name='navigation']");
    private By directoryFrame = By.xpath("//frame[@name='directory']");
    private final static String TITLE = "Tenders";

    public TendersPage(WebDriver driver) {
        super(driver);
    }

    public TendersPage openPublicTender() {
        driver.findElement(limitedTenderLink).click();
        return this;
    }
    public TendersPage openLimitedTender() {
        driver.findElement(limitedTenderLink).click();
        return this;
    }

    public void switchToBrowserFrame() {
        driver.switchTo().frame(driver.findElement(browserFrame));
    }

    public void switchToFunctionsFrame() {
        driver.switchTo().frame(driver.findElement(functionsFrame));
    }

    public void switchToNavigationFrame() {
        driver.switchTo().frame(driver.findElement(navigationFrame));
    }

    public void switchToDirectoryFrame() {
        driver.switchTo().frame(driver.findElement(directoryFrame));
    }

    public void switchToNewWindow() {
        String mainWindowHandle = driver.getWindowHandle(); // Зберегти ідентифікатор поточного вікна

        // Знайти ідентифікатор нового вікна
        String newWindowHandle = null;
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String windowHandle : allWindowHandles) {
            if (!windowHandle.equals(mainWindowHandle)) {
                newWindowHandle = windowHandle;
                break;
            }
        }

        // Переключитися на нове вікно
        driver.switchTo().window(newWindowHandle);

}}


