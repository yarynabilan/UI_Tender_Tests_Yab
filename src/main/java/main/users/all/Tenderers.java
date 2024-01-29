package main.users.all;

import io.qameta.allure.Step;
import main.users.AllUsers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tenderers extends AllUsers {
    private WebDriver driver;

    public Tenderers(WebDriver driver) {
        this.driver = driver;
    }

    private By inviteUserLink = By.xpath("//span[text()=\"Invite a new RIB user to register\"]");
    private By selectPreviouslyInvitedUsersLink = By.xpath("//a[contains(text(), 'Select previously invited users')][@class=\"contentHeading1\"][@onclick=\"select_invited();\"]");
    private By createDemoTendererLink = By.xpath("//span[@class='contentHeadingLink1' and text()='Create demo tenderer']");
    private By replaceAuthorizedOfficerButton = By.xpath("//img[@title='Replace authorised officer']");
    private By resendInvitationButton = By.xpath("//input[@value='Resend invitation']");
    private By cancelInvitationOfficerButton = By.xpath("//input[@value='Cancel invitation']");
    private By outstandingInvitedUser = By.xpath("//td[contains(text(), '(nadiabilan38@gmail.com')]");

    @Step("Click on Invite User Link")
    public void clickInviteUserLink() {
        WebElement inviteUserLinkElement = driver.findElement(inviteUserLink);
        inviteUserLinkElement.click();
    }

    @Step("Click on Resend Invitation Button")
    public void clickResendInvitationButton() {
        WebElement resendInvitationElement = driver.findElement(resendInvitationButton);
        resendInvitationElement.click();
    }

    @Step("Click on Cancel Invitation Button")
    public void clickCancelInvitationButton() {
        WebElement cancelInvitationOfficerElement = driver.findElement(cancelInvitationOfficerButton);
        cancelInvitationOfficerElement.click();
    }

    @Step("Select Invited User Profile")
    public void selectInvitedUserProfile() {
        WebElement InvitedUserElement = driver.findElement(outstandingInvitedUser);
        InvitedUserElement.click();
    }

    @Step("Click on Select Previously Invited Users Link")
    public void clickSelectPreviouslyInvitedUsersLink() {
        WebElement selectPreviouslyInvitedUsersLinkElement = driver.findElement(selectPreviouslyInvitedUsersLink);
        selectPreviouslyInvitedUsersLinkElement.click();
    }

    @Step("Click on Create Demo Tenderer Link")
    public void clickCreateDemoTendererLink() {
        WebElement createDemoTendererLinkElement = driver.findElement(createDemoTendererLink);
        createDemoTendererLinkElement.click();
    }

    @Step("Click on Replace Authorized Officer Button")
    public void clickReplaceAuthorizedOfficerButton() {
        WebElement replaceAuthorizedOfficerButtonElement = driver.findElement(replaceAuthorizedOfficerButton);
        replaceAuthorizedOfficerButtonElement.click();
    }
}
