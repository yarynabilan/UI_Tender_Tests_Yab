package main.QuetionsAndAnswers

import junit.framework.Assert.assertTrue
import main.ApplicationsNavigationTest
import main.PublicTenderPage
import main.TendersPage
import main.questionAndAnswers.ExportQandA
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test

class ExportQandATest : ApplicationsNavigationTest() {
    private lateinit var exportQandA: ExportQandA

    @BeforeMethod
    fun setUpTest() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)

        publicTenderPage.questionsAndAnswersTab?.click()
        driver.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        exportQandA = ExportQandA(driver)
        driver.findElement(exportQandA.exportQuestionButton).click()
        tendersPage.switchToNewWindowTest() }

    @Test
    fun ExportQandAinWordAll() {
        driver.findElement(exportQandA.wordFormatOption).click()
        exportQandA.selectAll_QA()
        driver.findElement(exportQandA.okButton).click()
        val linkElement = WebDriverWait(driver, 45).until(ExpectedConditions.visibilityOf(exportQandA.linkQAElement))
        assertTrue(linkElement.isDisplayed) }

    @Test
    fun ExportQandAinExceldAll() {
        driver.findElement(exportQandA.excelFormatOption).click()
        exportQandA.selectAll_QA()
        driver.findElement(exportQandA.okButton).click()
        val linkElement = WebDriverWait(driver, 45).until(ExpectedConditions.visibilityOf(exportQandA.linkQAElement))
        assertTrue(linkElement.isDisplayed) }

    @Test
    fun ExportQandAinExceldDrafts() {
        driver.findElement(exportQandA.excelFormatOption).click()
        exportQandA.selectDrafts()
        driver.findElement(exportQandA.okButton).click()
        val linkElement = WebDriverWait(driver, 45).until(ExpectedConditions.visibilityOf(exportQandA.linkQAElement))
        assertTrue(linkElement.isDisplayed) }
    @Test
    fun ExportQandAinExceldUnanswered() {
        driver.findElement(exportQandA.excelFormatOption).click()
        exportQandA.selectUnanswered()
        driver.findElement(exportQandA.okButton).click()
        val linkElement = WebDriverWait(driver, 45).until(ExpectedConditions.visibilityOf(exportQandA.linkQAElement))
        assertTrue(linkElement.isDisplayed) }

    @Test
    fun ExportQandAinExceldPublished() {
        driver.findElement(exportQandA.excelFormatOption).click()
        exportQandA.selectPublished()
        driver.findElement(exportQandA.okButton).click()
        val linkElement = WebDriverWait(driver, 45).until(ExpectedConditions.visibilityOf(exportQandA.linkQAElement))
        assertTrue(linkElement.isDisplayed) }
}