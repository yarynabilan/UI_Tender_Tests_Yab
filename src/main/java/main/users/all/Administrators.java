package main.users.all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Administrators {
    private WebDriver driver;
    public Administrators(WebDriver driver) {
        this.driver = driver;
    }
    private By addAdministratorLink = By.xpath("//span[@class=\"contentHeadingLink1\" and contains(text(), \"Tender administrator\") and contains(@onclick, \"document.data.usertype.value='4'\")]");
    private By addObserverLink = By.xpath("//span[@class=\"contentHeadingLink1\" and normalize-space()=\"Tender observer\" and @onclick=\"document.data.usertype.value='8';saction();\"]");
    private By addDocumentCoordinatorLink = By.xpath("//span[contains(text(), 'Tender observer')][@class=\"contentHeadingLink1\"][@onclick=\"document.data.usertype.value='8';saction();\"]");
    private By previouslyInvitedLink = By.xpath("//a[contains(text(), 'Select previously invited users')][@class=\"contentHeading1\"][@onclick=\"select_invited();\"]");
    private By textFieldForEmail = By.xpath("//textarea[@class=\"contentNormal\" and @rows=\"6\" and @cols=\"41\" and @name=\"emails\" and @style=\"resize: none; padding-left:1px; width: 300px; 1px solid #000 background-color: ;\" and @spellcheck=\"false\"]\n");
}
