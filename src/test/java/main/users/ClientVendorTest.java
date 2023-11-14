package main.users;

import main.ApplicationsNavigationTest;
import main.PublicTenderPage;
import main.TendersPage;
import main.users.all.Administrators;
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
    public void AddDa() throws InterruptedException, NullPointerException {
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
        clientVendors.enterEmail("yarynayaryna3833@gmail.com");
        clientVendors.enterName("Client Vendor 1 Test");
        clientVendors.enterMessage(" Hello Client Vendor 1 Test");
        clientVendors.selectDansk();
        allUsers.confirmOK();
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();


    }
}