//package main.tenderInformation
//
//import main.ApplicationsNavigationTest
//import PublicTenderPage
//import main.TendersPage
//import org.testng.AssertJUnit
//import org.testng.annotations.Test
//
//class DeadlineUpdate : ApplicationsNavigationTest() {
//    @Test
//    @Throws(InterruptedException::class)
//    fun UpdateDeadlinesDates() {
//        val tendersPage = TendersPage(driver)
//        tendersPage.switchToBrowserFrame()
//        val publicTenderPage = PublicTenderPage(driver)
//        publicTenderPage.tenderInformationTab.click()
//        driver!!.switchTo().defaultContent()
//        tendersPage.switchToDirectoryFrame()
//        val tenderInformationPanel = TenderDescription(driver)
//        tenderInformationPanel.clickOnDeadlineSubTab()
//        driver!!.switchTo().defaultContent()
//        val tenderDeadlines = TenderDeadlines(driver!!)
//        tendersPage.switchToDirectoryFrame()
//        tenderDeadlines.submissionDeadlineDateInput().clear()
//        tenderDeadlines.changeSubmissionDeadlineDate("01.01.2025")
//        tenderDeadlines.deadlineForReceivingQuestionsDateInput().clear()
//        tenderDeadlines.changeDateOfReceivingQuestions("01.01.2025")
//        Thread.sleep(2000)
//        tenderDeadlines.clickSaveButton()
//    }
//
//    @Test
//    @Throws(NullPointerException::class)
//    fun UpdateDeadlineForReceivingQuestionsHours() {
//        val tendersPage = TendersPage(driver)
//        tendersPage.switchToBrowserFrame()
//        val publicTenderPage = PublicTenderPage(driver)
//        publicTenderPage.tenderInformationTab.click()
//        driver!!.switchTo().defaultContent()
//        tendersPage.switchToDirectoryFrame()
//        val tenderInformationPanel = TenderDescription(driver)
//        tenderInformationPanel.clickOnDeadlineSubTab()
//        driver!!.switchTo().defaultContent()
//        tendersPage.switchToDirectoryFrame()
//        tenderInformationPanel.deadlineForReceivingQuestionsHoursInput().clear()
//        tenderInformationPanel.changeDeadlineForReceivingQuestions("12:30")
//        tenderInformationPanel.clickSaveButton()
//    }
//
//    @Test
//    @Throws(NullPointerException::class)
//    fun UpdateStartDate() {
//        val tendersPage = TendersPage(driver)
//        tendersPage.switchToBrowserFrame()
//        val publicTenderPage = PublicTenderPage(driver)
//        publicTenderPage.tenderInformationTab.click()
//        driver!!.switchTo().defaultContent()
//        tendersPage.switchToDirectoryFrame()
//        val tenderDescription = TenderDescription(driver)
//        tenderDescription.clickOnDeadlineSubTab()
//        driver!!.switchTo().defaultContent()
//        val tenderDeadlines = TenderDeadlines(driver!!)
//        tendersPage.switchToDirectoryFrame()
//        tenderDeadlines.startDateInput().clear()
//        tenderDeadlines.changeStartDate("01.01.2024")
//        tenderDeadlines.clickSaveButton()
//        val expectedText = "01.01.2024"
//        Thread.sleep(3000)
//
//        val actualText = tenderDeadlines.startDateInput().getAttribute("value")
//        AssertJUnit.assertEquals(expectedText, actualText)
//
//    }
//
//    @Test
//    @Throws(NullPointerException::class, InterruptedException::class)
//    fun UpdateStartDateHours() {
//        val tendersPage = TendersPage(driver)
//        tendersPage.switchToBrowserFrame()
//        val publicTenderPage = PublicTenderPage(driver)
//        publicTenderPage.tenderInformationTab.click()
//        driver!!.switchTo().defaultContent()
//        tendersPage.switchToDirectoryFrame()
//        val tenderDescription = TenderDescription(driver)
//        tenderDescription.clickOnDeadlineSubTab()
//        driver!!.switchTo().defaultContent()
//        val tenderDeadlines = TenderDeadlines(driver!!)
//        tendersPage.switchToDirectoryFrame()
//        tenderDeadlines.startDateHoursInput().clear()
//        tenderDeadlines.changeStartDateHours("09:00")
//        tenderDeadlines.clickSaveButton()
//        val expectedText = "09:00"
//        val actualText = tenderDeadlines.startDateHoursInput().getAttribute("value")
//        AssertJUnit.assertEquals(expectedText, actualText)
//        driver!!.switchTo().defaultContent()
//    }
//
//    @Test
//    @Throws(NullPointerException::class, InterruptedException::class)
//    fun UpdateStartDateBack() {
//        val tendersPage = TendersPage(driver)
//        tendersPage.switchToBrowserFrame()
//        val publicTenderPage = PublicTenderPage(driver)
//        publicTenderPage.tenderInformationTab.click()
//        driver!!.switchTo().defaultContent()
//        tendersPage.switchToDirectoryFrame()
//        val tenderDescription = TenderDescription(driver)
//        tenderDescription.clickOnDeadlineSubTab()
//        driver!!.switchTo().defaultContent()
//        val tenderDeadlines = TenderDeadlines(driver!!)
//        tendersPage.switchToDirectoryFrame()
//        tenderDeadlines.startDateInput().clear()
//        tenderDeadlines.changeStartDate("01.01.2020")
//        Thread.sleep(2000)
//        tenderDeadlines.clickSaveButton()
//        Thread.sleep(2000)
//        val alert = driver!!.switchTo().alert()
//        val alertText = alert.text
//        val expectedText = "The chosen date cannot be in the past."
//        if (alertText == expectedText) {
//            alert.accept()
//        }
//    }
//}