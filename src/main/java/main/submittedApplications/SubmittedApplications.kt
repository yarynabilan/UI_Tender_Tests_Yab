package main.submittedApplications;

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

class SubmittedApplications(private val driver: WebDriver) {
    private val submittedApplicationIcon: By = By.xpath("//span[text()='Submitted applications']/preceding-sibling::img[@src='/images/info/large_tender_submitted_yes.png']\n")
    private val editEvaluationButton: By = By.xpath("//input[@value='Edit evaluation']")
    private val yabTenderer: By = By.xpath("//td[text()='Byggeweb TEST']")
    private val textFieldEvaluatin: By = By.xpath("//textarea[@name='comment']\n")
    private val fileInputEvaluation: By = By.xpath("//input[@type='file' and @id='file_0']\n")
    private val okButton: By = By.xpath("//input[@value='OK']")
// after tender deadline
private val downloadSubmissions: By = By.xpath("//span[contains(text(), 'Download submissions')]\n")
//private val confirmOkDownlaod: By = By.xpath("")
private val zipSubmissionsLink: By = By.xpath("//a[@id='filelink']\n")
private val exportCompareDataButton: By = By.xpath("//img[@title='Export and compare submitted data']\n")
private val nextButton: By = By.xpath("//input[@value='Next']")
private val removeFileButton: By = By.xpath("//span[@onclick='remove_file(this)']\n")

}