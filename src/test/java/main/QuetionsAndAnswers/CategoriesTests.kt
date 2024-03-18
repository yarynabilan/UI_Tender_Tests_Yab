package main.QuetionsAndAnswers

import main.ApplicationsNavigationTest
import main.PublicTenderPage
import main.TendersPage
import main.questionAndAnswers.Answers
import main.questionAndAnswers.Categories
import org.testng.annotations.Test

class CategoriesTests : ApplicationsNavigationTest() {
    @Test
    @Throws(InterruptedException::class)
    fun addNewCategotyforQuestions() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.questionsAndAnswersTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        val categories = Categories(driver!!)
        val mainWindowHandle = driver!!.windowHandle
        categories.clickManageCategoriesButton()
        tendersPage.switchToNewWindowTest()
        categories.enterCategoryName("reTest 1")
        categories.clickOkButton()
        driver!!.switchTo().window(mainWindowHandle)
        tendersPage.switchToNavigationFrame()
        Thread.sleep(3000)
        categories.clickManageCategoriesButton()
        Thread.sleep(3000)
        tendersPage.switchToNewWindowTest()
        categories.enterCategoryName("to Delete")
        categories.clickOkButton()
        driver!!.switchTo().window(mainWindowHandle)
        tendersPage.switchToNavigationFrame()
        Thread.sleep(3000)
        categories.clickManageCategoriesButton()
        Thread.sleep(3000)
        tendersPage.switchToNewWindowTest()
        categories.enterCategoryName("Test Categoty 2")
        categories.clickOkButton()
        driver!!.switchTo().window(mainWindowHandle)
        tendersPage.switchToNavigationFrame()
        Thread.sleep(3000)
        categories.clickManageCategoriesButton()
        Thread.sleep(3000)
        tendersPage.switchToNewWindowTest()
        categories.enterCategoryName("category TO Change")
        categories.clickOkButton()
    }

    @Test
    @Throws(InterruptedException::class)
    fun deleteCategory() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.questionsAndAnswersTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        val categories = Categories(driver!!)
        categories.clickManageCategoriesButton()
        tendersPage.switchToNewWindowTest()
        categories.selectCategoryToDelete()
        categories.clickDelete()
        val alert = driver!!.switchTo().alert()
        alert.accept()
        Thread.sleep(3000)
    }

    @Test
    @Throws(InterruptedException::class)
    fun deleteCategoryInUse() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.questionsAndAnswersTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        val categories = Categories(driver!!)
        categories.clickManageCategoriesButton()
        tendersPage.switchToNewWindowTest()
        categories.selectCategoryInUse()
        categories.clickDelete()
        val alert = driver!!.switchTo().alert()
        alert.accept()
        Thread.sleep(3000)
    }

    @Test
    @Throws(InterruptedException::class)
    fun editCategoryNameInPublishedAnswers() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.questionsAndAnswersTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        val categories = Categories(driver!!)
        val answers = Answers(driver!!)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        answers.goToPublishedAnswersTab()
        Thread.sleep(3000)
        answers.selectQuestionToAnswer()
        categories.clickEditCategoryButton()
        tendersPage.switchToNewWindowTest()
        categories.enterCategoryName("edited category name")
        categories.clickOkButton()
        Thread.sleep(3000)
    }

    @Test
    @Throws(InterruptedException::class)
    fun deleteCategoryWithPublishedAnswers() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.questionsAndAnswersTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        val categories = Categories(driver!!)
        val answers = Answers(driver!!)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        answers.goToPublishedAnswersTab()
        Thread.sleep(3000)
        answers.selectQuestionToAnswer()
        categories.clickEditCategoryButton()
        tendersPage.switchToNewWindowTest()
        categories.clickDelete()
        val alert = driver!!.switchTo().alert()
        alert.accept()
        Thread.sleep(3000)
    }

    @Test
    @Throws(InterruptedException::class)
    fun changeCategoryForPublishedAnswers() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.questionsAndAnswersTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        val categories = Categories(driver!!)
        val answers = Answers(driver!!)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        answers.goToPublishedAnswersTab()
        Thread.sleep(3000)
        answers.selectQuestionToAnswer()
        categories.clickChangeCategoryButton()
        tendersPage.switchToNewWindowTest()
        categories.changeCategoryForPublishedAnswer()
        categories.clickOkButton()
    }
}
