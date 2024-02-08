package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.Set;

import static org.testng.Assert.assertTrue;

public class TendersPage extends BasePage {

    //   List<WebElement> repositoriesList = driver.findElements(By.xpath("//td[text() = 'AutoTest Public Tender']"));

    private By publicTenderLink = By.xpath("//td[text() = 'AutoTest Public Tender']");
//    private By limitedTenderLink = By.xpath("//td[text() = 'Limited Test rib']");
    private By limitedTenderLink = By.xpath("//td[text() = 'Limited 110 Sprint Tender']");
    private By browserFrame = By.xpath("//frame[@name='browser']");
    private By functionsFrame = By.xpath("//frame[@name='functions']");
    private By navigationFrame = By.xpath("//frame[@name='navigation']");
    private By directoryFrame = By.xpath("//frame[@name='directory']");
    private By fileDetailsFrame = By.xpath("//frame[@name='filespec']");
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
    public void switchToFileDetailsFrame() {driver.switchTo().frame(driver.findElement(fileDetailsFrame));
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

        driver.switchTo().window(newWindowHandle);
    }
        public void switchToPreviousWindow() {
            Set<String> windowHandles = driver.getWindowHandles();

            // Якщо є більше одного вікна, то можна повернутися до попереднього
            if (windowHandles.size() > 1) {
                Iterator<String> iterator = windowHandles.iterator();
                String currentWindow = iterator.next();
                String previousWindow = iterator.next();

                driver.switchTo().window(previousWindow);
            } else {
                System.out.println("No previous window");
            }
        }
}


