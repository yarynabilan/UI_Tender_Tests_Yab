package main.users.all

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

class Administrators(private val driver: WebDriver) {
    private val addAdministratorLink: By = By.xpath("//span[@class=\"contentHeadingLink1\" and contains(text(), \"Tender administrator\") and contains(@onclick, \"document.data.usertype.value='4'\")]")
    private val addObserverLink: By = By.xpath("//span[@class=\"contentHeadingLink1\" and normalize-space()=\"Tender observer\" and @onclick=\"document.data.usertype.value='8';saction();\"]")
    private val addDocumentCoordinatorLink: By = By.xpath("//span[contains(text(), 'Tender observer')][@class=\"contentHeadingLink1\"][@onclick=\"document.data.usertype.value='8';saction();\"]")
    private val previouslyInvitedLink: By = By.xpath("//a[contains(text(), 'Select previously invited users')][@class=\"contentHeading1\"][@onclick=\"select_invited();\"]")
    private val textFieldForEmail: By = By.xpath("//textarea[@name='emails']")
    private val userToUpdateProfile: By = By.xpath("//td[text()='yaryna bilan']")
    private val adminProfileDropdown: By = By.xpath("//select[@name='adminprofile']")
    private val tenderAdminProfileDropdown: By = By.xpath("//option[text()='Tender administrator']")
    private val accessTypeDropdown: By = By.xpath("//option[text()='Full access']\n")
    private val okButton: By = By.xpath("//input[@name='button_ok']\n")

    fun clickAddAdministratorLink() {
        val addAdministratorLinkElement = driver.findElement(addAdministratorLink)
        addAdministratorLinkElement.click() }

    fun clickAddObserverLink() {
        val addObserverLinkElement = driver.findElement(addObserverLink)
        addObserverLinkElement.click() }

    fun clickAddDocumentCoordinatorLink() {
        val addDocumentCoordinatorLinkElement = driver.findElement(addDocumentCoordinatorLink)
        addDocumentCoordinatorLinkElement.click() }

    fun clickOnUserToUpdateProfile() {
        val userToUpdateProfileElement = driver.findElement(userToUpdateProfile)
        userToUpdateProfileElement.click() }

    fun clickPreviouslyInvitedLink() {
        val previouslyInvitedLinkElement = driver.findElement(previouslyInvitedLink)
        previouslyInvitedLinkElement.click() }

    fun fillInTextFieldForEmailInput(textFieldForEmail: String?): Administrators {
        val textFieldForEmailInput = textFieldForEmailInput()
        textFieldForEmailInput.sendKeys(textFieldForEmail)
        return this }

    private fun textFieldForEmailInput(): WebElement {
        return driver.findElement(textFieldForEmail) }

    fun clickOnAdminProfileDropdown() {
        val dropdown = driver.findElement(adminProfileDropdown)
        dropdown.click() }

    fun selectTenderAdminProfile() {
        val dropdown = driver.findElement(tenderAdminProfileDropdown)
        dropdown.click() }

    fun selectFullAccessType() {
        val dropdown = driver.findElement(accessTypeDropdown)
        dropdown.click()}
}