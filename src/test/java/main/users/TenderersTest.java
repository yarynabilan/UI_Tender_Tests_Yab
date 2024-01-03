package main.users;

import main.ApplicationsNavigationTest;
import main.PublicTenderPage;
import main.TendersPage;
import main.users.all.ClientVendors;
import main.users.all.Tenderers;
import org.testng.annotations.Test;

public class TenderersTest extends ApplicationsNavigationTest {
    @Test
    public void addTenderers() throws InterruptedException, NullPointerException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getUsersTab());
        driver.switchTo().defaultContent();
        tendersPage.switchToDirectoryFrame();
        AllUsers allUsers = new AllUsers(driver);
        allUsers.clickTenderersTab();
        Tenderers tenderers = new Tenderers(driver);
        String mainWindowHandle = driver.getWindowHandle();
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        allUsers.clickAddUserButton();
        tendersPage.switchToNewWindowTest();
        tenderers.clickInviteUserLink();
        allUsers.enterEmail("yab@interlogic.dk");
        allUsers.confirmOK();
        tendersPage.switchToNewWindowTest();
        allUsers.confirmOK();
        tendersPage.switchToNewWindowTest();
        allUsers.clickCloseWindowButton();
        Thread.sleep(3000);

        driver.switchTo().window(mainWindowHandle);
        tendersPage.switchToNavigationFrame();
        allUsers.clickAddUserButton();
        tendersPage.switchToNewWindowTest();
        tenderers.clickInviteUserLink();
        allUsers.enterEmail("yarynatest3@meta.ua");
        tendersPage.switchToNewWindowTest();
        allUsers.confirmOK();
        allUsers.confirmOK();
        Thread.sleep(3000);
    }


    @Test
    public void addResendCanselUnregisterUser() throws InterruptedException, NullPointerException {
        // yarynabilantest2@gmail.com
}
}