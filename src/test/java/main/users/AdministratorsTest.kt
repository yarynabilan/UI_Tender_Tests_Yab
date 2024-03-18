package main.users

import main.ApplicationsNavigationTest
import main.PublicTenderPage
import main.TendersPage
import main.users.all.Administrators
import org.testng.annotations.Test

class AdministratorsTest : ApplicationsNavigationTest() {
    @Test
    @Throws(InterruptedException::class, NullPointerException::class)
    fun AddTenderAdministrator() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.usersTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        val allUsers = AllUsers(driver)
        allUsers.clickAdmTab()
        val administrators = Administrators(driver!!)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        allUsers.clickAddUserButton()
        tendersPage.switchToNewWindowTest()
        administrators.clickAddAdministratorLink()
        Thread.sleep(3000)
        administrators.fillInTextFieldForEmailInput("yarynatest2@gmail.com")
        allUsers.confirmOK()
        allUsers.confirmOK()
        Thread.sleep(3000)
    }

    @Test
    @Throws(InterruptedException::class, NullPointerException::class)
    fun AddDocCoordinatorTest() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.usersTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        val allUsers = AllUsers(driver)
        allUsers.clickAdmTab()
        val administrators = Administrators(driver!!)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        allUsers.clickAddUserButton()
        tendersPage.switchToNewWindowTest()
        administrators.clickAddDocumentCoordinatorLink()
        Thread.sleep(3000)
        administrators.fillInTextFieldForEmailInput("yarynatest1@ukr.net")
        allUsers.confirmOK()
        allUsers.confirmOK()
        Thread.sleep(3000)
    }

    @Test
    @Throws(InterruptedException::class, NullPointerException::class)
    fun AddObserverTest() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.usersTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        val allUsers = AllUsers(driver)
        allUsers.clickAdmTab()
        val administrators = Administrators(driver!!)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        allUsers.clickAddUserButton()
        tendersPage.switchToNewWindowTest()
        administrators.clickAddObserverLink()
        Thread.sleep(3000)
        administrators.fillInTextFieldForEmailInput("yarynatest@yahoo.com")
        allUsers.confirmOK()
        allUsers.confirmOK()
        Thread.sleep(3000)
    }

    @Test
    @Throws(InterruptedException::class, NullPointerException::class)
    fun AddObserverTest2() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.usersTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        val allUsers = AllUsers(driver)
        allUsers.clickAdmTab()
        val administrators = Administrators(driver!!)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        allUsers.clickAddUserButton()
        tendersPage.switchToNewWindowTest()
        administrators.clickAddObserverLink()
        Thread.sleep(3000)
        administrators.fillInTextFieldForEmailInput("yarynabilan@gmail.com")
        allUsers.confirmOK()
        allUsers.confirmOK()
        Thread.sleep(3000)
    }

    @Test
    @Throws(InterruptedException::class)
    fun UpdateProfile() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.usersTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        val allUsers = AllUsers(driver)
        allUsers.clickAdmTab()
        val administrators = Administrators(driver!!)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        administrators.clickOnUserToUpdateProfile()
        tendersPage.switchToNewWindowTest()
        administrators.clickOnAdminProfileDropdown()
        administrators.selectTenderAdminProfile()
        administrators.selectFullAccessType()
        allUsers.confirmOK()
        Thread.sleep(3000)
    }
}