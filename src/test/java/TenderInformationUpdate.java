import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.Set;

import static org.testng.Assert.assertTrue;

public class TenderInformationUpdate extends ApplicationsNavigationTest {

    private TenderInformationUpdate tenderInformationUpdate;

    @Test
    public void UpdateTenderDescription() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);

        mainPage.navigateToApplications().applications().click();
        ApplicationsPage applicationsPage = new ApplicationsPage(driver);

        //       WebDriverWait wait = new WebDriverWait(driver, 8); // Змінна wait для очікування
        //       wait.until(ExpectedConditions.elementToBeClickable(applicationsPage.tenderLink));
        Thread.sleep(3000);
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


        driver.switchTo().defaultContent(); // Повернення до головного вікна сторінки
// Знову "прив'язка" вебдрайвера до поточного потоку
        WebDriverWait driverWait = new WebDriverWait(driver, 10); // Зміна wait для очікування
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//frame[@name='directory']")));
        WebElement frameDirectory = driver.findElement(By.xpath("//frame[@name='directory']"));
        driver.switchTo().frame(frameDirectory);
        TenderInformationPanel tenderInformationPanel = new TenderInformationPanel(driver);
// Продовження взаємодії з елементами в фреймі
        tenderInformationPanel.clickOnTenderDescriptionSubTab();
//        assertTrue(tenderInformationPanel.getTenderDescriptionSubTabElement().isDisplayed());
        //      tenderInformationPanel.clickOnEditTenderDescriptionButton();
        driver.switchTo().defaultContent(); // Повернення до головного вікна сторінки
// Знову "прив'язка" вебдрайвера до поточного потоку

        WebElement frameNavigation = driver.findElement(By.xpath("//frame[@name='navigation']"));
        driver.switchTo().frame(frameNavigation);
        tenderInformationPanel.clickOnEditTenderDescriptionButton();

// Переключитись на нове вікно або поп-ап
        Set<String> allWindowHandlestest = driver.getWindowHandles();

        for (String windowHandle2 : allWindowHandlestest) {
            if (!windowHandle2.equals(mainWindowHandle)) {
                driver.switchTo().window(windowHandle2);
            }
        }
        Thread.sleep(3000);
        //  WebDriverWait wait = new WebDriverWait(driver, 10);
     //   wait.until(ExpectedConditions.visibilityOf(tenderInformationPanel.getInputElement()));
        tenderInformationPanel.enterTextInInput("test");


    }
}