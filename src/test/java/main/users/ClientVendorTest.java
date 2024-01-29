package main.users;

import main.ApplicationsNavigationTest;
import main.PublicTenderPage;
import main.TendersPage;
import main.users.all.ClientVendors;
import org.testng.annotations.Test;

public class ClientVendorTest  extends ApplicationsNavigationTest {
    @Test
    public void AddClientVendorTest() throws InterruptedException, NullPointerException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getUsersTab());
        driver.switchTo().defaultContent();
        tendersPage.switchToDirectoryFrame();
        AllUsers allUsers = new AllUsers(driver);
        allUsers.clickVendorsTab();
        ClientVendors clientVendors = new ClientVendors(driver);
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        allUsers.clickAddUserButton();
        tendersPage.switchToNewWindowTest();
        clientVendors.enterEmail("yarynabilan3833@gmail.com");
        clientVendors.enterName("Client Vendor 1 Test");
        clientVendors.enterMessage(" Hello Client Vendor 1 Test");
        allUsers.confirmOK();
    }
    @Test
    public void AddVendorAndResendInvitation() throws InterruptedException, NullPointerException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getUsersTab());
        driver.switchTo().defaultContent();
        tendersPage.switchToDirectoryFrame();
        AllUsers allUsers = new AllUsers(driver);
        allUsers.clickVendorsTab();
        ClientVendors clientVendors = new ClientVendors(driver);
        driver.switchTo().defaultContent();

        String mainWindowHandle = driver.getWindowHandle();

        tendersPage.switchToNavigationFrame();
        allUsers.clickAddUserButton();
        tendersPage.switchToNewWindowTest();
        clientVendors.enterEmail("yarynayaryna3833@gmail.com");
        clientVendors.enterName("Client Vendor 1 Test");
        clientVendors.enterMessage(" Hello Client Vendor 1 Test");
        clientVendors.selectDansk();
        allUsers.confirmOK();
        driver.switchTo().window(mainWindowHandle);

        Thread.sleep(3000);

        tendersPage.switchToDirectoryFrame();
        clientVendors.selectVendorProfile();
        tendersPage.switchToNewWindowTest();
        clientVendors.clickResendInvitationButton();
        tendersPage.switchToNewWindowTest();

        clientVendors.clickCloseButton();

    }
    @Test
    public void DeleteClientVendor() throws InterruptedException, NullPointerException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getUsersTab());
        driver.switchTo().defaultContent();
        tendersPage.switchToDirectoryFrame();
        AllUsers allUsers = new AllUsers(driver);
        allUsers.clickVendorsTab();
        ClientVendors clientVendors = new ClientVendors(driver);
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        Thread.sleep(3000);
        allUsers.clickRemoveUserButton();
        tendersPage.switchToNewWindowTest();
        clientVendors.selectVendorProfile();
        tendersPage.switchToNewWindowTest();
        allUsers.confirmOK();
}
}