package main.users.all;

import main.tenderInformation.TenderDescription;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Administrators {
    private WebDriver driver;

    public Administrators(WebDriver driver) {
        this.driver = driver;
    }

    private By addAdministratorLink = By.xpath("//span[@class=\"contentHeadingLink1\" and contains(text(), \"Tender administrator\") and contains(@onclick, \"document.data.usertype.value='4'\")]");
    private By addObserverLink = By.xpath("//span[@class=\"contentHeadingLink1\" and normalize-space()=\"Tender observer\" and @onclick=\"document.data.usertype.value='8';saction();\"]");
    private By addDocumentCoordinatorLink = By.xpath("//span[contains(text(), 'Tender observer')][@class=\"contentHeadingLink1\"][@onclick=\"document.data.usertype.value='8';saction();\"]");
    private By previouslyInvitedLink = By.xpath("//a[contains(text(), 'Select previously invited users')][@class=\"contentHeading1\"][@onclick=\"select_invited();\"]");
    private By textFieldForEmail = By.xpath("//textarea[@name='emails']");
    public void clickAddAdministratorLink() {
        WebElement addAdministratorLinkElement = driver.findElement(addAdministratorLink);
        addAdministratorLinkElement.click();
    }

    public void clickAddObserverLink() {
        WebElement addObserverLinkElement = driver.findElement(addObserverLink);
        addObserverLinkElement.click();
    }

    public void clickAddDocumentCoordinatorLink() {
        WebElement addDocumentCoordinatorLinkElement = driver.findElement(addDocumentCoordinatorLink);
        addDocumentCoordinatorLinkElement.click();
    }

    public void clickPreviouslyInvitedLink() {
        WebElement previouslyInvitedLinkElement = driver.findElement(previouslyInvitedLink);
        previouslyInvitedLinkElement.click();
    }

    public Administrators fillInTextFieldForEmailInput(String textFieldForEmail) {
        WebElement textFieldForEmailInput = textFieldForEmailInput();
        textFieldForEmailInput.sendKeys(textFieldForEmail);
        return this;
    }

    private WebElement textFieldForEmailInput() {
        return driver.findElement(textFieldForEmail);
    }


}