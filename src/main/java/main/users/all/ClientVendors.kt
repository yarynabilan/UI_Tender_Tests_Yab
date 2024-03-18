package main.users.all

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.Select

class ClientVendors(private val driver: WebDriver) {
    private val nameField: By = By.xpath("//input[@name=\"name\"]")
    private val emailField: By = By.xpath("//input[@name=\"email\"]")
    private val messageField: By = By.xpath("//textarea[@name=\"message\"]")
    private val danskDropdown: By = By.xpath("//select[@name='language']")
    private val vendorProfile: By = By.xpath("//td[text()='Client Vendor 1 Test']")
    private val resendInvitationButton: By = By.xpath("//input[@type='button' and @value='Send']")
    private val okButton: By = By.xpath("//input[@value=\"OK\"]\n")
    private val closeButton: By = By.xpath("//input[@type='button' and @value='Close window']")

    fun enterName(name: String?) {
        val nameElement = driver.findElement(nameField)
        nameElement.clear()
        nameElement.sendKeys(name)
    }

    fun enterEmail(email: String?) {
        val emailElement = driver.findElement(emailField)
        emailElement.clear()
        emailElement.sendKeys(email)
    }

    fun enterMessage(message: String?) {
        val messageElement = driver.findElement(messageField)
        messageElement.clear()
        messageElement.sendKeys(message)
    }

    fun selectDansk() {
        val danskDropdownElement = driver.findElement(danskDropdown)
        Select(danskDropdownElement).selectByVisibleText("Dansk")
    }

    fun selectVendorProfile() {
        val vendorProfileElement = driver.findElement(vendorProfile)
        vendorProfileElement.click()
    }

    fun clickResendInvitationButton() {
        val resendInvitationButtonElement = driver.findElement(resendInvitationButton)
        resendInvitationButtonElement.click()
    }

    fun clickOkButton() {
        val okButtonElement = driver.findElement(okButton)
        okButtonElement.click()
    }

    fun clickCloseButton() {
        val closeButtonElement = driver.findElement(closeButton)
        closeButtonElement.click()
    }
}

