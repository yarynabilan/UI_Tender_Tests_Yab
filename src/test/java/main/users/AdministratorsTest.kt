package main.users

import main.ApplicationsNavigationTest
import main.BaseTest
import main.PublicTenderPage
import main.TendersPage
import main.users.all.Administrators
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test

class AdministratorsTest : BaseTest() {
    private lateinit var tendersPage: TendersPage
    private lateinit var publicTenderPage: PublicTenderPage
    private lateinit var allUsers: AllUsers
    private lateinit var administrators: Administrators

    @BeforeMethod
     fun setUpTest() {
        tendersPage = TendersPage(driver)
        publicTenderPage = PublicTenderPage(driver)
        allUsers = AllUsers(driver)
        administrators = Administrators(driver)
        tendersPage.switchToBrowserFrame()
        publicTenderPage.clickOnElement(publicTenderPage.usersTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        allUsers.clickAdmTab()
        driver!!.switchTo().defaultContent()
    }
    @Test
    @Throws(InterruptedException::class, NullPointerException::class)
    fun AddTenderAdministrator() {
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