//package main.QuetionsAndAnswers
//
//import junit.framework.Assert.assertTrue
//import main.ApplicationsNavigationTest
//import PublicTenderPage
//import main.TendersPage
//import main.questionAndAnswers.ExportQandA
//import org.openqa.selenium.support.ui.ExpectedConditions
//import org.openqa.selenium.support.ui.WebDriverWait
//import org.testng.annotations.BeforeMethod
//import org.testng.annotations.Test
//
//class ExportQandATest : ApplicationsNavigationTest() {
//    private lateinit var exportQandA: ExportQandA
//
//    @BeforeMethod
//    fun setUpTest() {
//        val tendersPage = TendersPage(driver)
//        tendersPage.switchToBrowserFrame()
//        val publicTenderPage = PublicTenderPage(driver)
//
//        publicTenderPage.questionsAndAnswersTab.click()
//        driver.switchTo().defaultContent()
//        tendersPage.switchToNavigationFrame()
//        exportQandA = ExportQandA(driver)
//        exportQandA.clickExportQA_button()
//        tendersPage.switchToNewWindowTest() }
//
//    @Test
//    fun ExportQandAinWordAll() {
//        exportQandA.selectWordFormat()
//        exportQandA.selectAll_QA()
//        exportQandA.confirmOK()
//        val linkElement = WebDriverWait(driver, 45).until(ExpectedConditions.visibilityOf(exportQandA.linkQAElement))
//        assertTrue(linkElement.isDisplayed) }
//
//    @Test
//    fun ExportQandAinExceldAll() {
//        exportQandA.selectExcelFormat()
//        exportQandA.selectAll_QA()
//        exportQandA.confirmOK()
//        val linkElement = WebDriverWait(driver, 45).until(ExpectedConditions.visibilityOf(exportQandA.linkQAElement))
//        assertTrue(linkElement.isDisplayed) }
//
//    @Test
//    fun ExportQandAinExceldDrafts() {
//        exportQandA.selectExcelFormat()
//        exportQandA.selectDrafts()
//        exportQandA.confirmOK()
//        val linkElement = WebDriverWait(driver, 45).until(ExpectedConditions.visibilityOf(exportQandA.linkQAElement))
//        assertTrue(linkElement.isDisplayed) }
//    @Test
//    fun ExportQandAinExceldUnanswered() {
//        exportQandA.selectExcelFormat()
//        exportQandA.selectUnanswered()
//        exportQandA.confirmOK()
//        val linkElement = WebDriverWait(driver, 45).until(ExpectedConditions.visibilityOf(exportQandA.linkQAElement))
//        assertTrue(linkElement.isDisplayed) }
//
//    @Test
//    fun ExportQandAinExceldPublished() {
//        exportQandA.selectExcelFormat()
//        exportQandA.selectPublished()
//        exportQandA.confirmOK()
//        val linkElement = WebDriverWait(driver, 45).until(ExpectedConditions.visibilityOf(exportQandA.linkQAElement))
//        assertTrue(linkElement.isDisplayed) }
//}