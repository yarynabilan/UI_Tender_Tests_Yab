package main.users.all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tenderers {
    private WebDriver driver;
    public Tenderers(WebDriver driver) {
        this.driver = driver;
    }

    private By inviteUserLink = By.xpath("//span[text()=\"Invite a new RIB user to register\"]");
    private By selectPreviouslyInvitedUsersLink = By.xpath("//a[contains(text(), 'Select previously invited users')][@class=\"contentHeading1\"][@onclick=\"select_invited();\"]");
    private By createDemoTendererLink = By.xpath("");
    private By replaceAuthorizedOfficerButton = By.xpath("");

}
