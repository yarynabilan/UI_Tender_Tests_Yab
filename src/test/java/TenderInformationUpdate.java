import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.Set;

public class TenderInformationUpdate extends ApplicationsNavigationTest {

    private TenderInformationUpdate tenderInformationUpdate;

    @Test
    public void navigateThoughtMainPanels() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.navigateToApplications().applications().click();
        ApplicationsPage applicationsPage = new ApplicationsPage(driver);

        WebDriverWait wait = new WebDriverWait(driver, 7); // Змінна wait для очікування

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
        TenderInformationPanel tenderInformationPanel = new TenderInformationPanel(driver);
        tenderInformationPanel.navigateToTenderInformation();
        tenderInformationPanel.navigateToTenderDescriptionSubTab();
        tenderInformationPanel.clickOnEditTenderDescriptionButton();


    }
}