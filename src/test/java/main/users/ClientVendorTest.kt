package main.users

import main.ApplicationsNavigationTest
import main.PublicTenderPage
import main.TendersPage
import main.users.all.ClientVendors
import org.testng.annotations.Test

class ClientVendorTest : ApplicationsNavigationTest() {
    @Test
    @Throws(InterruptedException::class, NullPointerException::class)
    fun AddClientVendorTest() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.usersTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        val allUsers = AllUsers(driver)
        allUsers.clickVendorsTab()
        val clientVendors = ClientVendors(driver!!)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        allUsers.clickAddUserButton()
        tendersPage.switchToNewWindowTest()
        clientVendors.enterEmail("yarynabilan3833@gmail.com")
        clientVendors.enterName("Client Vendor 1 Test")
        clientVendors.enterMessage(" Hello Client Vendor 1 Test")
        allUsers.confirmOK()
    }

    @Test
    @Throws(InterruptedException::class, NullPointerException::class)
    fun AddVendorAndResendInvitation() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.usersTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        val allUsers = AllUsers(driver)
        allUsers.clickVendorsTab()
        val clientVendors = ClientVendors(driver!!)
        driver!!.switchTo().defaultContent()

        val mainWindowHandle = driver!!.windowHandle

        tendersPage.switchToNavigationFrame()
        allUsers.clickAddUserButton()
        tendersPage.switchToNewWindowTest()
        clientVendors.enterEmail("yarynayaryna3833@gmail.com")
        clientVendors.enterName("Client Vendor 1 Test")
        clientVendors.enterMessage(" Hello Client Vendor 1 Test")
        clientVendors.selectDansk()
        allUsers.confirmOK()
        driver!!.switchTo().window(mainWindowHandle)

        Thread.sleep(3000)

        tendersPage.switchToDirectoryFrame()
        clientVendors.selectVendorProfile()
        tendersPage.switchToNewWindowTest()
        clientVendors.clickResendInvitationButton()
        tendersPage.switchToNewWindowTest()

        clientVendors.clickCloseButton()
    }

    @Test
    @Throws(InterruptedException::class, NullPointerException::class)
    fun DeleteClientVendor() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.usersTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        val allUsers = AllUsers(driver)
        allUsers.clickVendorsTab()
        val clientVendors = ClientVendors(driver!!)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        Thread.sleep(3000)
        allUsers.clickRemoveUserButton()
        tendersPage.switchToNewWindowTest()
        clientVendors.selectVendorProfile()
        tendersPage.switchToNewWindowTest()
        allUsers.confirmOK()
    }
}