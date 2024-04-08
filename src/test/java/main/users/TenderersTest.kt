package main.users

import io.qameta.allure.Description
import main.ApplicationsNavigationTest
import main.PublicTenderPage
import main.TendersPage
import main.users.all.Tenderers
import org.testng.annotations.Test

class TenderersTest : ApplicationsNavigationTest() {
    @Test(description = "Add Tenderers")
    @Description("This test adds Tenderers and performs some actions.")
    @Throws(InterruptedException::class)
    fun addTenderers() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.usersTab?.click()
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()

        val allUsers = AllUsers(driver)
        allUsers.clickTenderersTab()

        val tenderers = Tenderers(driver!!)

        val mainWindowHandle = driver!!.windowHandle
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()

        allUsers.clickAddUserButton()
        tendersPage.switchToNewWindowTest()
        tenderers.clickInviteUserLink()
        allUsers.enterEmail("yab@interlogic.dk")
        allUsers.confirmOK()
        tendersPage.switchToNewWindowTest()
        allUsers.confirmOK()
        tendersPage.switchToNewWindowTest()
        allUsers.clickCloseWindowButton()
        Thread.sleep(3000)

        driver!!.switchTo().window(mainWindowHandle)
        tendersPage.switchToNavigationFrame()
        allUsers.clickAddUserButton()
        tendersPage.switchToNewWindowTest()
        tenderers.clickInviteUserLink()
        allUsers.enterEmail("yarynatest3@meta.ua")
        tendersPage.switchToNewWindowTest()
        allUsers.confirmOK()
        allUsers.confirmOK()
        Thread.sleep(3000)
    }

    @Test(description = "Add, Resend, Cancel User")
    @Description("This test adds a user, resends the invitation, cancels the invitation.")
    @Throws(InterruptedException::class)
    fun addResendCancelUnregisterUser() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.usersTab?.click()
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()

        val allUsers = AllUsers(driver)
        allUsers.clickTenderersTab()

        val tenderers = Tenderers(driver!!)

        val mainWindowHandle = driver!!.windowHandle
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()

        allUsers.clickAddUserButton()
        tendersPage.switchToNewWindowTest()
        Thread.sleep(3000)

        tenderers.clickInviteUserLink()
        tendersPage.switchToNewWindowTest()
        allUsers.enterEmail("nadiabilan38@gmail.com")
        Thread.sleep(3000)

        allUsers.confirmOK()
        Thread.sleep(3000)
        tendersPage.switchToNewWindowTest()
        Thread.sleep(3000)

        allUsers.confirmOK()
        tendersPage.switchToNewWindowTest()
        Thread.sleep(3000)

        allUsers.clickCloseWindowButton()
        driver!!.switchTo().window(mainWindowHandle)

        Thread.sleep(3000)

        tendersPage.switchToDirectoryFrame()
        tenderers.selectInvitedUserProfile()
        tendersPage.switchToNewWindowTest()
        Thread.sleep(3000)

        tenderers.clickResendInvitationButton()
        driver!!.switchTo().window(mainWindowHandle)

        Thread.sleep(3000)

        tendersPage.switchToDirectoryFrame()
        tenderers.selectInvitedUserProfile()
        tendersPage.switchToNewWindowTest()
        tenderers.clickCancelInvitationButton()
    }
}
