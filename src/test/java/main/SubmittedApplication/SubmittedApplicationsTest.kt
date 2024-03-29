package main.SubmittedApplication

import main.ApplicationsNavigationTest
import main.PublicTenderPage
import main.TendersPage
import main.submittedApplications.SubmittedApplications
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import org.testng.annotations.Test
import java.awt.AWTException
import kotlin.test.assertTrue

class SubmittedApplicationsTest : ApplicationsNavigationTest () {
    @Test
    @Throws(InterruptedException::class, AWTException::class)
    fun downloadSubmissionsTest() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.submittedTenderOffersTab)
        driver!!.switchTo().defaultContent()
        val submittedApplications = SubmittedApplications(driver!!)
        tendersPage.switchToDirectoryFrame()
        submittedApplications.clickOnDownloadSubmissions()
        tendersPage.switchToNewWindowTest()
        submittedApplications.clickOnOkButton()
        tendersPage.switchToNewWindowTest()
        val zipSubmissionsLinkElement = WebDriverWait(driver!!, 45).until(ExpectedConditions.visibilityOf(submittedApplications.fileLink()))
        assertTrue(zipSubmissionsLinkElement.isDisplayed())
    }
    @Test
    @Throws(InterruptedException::class, AWTException::class)
    fun editEvaluationTest() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.submittedTenderOffersTab)
        driver!!.switchTo().defaultContent()
        val submittedApplications = SubmittedApplications(driver!!)
        tendersPage.switchToDirectoryFrame()
        submittedApplications.clickOnEditEvaluation()
        tendersPage.switchToNewWindowTest()
        submittedApplications.enterTextInEvaluationField("TestText")
        submittedApplications.uploadFile()
        submittedApplications.clickOnOkButton()
        Thread.sleep(4000)
        val alert = driver!!.switchTo().alert()
        alert.accept()
        Thread.sleep(2000)
    }

    @Test
    @Throws(InterruptedException::class, AWTException::class)
    fun compareSubmittedDataTest() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.submittedTenderOffersTab)
        driver!!.switchTo().defaultContent()
        val submittedApplications = SubmittedApplications(driver!!)
        tendersPage.switchToNavigationFrame()
        Thread.sleep(2000)
        submittedApplications.clickOnExportCompareDataButton()
        tendersPage.switchToNewWindowTest()
        submittedApplications.clickOnNextButton()
        submittedApplications.clickOnOkButton()
        tendersPage.switchToNewWindowTest()
        val zipSubmissionsLinkElement = WebDriverWait(driver!!, 40).until(ExpectedConditions.visibilityOf(submittedApplications.fileLink()))
        assertTrue(zipSubmissionsLinkElement.isDisplayed())
    }
    @Test
    @Throws(InterruptedException::class, AWTException::class)
    fun downloadSubmittedDataOfTenderer() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.submittedTenderOffersTab)
        driver!!.switchTo().defaultContent()
        val submittedApplications = SubmittedApplications(driver!!)
        tendersPage.switchToDirectoryFrame()
        submittedApplications.selectYabTenderer()
        submittedApplications.downloadSubmittedDataOfTenderer()
        Thread.sleep(2000)
    }
    @Test
    @Throws(InterruptedException::class, AWTException::class)
    fun editTendererEvaluation() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.submittedTenderOffersTab)
        driver!!.switchTo().defaultContent()
        val submittedApplications = SubmittedApplications(driver!!)
        tendersPage.switchToDirectoryFrame()
        submittedApplications.selectYabTenderer()
        Thread.sleep(2000)
        submittedApplications.clickOnEditEvaluation()
        tendersPage.switchToNewWindowTest()
        submittedApplications.selectAccepted("Accepted")
        submittedApplications.enterTextInEvaluationField("test comment 123o")
        submittedApplications.uploadFile()
        submittedApplications.clickOnOkButton()
        Thread.sleep(2000)
        val alert = driver!!.switchTo().alert()
        alert.accept()
        Thread.sleep(2000)
    }
}
