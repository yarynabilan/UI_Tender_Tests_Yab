import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Set;

import static org.testng.Assert.assertTrue;

public class OpenTenderTest extends ApplicationsNavigationTest {
    @Test
    public void openTenderTest() {
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
        WebElement iframeElement = driver.findElement(By.xpath("//frame[@name='functions']"));
        driver.switchTo().frame(iframeElement);

        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        assertTrue(publicTenderPage.tenderAdminProfile().isDisplayed());

        // Після перевірки можна повернутися назад на основне вікно або виконати необхідні дії на сторінці
   //     driver.switchTo().defaultContent(); // Повернутися назад на основне вікно
        // Або виконати необхідні дії на сторінці
    }
}
