package main.specificationDocuments

import main.ApplicationsNavigationTest
import main.PublicTenderPage
import main.TendersPage
import org.testng.annotations.Test

class FoldersTest : ApplicationsNavigationTest() {
    @Test
    @Throws(InterruptedException::class)
    fun CreateFolder() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderSpecificationDocumentsTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        val folders = Folders(driver!!)
        Thread.sleep(3000)
        folders.clickOnCreateFolderButton()
        Thread.sleep(3000)
        tendersPage.switchToNewWindowTest()
        folders.fillInFolderName("Folder A")
        folders.clickOnOkButton()
        Thread.sleep(3000)
    }

    @Test
    @Throws(InterruptedException::class)
    fun CreateFolderWithSubFolder() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderSpecificationDocumentsTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        val folders = Folders(driver!!)
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
    @Throws(InterruptedException::class)
    fun CreateEditDeleteFolder() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderSpecificationDocumentsTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        val folders = Folders(driver!!)
        val mainWindowHandle = driver!!.windowHandle
        Thread.sleep(3000)
        folders.clickOnCreateFolderButton()
        Thread.sleep(3000)
        tendersPage.switchToNewWindowTest()
        folders.fillInFolderName("ToRenameAndDelete")
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
    @Throws(InterruptedException::class)
    fun CreateFolderWithAlreadyExistingName() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderSpecificationDocumentsTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        val folders = Folders(driver!!)
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
}
