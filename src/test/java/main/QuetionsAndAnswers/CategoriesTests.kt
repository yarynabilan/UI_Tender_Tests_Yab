package main.QuetionsAndAnswers

import main.ApplicationsNavigationTest
import main.BaseTest
import main.PublicTenderPage
import main.TendersPage
import main.questionAndAnswers.Answers
import main.questionAndAnswers.Categories
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test

class CategoriesTests : ApplicationsNavigationTest() {
    override  var tendersPage: TendersPage? = null
    private lateinit var publicTenderPage: PublicTenderPage
    private lateinit var categories: Categories
    private lateinit var answers: Answers
    @BeforeMethod
    fun setUpTest() {
        tendersPage = TendersPage(driver)
        tendersPage!!.switchToBrowserFrame()

        publicTenderPage = PublicTenderPage(driver)
        categories = Categories(driver)
        answers = Answers(driver)
        publicTenderPage.questionsAndAnswersTab?.click()
        driver.switchTo().defaultContent()
        tendersPage!!.switchToNavigationFrame()
    }

    @Test
    fun addNewCategoryForQuestions() {
        driver.findElement(categories.manageCategoriesButton).click()
        tendersPage?.switchToNewWindowTest()
        categories.enterCategoryName("Test 1")
        driver.findElement(categories.okButton).click()
        Thread.sleep(3000)
    }

    @Test
    fun addCategoryToDelete() {
        driver.findElement(categories.manageCategoriesButton).click()
        tendersPage?.switchToNewWindowTest()
        categories.enterCategoryName("to Delete")
        driver.findElement(categories.okButton).click()
        Thread.sleep(3000)
    }

    @Test
    fun addCategory2() {
        driver.findElement(categories.manageCategoriesButton).click()
        Thread.sleep(3000)
        tendersPage?.switchToNewWindowTest()
        categories.enterCategoryName("Test Category 2")
        driver.findElement(categories.okButton).click()
        Thread.sleep(3000)
    }

    @Test
    fun addCategoryTooChange() {
        driver.findElement(categories.manageCategoriesButton).click()
        Thread.sleep(3000)
        tendersPage?.switchToNewWindowTest()
        categories.enterCategoryName("category TO Change")
        driver.findElement(categories.okButton).click()
    }

    @Test
    fun deleteCategory() {
        driver.findElement(categories.manageCategoriesButton).click()
        tendersPage?.switchToNewWindowTest()
        categories.selectCategoryToDelete()
        driver.findElement(categories.deleteCategoryButton).click()
        val alert = driver.switchTo().alert()
        alert.accept()
        Thread.sleep(3000)
    }

    @Test
    fun deleteCategoryInUse() {
        driver.findElement(categories.manageCategoriesButton).click()
        tendersPage?.switchToNewWindowTest()
        categories.selectCategoryInUse()
        driver.findElement(categories.deleteCategoryButton).click()
        val alert = driver.switchTo().alert()
        alert.accept()
        Thread.sleep(3000)
    }

    @Test
    fun editCategoryNameInPublishedAnswers() {
        driver.switchTo().defaultContent()
        tendersPage?.switchToDirectoryFrame()
        answers.goToPublishedAnswersTab()
        Thread.sleep(3000)
        answers.selectQuestionToAnswer()
        driver.findElement(categories.editCategoryButton).click()
        tendersPage?.switchToNewWindowTest()
        categories.enterCategoryName("edited category name")
        driver.findElement(categories.okButton).click()
        Thread.sleep(3000)
    }

    @Test
    fun deleteCategoryWithPublishedAnswers() {
        driver.switchTo().defaultContent()
        tendersPage?.switchToDirectoryFrame()
        answers.goToPublishedAnswersTab()
        Thread.sleep(3000)
        answers.selectQuestionToAnswer()
        driver.findElement(categories.editCategoryButton).click()
        tendersPage?.switchToNewWindowTest()
        driver.findElement(categories.deleteCategoryButton).click()
        val alert = driver.switchTo().alert()
        alert.accept()
        Thread.sleep(3000)
    }

    @Test
    fun changeCategoryForPublishedAnswers() {
        driver.switchTo().defaultContent()
        tendersPage?.switchToDirectoryFrame()
        answers.goToPublishedAnswersTab()
        Thread.sleep(3000)
        answers.selectQuestionToAnswer()

        driver.findElement(categories.changeCategoryButton).click()
        tendersPage?.switchToNewWindowTest()
        categories.changeCategoryForPublishedAnswer()
        driver.findElement(categories.okButton).click()
    }

}
//TODO review all test, some buttons are not working
