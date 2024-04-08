package main

import BasePage
import com.codeborne.selenide.Selectors
import com.codeborne.selenide.Selenide
import lombok.Getter
import main.tenderInformation.TenderDescription
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

@Getter
open class PublicTenderPage(driver: WebDriver?) : BasePage(driver) {
    var tenderInformationPanel: TenderDescription? = null

    //    public SubmissionRequirementsTab submissionRequirementsTab;
    private val tenderHeaderType = Selenide.`$`(Selectors.byXpath("//div[@class='header_title' and @id='username']"))
    private val tenderAdminProfile: By = By.xpath("//td[@class='modulHeading']")
    private val publicTenderTab: By = By.xpath("//span[@style='font-size: 12px;; white-space: nowrap;']")
    val tenderInformationTab:WebElement? = driver?.findElement(By.xpath("//*[@id=\"tender_information_node\"]/span"))

    //    private By tenderDescriptionSubTab = By.xpath("//img[@src='/images/info/large_tender_description.png']");
    val submissionRequirementsTab: WebElement? = driver?.`findElement`(By.xpath("//*[@id=\"tender_requirements_node\"]/span"))
    val tenderSpecificationDocumentsTab: WebElement? = driver?.`findElement`(By.xpath("//*[@id=\"tender_doclisting_node\"]/span"))
    val questionsAndAnswersTab: WebElement? = driver?.`findElement`(By.xpath("//*[@id=\"tender_questions_node\"]/span"))
    val messagesfromTenderAdministratorTab: WebElement? = driver?.`findElement`(By.xpath("//*[@id=\"admin_messages_node\"]/span"))
    val usersTab:  WebElement? = driver?.`findElement`(By.xpath("//*[@id=\"tender_allusers_node\"]/span"))
    val logFilesTab: WebElement? = driver?.`findElement`(By.xpath("//*[@id=\"tender_log_root_node\"]/span"))
    val guidanceTab: WebElement? = driver?.`findElement`(By.xpath("//td[@id='tender_help_node']/span[text()='Guidance']"))
    val submittedTenderOffersTab: WebElement? = driver?.`findElement`(By.xpath("//*[@id=\"tender_submitted_offer_root_node\"]/span"))
    val tenderResultTab: WebElement? = driver?.`findElement`(By.xpath("//*[@id=\"tender_result\"]/span"))
//    val browserFrame: WebElement = driver.findElement(By.xpath("//frame[@name='browser']"))

    private val browserFrame: By = By.xpath("//frame[@name='browser']\"")

    fun tenderHeaderType(): WebElement {
        return driver!!.findElement(tenderHeaderType as By)
    }

    fun tenderAdminProfile(): WebElement {
        return driver!!.findElement(tenderAdminProfile)
    }

    override fun switchToNewWindow(mainWindowHandle: String) {
        for (winHandle in driver!!.windowHandles) {
            driver!!.switchTo().window(winHandle)
        }
    }

    fun publicTenderTab(): WebElement {
        return driver!!.findElement(publicTenderTab)
    }

//    fun tenderInformationTab(): WebElement? {
//        return driver?.findElement(tenderInformationTab)
//    }


    fun browserFrame(): WebElement {
        return driver!!.findElement(browserFrame)
    }

    fun clickOnElement(elementLocator: By?) {
        driver!!.findElement(elementLocator).click()
    }

    fun switchToBrowserFrame() {
        driver!!.switchTo().frame(driver!!.findElement(browserFrame))
    }

    companion object {
        private const val TITLE = "Tender"
    }
}

