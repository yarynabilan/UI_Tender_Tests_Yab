package main.users;

import main.ApplicationsNavigationTest;
import main.PublicTenderPage;
import main.TendersPage;
import main.questionAndAnswers.NewQuestions;
import main.users.all.Administrators;
import org.testng.annotations.Test;

public class AdministratorsTest extends ApplicationsNavigationTest {
    @Test
    public void AddTenderAdministrator() throws InterruptedException, NullPointerException {
            TendersPage tendersPage = new TendersPage(driver);
            tendersPage.switchToBrowserFrame();
            PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
            publicTenderPage.clickOnElement(publicTenderPage.getUsersTab());
            driver.switchTo().defaultContent();
            tendersPage.switchToDirectoryFrame();
            AllUsers allUsers = new AllUsers(driver);
            allUsers.clickAdmTab();
            Administrators administrators = new Administrators(driver);
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        allUsers.clickAddUserButton();
        tendersPage.switchToNewWindowTest();
        administrators.clickAddAdministratorLink();
        Thread.sleep(3000);

        //  tendersPage.switchToNewWindowTest();
            administrators.fillInTextFieldForEmailInput("yarynatest2@gmail.com");
            allUsers.confirmOK();
        Thread.sleep(3000);

    }
}