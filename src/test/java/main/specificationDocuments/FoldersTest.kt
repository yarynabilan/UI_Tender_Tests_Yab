package main.specificationDocuments

import main.BaseTest
import main.PublicTenderPage
import main.TendersPage
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test

class FoldersTest : BaseTest() {
    private lateinit var tendersPage: TendersPage
    private lateinit var publicTenderPage: PublicTenderPage
    private lateinit var folders: Folders
    @BeforeMethod
    fun setUpTest() {
        tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.tenderSpecificationDocumentsTab?.click()
        folders = Folders(driver)
    }
    @Test
    fun CreateFolder() {
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        Thread.sleep(3000)
        folders.clickOnCreateFolderButton()
        Thread.sleep(3000)
        tendersPage.switchToNewWindowTest()
        folders.fillInFolderName("Folder A")
        folders.clickOnOkButton()
        Thread.sleep(3000)
    }

    @Test
    fun CreateFolderWithSubFolder() {
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        val mainWindowHandle = driver!!.windowHandle
        Thread.sleep(3000)
        folders.clickOnCreateFolderButton()
        Thread.sleep(3000)
        tendersPage.switchToNewWindowTest()
        folders.fillInFolderName("Folder S")
        folders.clickOnOkButton()
        Thread.sleep(3000)
        driver!!.switchTo().window(mainWindowHandle)
        Thread.sleep(3000)
        tendersPage.switchToNavigationFrame()
        folders.clickOnCreateFolderButton()
        tendersPage.switchToNewWindowTest()
        Thread.sleep(3000)
        folders.fillInFolderName("subFolder")
        folders.clickOnOkButton()
        Thread.sleep(3000)
    }

    @Test
    fun CreateEditDeleteFolder() {
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        val mainWindowHandle = driver!!.windowHandle
        Thread.sleep(3000)
        folders.clickOnCreateFolderButton()
        Thread.sleep(3000)
        tendersPage.switchToNewWindowTest()
        folders.fillInFolderName("ToRenameAndDeleteh")
        folders.clickOnOkButton()
        Thread.sleep(3000)
        driver!!.switchTo().window(mainWindowHandle)
        tendersPage.switchToNavigationFrame()
        Thread.sleep(3000)
        folders.clickOnRenameFolderButton()
        Thread.sleep(3000)
        tendersPage.switchToNewWindowTest()
        folders.fillInFolderName("renamed")
        folders.clickOnOkButton()
        driver!!.switchTo().window(mainWindowHandle)
        tendersPage.switchToNavigationFrame()
        Thread.sleep(3000)
        folders.clickOnDeleteOnFolderButton()
        Thread.sleep(3000)
        tendersPage.switchToNewWindowTest()
        folders.clickOnOkButton()
        Thread.sleep(3000)
        val alert = driver!!.switchTo().alert()
        alert.accept()
        Thread.sleep(2000)
    }

    @Test
    fun CreateFolderWithAlreadyExistingName() {
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        Thread.sleep(3000)
        folders.clickOnCreateFolderButton()
        Thread.sleep(3000)
        tendersPage.switchToNewWindowTest()
        folders.fillInFolderName("Folder A")
        folders.clickOnOkButton()
        Thread.sleep(3000)
        tendersPage.switchToNewWindowTest()
        folders.validateErrorMessage("Error! The folder name is already in use. Please choose a different name.")
    }
//    TODO: DeleteFolders With files/Without Files
}
