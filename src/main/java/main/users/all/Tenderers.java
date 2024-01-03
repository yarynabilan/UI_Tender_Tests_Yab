package main.users.all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tenderers {
    private WebDriver driver;
    public Tenderers(WebDriver driver) {
        this.driver = driver;
    }

    private By inviteUserLink = By.xpath("//span[text()=\"Invite a new RIB user to register\"]");
    private By selectPreviouslyInvitedUsersLink = By.xpath("//a[contains(text(), 'Select previously invited users')][@class=\"contentHeading1\"][@onclick=\"select_invited();\"]");
    private By createDemoTendererLink = By.xpath("//span[@class='contentHeadingLink1' and text()='Create demo tenderer']");
    private By replaceAuthorizedOfficerButton = By.xpath("//img[@title='Replace authorised officer']");
    public void clickInviteUserLink() {
        WebElement inviteUserLinkElement = driver.findElement(inviteUserLink);
        inviteUserLinkElement.click();
    }
    public void clickSelectPreviouslyInvitedUsersLink() {
        WebElement selectPreviouslyInvitedUsersLinkElement = driver.findElement(selectPreviouslyInvitedUsersLink);
        selectPreviouslyInvitedUsersLinkElement.click();
    }
    public void clickCreateDemoTendererLink() {
        WebElement createDemoTendererLinkElement = driver.findElement(createDemoTendererLink);
        createDemoTendererLinkElement.click();
    }
    public void clickReplaceAuthorizedOfficerButton() {
        WebElement replaceAuthorizedOfficerButtonElement = driver.findElement(replaceAuthorizedOfficerButton);
        replaceAuthorizedOfficerButtonElement.click();
    }
//    public void enterEmail(String email) {
//        WebElement emailElement = driver.findElement(emailField);
//        emailElement.clear();
//        emailElement.sendKeys(email);
//    }
}
