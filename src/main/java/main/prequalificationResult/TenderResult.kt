package main.prequalificationResult
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

class TenderResult(private val driver: WebDriver) {
    val registerResultButton: By = By.xpath("//img[@title='Register tender result']")
    val yabCheckBox: By = By.xpath("(//input[@type='checkbox'])[1]")
    val commentsField: By = By.xpath("//textarea[@name='comment']")
    val checkboxForUploadEspd: By = By.xpath("//td[@class='content']/input[@type='checkbox' and @name='allowespddoc']\n")
    val attachmentInput: By = By.xpath("//input[@type='file']")
    val okButton: By = By.xpath("//input[@type='button' and @value='OK']")
}