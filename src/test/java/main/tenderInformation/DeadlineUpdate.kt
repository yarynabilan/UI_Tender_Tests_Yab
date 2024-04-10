package main.tenderInformation

import main.ApplicationsNavigationTest
import main.PublicTenderPage
import main.TendersPage
import org.testng.AssertJUnit
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test

class DeadlineUpdate : ApplicationsNavigationTest() {
    override  var tendersPage: TendersPage? = null
    private lateinit var publicTenderPage: PublicTenderPage
    private lateinit var tenderDeadlines: TenderDeadlines
    private lateinit var tenderInformationPanel: TenderDescription


    @BeforeMethod
    fun setUpTest() {
        tendersPage = TendersPage(driver)
        tendersPage!!.switchToBrowserFrame()
        publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.tenderInformationTab?.click()
        driver!!.switchTo().defaultContent()
        tendersPage!!.switchToDirectoryFrame()
        tenderInformationPanel = TenderDescription(driver)
        tenderInformationPanel.clickOnDeadlineSubTab()
        driver!!.switchTo().defaultContent()
        tenderDeadlines = TenderDeadlines(driver!!)
        tendersPage!!.switchToDirectoryFrame()


    }
    @Test
    @Throws(InterruptedException::class)
    fun UpdateDeadlinesDates() {
        tenderDeadlines.submissionDeadlineDateInput().clear()
        tenderDeadlines.changeSubmissionDeadlineDate("01.01.2025")
        tenderDeadlines.deadlineForReceivingQuestionsDateInput().clear()
        tenderDeadlines.changeDateOfReceivingQuestions("01.01.2025")
        Thread.sleep(2000)
        tenderDeadlines.clickSaveButton()
    }

    @Test
    @Throws(NullPointerException::class)
    fun UpdateDeadlineForReceivingQuestionsHours() {
        tenderInformationPanel.deadlineForReceivingQuestionsHoursInput().clear()
        tenderInformationPanel.changeDeadlineForReceivingQuestions("12:30")
        tenderInformationPanel.clickSaveButton()
    }

    @Test
    @Throws(NullPointerException::class)
    fun UpdateStartDate() {
        tenderDeadlines.startDateInput().clear()
        tenderDeadlines.changeStartDate("01.01.2024")
        tenderDeadlines.clickSaveButton()
        val expectedText = "01.01.2024"
        Thread.sleep(3000)
        val actualText = tenderDeadlines.startDateInput().getAttribute("value")
        AssertJUnit.assertEquals(expectedText, actualText)

    }

    @Test
    @Throws(NullPointerException::class, InterruptedException::class)
    fun UpdateStartDateHours() {
        tenderDeadlines.startDateHoursInput().clear()
        tenderDeadlines.changeStartDateHours("09:00")
        tenderDeadlines.clickSaveButton()
        val expectedText = "09:00"
        val actualText = tenderDeadlines.startDateHoursInput().getAttribute("value")
        AssertJUnit.assertEquals(expectedText, actualText)
        driver!!.switchTo().defaultContent()
    }

    @Test
    @Throws(NullPointerException::class, InterruptedException::class)
    fun UpdateStartDateBack() {
        tenderDeadlines.startDateInput().clear()
        tenderDeadlines.changeStartDate("01.01.2020")
        Thread.sleep(2000)
        tenderDeadlines.clickSaveButton()
        Thread.sleep(2000)
        val alert = driver!!.switchTo().alert()
        val alertText = alert.text
        val expectedText = "The chosen date cannot be in the past."
        if (alertText == expectedText) {
            alert.accept()
        }
    }
}