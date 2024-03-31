package main.QuetionsAndAnswers

import main.ApplicationsNavigationTest
import main.BaseTest
import main.PublicTenderPage
import main.TendersPage
import main.questionAndAnswers.Answers
import main.questionAndAnswers.Categories
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test

class CategoriesTests : BaseTest() {
    private lateinit var tendersPage: TendersPage
    private lateinit var publicTenderPage: PublicTenderPage
    private lateinit var categories: Categories
    private lateinit var answers: Answers
    @BeforeMethod
    fun setUpTest() {
        tendersPage = TendersPage(driver)
        publicTenderPage = PublicTenderPage(driver)
        categories = Categories(driver)
        answers = Answers(driver)
        tendersPage.switchToBrowserFrame()
        publicTenderPage.clickOnElement(publicTenderPage.questionsAndAnswersTab)
        driver.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
    }

    @Test
    fun addNewCategoryForQuestions() {
        categories.clickManageCategoriesButton()
        tendersPage.switchToNewWindowTest()
        categories.enterCategoryName("Test 1")
        categories.clickOkButton()
        Thread.sleep(3000)
    }

    @Test
    fun addCategoryToDelete() {
        categories.clickManageCategoriesButton()
        tendersPage.switchToNewWindowTest()
        categories.enterCategoryName("to Delete")
        categories.clickOkButton()
        Thread.sleep(3000)
    }

    @Test
    fun addCategory2() {
        categories.clickManageCategoriesButton()
        Thread.sleep(3000)
        tendersPage.switchToNewWindowTest()
        categories.enterCategoryName("Test Category 2")
        categories.clickOkButton()
        Thread.sleep(3000)
    }

    @Test
    fun addCategoryTooChange() {
        categories.clickManageCategoriesButton()
        Thread.sleep(3000)
        tendersPage.switchToNewWindowTest()
        categories.enterCategoryName("category TO Change")
        categories.clickOkButton()
    }

    @Test
    fun deleteCategory() {
        categories.clickManageCategoriesButton()
        tendersPage.switchToNewWindowTest()
        categories.selectCategoryToDelete()
        categories.clickDelete()
        val alert = driver.switchTo().alert()
        alert.accept()
        Thread.sleep(3000)
    }

    @Test
    fun deleteCategoryInUse() {
        categories.clickManageCategoriesButton()
        tendersPage.switchToNewWindowTest()
        categories.selectCategoryInUse()
        categories.clickDelete()
        val alert = driver.switchTo().alert()
        alert.accept()
        Thread.sleep(3000)
    }

    @Test
    fun editCategoryNameInPublishedAnswers() {
        driver.switchTo().defaultContent()
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
    fun deleteCategoryWithPublishedAnswers() {
        driver.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        answers.goToPublishedAnswersTab()
        Thread.sleep(3000)
        answers.selectQuestionToAnswer()
        categories.clickEditCategoryButton()
        tendersPage.switchToNewWindowTest()
        categories.clickDelete()
        val alert = driver.switchTo().alert()
        alert.accept()
        Thread.sleep(3000)
    }

    @Test
    fun changeCategoryForPublishedAnswers() {
        driver.switchTo().defaultContent()
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
//TODO review all test, some buttons are not working
