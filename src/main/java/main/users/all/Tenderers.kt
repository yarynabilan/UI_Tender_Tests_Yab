package main.users.all

import io.qameta.allure.Step
import main.users.AllUsers
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

class Tenderers(private val driver: WebDriver) : AllUsers() {
    private val inviteUserLink: By = By.xpath("//span[text()=\"Invite a new RIB user to register\"]")
    private val selectPreviouslyInvitedUsersLink: By = By.xpath("//a[contains(text(), 'Select previously invited users')][@class=\"contentHeading1\"][@onclick=\"select_invited();\"]")
    private val createDemoTendererLink: By = By.xpath("//span[@class='contentHeadingLink1' and text()='Create demo tenderer']")
    private val replaceAuthorizedOfficerButton: By = By.xpath("//img[@title='Replace authorised officer']")
    private val resendInvitationButton: By = By.xpath("//input[@value='Resend invitation']")
    private val cancelInvitationOfficerButton: By = By.xpath("//input[@value='Cancel invitation']")
    private val outstandingInvitedUser: By = By.xpath("//td[contains(text(), '(nadiabilan38@gmail.com')]")

    @Step("Click on Invite User Link")
    fun clickInviteUserLink() {
        val inviteUserLinkElement = driver.findElement(inviteUserLink)
        inviteUserLinkElement.click()
    }

    @Step("Click on Resend Invitation Button")
    fun clickResendInvitationButton() {
        val resendInvitationElement = driver.findElement(resendInvitationButton)
        resendInvitationElement.click()
    }

    @Step("Click on Cancel Invitation Button")
    fun clickCancelInvitationButton() {
        val cancelInvitationOfficerElement = driver.findElement(cancelInvitationOfficerButton)
        cancelInvitationOfficerElement.click()
    }

    @Step("Select Invited User Profile")
    fun selectInvitedUserProfile() {
        val InvitedUserElement = driver.findElement(outstandingInvitedUser)
        InvitedUserElement.click()
    }

    @Step("Click on Select Previously Invited Users Link")
    fun clickSelectPreviouslyInvitedUsersLink() {
        val selectPreviouslyInvitedUsersLinkElement = driver.findElement(selectPreviouslyInvitedUsersLink)
        selectPreviouslyInvitedUsersLinkElement.click()
    }

    @Step("Click on Create Demo Tenderer Link")
    fun clickCreateDemoTendererLink() {
        val createDemoTendererLinkElement = driver.findElement(createDemoTendererLink)
        createDemoTendererLinkElement.click()
    }

    @Step("Click on Replace Authorized Officer Button")
    fun clickReplaceAuthorizedOfficerButton() {
        val replaceAuthorizedOfficerButtonElement = driver.findElement(replaceAuthorizedOfficerButton)
        replaceAuthorizedOfficerButtonElement.click()
    }
}
