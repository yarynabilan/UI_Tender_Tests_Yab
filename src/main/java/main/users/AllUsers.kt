package main.users

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

open class AllUsers {
    private var driver: WebDriver? = null

    constructor(driver: WebDriver?) {
        this.driver = driver
    }

    private val administratorsTab: By = By.xpath("//img[@src='/images/info/large_tender_administrators.png']")
    private val tenderersTab: By = By.xpath("//img[@src='/images/info/large_tender_tenderers.png']")
    private val clientVendorsTab: By = By.xpath("//img[@src='/images/info/large_tender_company_users.png']")
    private val addUserButton: By = By.xpath("//img[@name='add_user']\n")
    private val removeUserButton: By = By.xpath("//img[@title='Remove user']\n")
    private val okButton: By = By.xpath("//input[@value='OK']")
    private val selectPreviouslyInvitedUsersLink: By = By.xpath("//input[@value='OK']")
    var emailField: By = By.xpath("//textarea[@name='emails']")
    private val closeWindowButton: By = By.xpath("//input[@value='Close window']")

    constructor()
    private fun textFieldForEmailInput(): WebElement {
        return driver!!.findElement(emailField)
    }

    fun clickAdmTab() {
        val admTabElement = driver!!.findElement(administratorsTab)
        admTabElement.click()
    }

    fun clickCloseWindowButton() {
        val closeWindowElement = driver!!.findElement(closeWindowButton)
        closeWindowElement.click()
    }

    fun clickTenderersTab() {
        val tenderersTabElement = driver!!.findElement(tenderersTab)
        tenderersTabElement.click()
    }

    fun clickVendorsTab() {
        val vendorsTabElement = driver!!.findElement(clientVendorsTab)
        vendorsTabElement.click()
    }

    fun clickAddUserButton() {
        val addUserButtonElement = driver!!.findElement(addUserButton)
        addUserButtonElement.click()
    }

    fun clickRemoveUserButton() {
        val removeUserButtonElement = driver!!.findElement(removeUserButton)
        removeUserButtonElement.click()
    }

    fun confirmOK() {
        val okButtonElement = driver!!.findElement(okButton)
        okButtonElement.click()
    }

    fun fillInTextFieldForEmailInput(emailField: String?): AllUsers {
        val textFieldForEmailInput = textFieldForEmailInput()
        textFieldForEmailInput.sendKeys(emailField)
        return this
    }

    fun enterEmail(email: String?) {
        val emailElement = driver!!.findElement(emailField)
        emailElement.clear()
        emailElement.sendKeys(email)
    }
}


