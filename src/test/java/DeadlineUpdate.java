import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.Set;

import static org.testng.Assert.assertTrue;

public class DeadlineUpdate extends ApplicationsNavigationTest {

    @Test
    public void UpdateTenderDescription() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.navigateToApplications().applications().click();
        ApplicationsPage applicationsPage = new ApplicationsPage(driver);
        Thread.sleep(3000);
        applicationsPage.tenderLink().click();
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.openPublicTender();
        String mainWindowHandle = driver.getWindowHandle(); // збереження ідентифікатора поточного вікна
        Set<String> allWindowHandles = driver.getWindowHandles();
        String newWindowHandle = null;
        for (String windowHandle : allWindowHandles) {    // ідентифікатор нового вікна (яке не є поточним вікном)
            if (!windowHandle.equals(mainWindowHandle)) {
                newWindowHandle = windowHandle;
                break;}}

        driver.switchTo().window(newWindowHandle);
        //елемент, який вказує на фрейм на новій сторінці, наприклад, <iframe> або <frame>
        WebElement iframeElement = driver.findElement(By.xpath("//frame[@name='browser']"));
        driver.switchTo().frame(iframeElement);
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderInformationTab());

        driver.switchTo().defaultContent(); // Повернення до головного вікна сторінки
        WebElement frameDirectory = driver.findElement(By.xpath("//frame[@name='directory']"));
        driver.switchTo().frame(frameDirectory);
        TenderInformationPanel tenderInformationPanel = new TenderInformationPanel(driver);

        tenderInformationPanel.clickOnDeadlineSubTab();
        driver.switchTo().defaultContent();

        driver.switchTo().frame(frameDirectory);

       tenderInformationPanel.submissionDeadlineInput().clear();
       tenderInformationPanel.changeSubmissionDeadline("13:30");
        tenderInformationPanel.clickSaveButton();
        assertTrue(tenderInformationPanel.saveButton().isEnabled());
        driver.switchTo().defaultContent();


    }
}
