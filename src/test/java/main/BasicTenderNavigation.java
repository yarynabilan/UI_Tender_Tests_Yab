package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.Set;
import static org.testng.Assert.assertTrue;
public class BasicTenderNavigation extends OpenTenderTest {

    private PublicTenderPage PublicTenderPage;

    @Test
    public void navigationPublicTenderTab() {
        MainPage mainPage = new MainPage(driver);
        mainPage.navigateToApplications().applications().click();
        ApplicationsPage applicationsPage = new ApplicationsPage(driver);
        applicationsPage.tenderLink().click();
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.openPublicTender();

        // Переключитись на нову сторінку
        String mainWindowHandle = driver.getWindowHandle(); // збереження ідентифікатора поточного вікна
        Set<String> allWindowHandles = driver.getWindowHandles();
        String newWindowHandle = null;

        // ідентифікатор нового вікна (яке не є поточним вікном)
        for (String windowHandle : allWindowHandles) {
            if (!windowHandle.equals(mainWindowHandle)) {
                newWindowHandle = windowHandle;
                break;
            }
        }
        driver.switchTo().window(newWindowHandle);
        //елемент, який вказує на фрейм на новій сторінці, наприклад, <iframe> або <frame>
        WebElement iframeElement = driver.findElement(By.xpath("//frame[@name='browser']"));
        driver.switchTo().frame(iframeElement);

        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.publicTenderTab().click();
        assertTrue(publicTenderPage.publicTenderTab().isEnabled());
    }

    @Test(description = "Navigation through all modules")
    public void basicNavigation() {
        MainPage mainPage = new MainPage(driver);
        mainPage.navigateToApplications().applications().click();
        ApplicationsPage applicationsPage = new ApplicationsPage(driver);
        applicationsPage.tenderLink().click();
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.openPublicTender();

        // Переключитись на нову сторінку
        String mainWindowHandle = driver.getWindowHandle(); // збереження ідентифікатора поточного вікна
        Set<String> allWindowHandles = driver.getWindowHandles();
        String newWindowHandle = null;

        // ідентифікатор нового вікна (яке не є поточним вікном)
        for (String windowHandle : allWindowHandles) {
            if (!windowHandle.equals(mainWindowHandle)) {
                newWindowHandle = windowHandle;
                break;
            }
        }
        driver.switchTo().window(newWindowHandle);
        //елемент, який вказує на фрейм на новій сторінці, наприклад, <iframe> або <frame>
        WebElement iframeElement = driver.findElement(By.xpath("//frame[@name='browser']"));
        driver.switchTo().frame(iframeElement);

        main.PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.tenderInformationTab().click();

        assertTrue(publicTenderPage.tenderInformationTab().isEnabled());
    }


    @Test
    public void navigateThoughtMainPanels() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.navigateToApplications().applications().click();
        ApplicationsPage applicationsPage = new ApplicationsPage(driver);

        WebDriverWait wait = new WebDriverWait(driver, 5); // Змінна wait для очікування

        // Очікування перед кліком на елемент
        wait.until(ExpectedConditions.elementToBeClickable(applicationsPage.tenderLink()));
        applicationsPage.tenderLink().click();

        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.openPublicTender();

        // Переключитись на нову сторінку
        String mainWindowHandle = driver.getWindowHandle(); // збереження ідентифікатора поточного вікна
        Set<String> allWindowHandles = driver.getWindowHandles();
        String newWindowHandle = null;

        // ідентифікатор нового вікна (яке не є поточним вікном)
        for (String windowHandle : allWindowHandles) {
            if (!windowHandle.equals(mainWindowHandle)) {
                newWindowHandle = windowHandle;
                break;
            }
        }
        driver.switchTo().window(newWindowHandle);
        //елемент, який вказує на фрейм на новій сторінці, наприклад, <iframe> або <frame>
        WebElement iframeElement = driver.findElement(By.xpath("//frame[@name='browser']"));
        driver.switchTo().frame(iframeElement);
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderInformationTab());
        publicTenderPage.clickOnElement(publicTenderPage.getSubmissionRequirementsTab());
        publicTenderPage.clickOnElement(publicTenderPage.getTenderSpecificationDocumentsTab());
        publicTenderPage.clickOnElement(publicTenderPage.getQuestionsAndAnswersTab());
        publicTenderPage.clickOnElement(publicTenderPage.getMessagesfromTenderAdministratorTab());
        publicTenderPage.clickOnElement(publicTenderPage.getUsersTab());
        publicTenderPage.clickOnElement(publicTenderPage.getLogFilesTab());
        publicTenderPage.clickOnElement(publicTenderPage.getGuidanceTab());
        publicTenderPage.clickOnElement(publicTenderPage.getSubmittedTenderOffersTab());
        publicTenderPage.clickOnElement(publicTenderPage.getTenderResultTab());

    }
}