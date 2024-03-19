package main.messages;

import io.qameta.allure.Step;
import main.specificationDocuments.FileUpload;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.io.File;

public class Messages {
    private WebDriver driver;

    public Messages(WebDriver driver) {
        this.driver = driver;
    }

    private By sendMessageButton = By.xpath("//img[@title='Send message']");
    private By exportMessagesButton = By.xpath("//img[@title='Export messages']");
    private By confirmExportButton = By.xpath("//input[@type='submit' and @value='OK']");
    private By generatedReportLink = By.xpath("//a[@id='filelink']");
    private By inputSubjectText = By.xpath("//input[@name='subject']");
    private By inputMessageText = By.xpath("//textarea[@name='message']");
    private By fileInput = By.xpath("//input[@type='file']");
    private By administratorsCheckBox = By.xpath("//input[@name='adm']");
    private By tenderersAllCheckBox = By.xpath("//input[@name='contracts[]']");
    private By tenderersAcceptedCheckBox = By.xpath("//input[@name='accepted_contracts[]']");
    private By tenderersRejectedCheckBox = By.xpath("//input[@name='rejected_contracts[]']");
    private By selectAllButton = By.xpath("//input[@value='Select all']");
    private By deselectAllButton = By.xpath("//input[@value='Deselect all']");
    private By individualUsersDropdown = By.xpath("//td[contains(@class, 'triangle') and contains(text(), '▶')]");
    private By individualUserCheckbox = By.xpath("//td[contains(., 'Yab test, Byggeweb TEST')]/preceding-sibling::td/input[@type='checkbox']");
    private By confirmSendButton = By.xpath("//input[@value='Send']");
    private By exportingMessagesLink = By.xpath("//a[@id='filelink']");

    public WebElement link() {
        return driver.findElement(exportingMessagesLink);
    }

    public void clickSendMessageButton() {
        driver.findElement(sendMessageButton).click();
    }

    public void clickExportMessagesButton() {
        driver.findElement(exportMessagesButton).click();
    }

    public void clickConfirmExportButton() {
        driver.findElement(confirmExportButton).click();
    }

    public void clickGeneratedReportLink() {
        driver.findElement(generatedReportLink).click();
    }

    public void enterSubjectText(String subject) {
        enterText(inputSubjectText, subject);
    }

    public void enterMessageText(String message) {
        enterText(inputMessageText, message);
    }


    public void uploadFile(String filePath) {
        enterText(fileInput, filePath);
    }

    public void uploadFileToMessage() throws AWTException {
        File uploadFile = new File("src/main/resources/files/MessageFileAttachment.pdf");
        WebElement fileInputElement = driver.findElement(FileUpload.fileInput);
        fileInputElement.sendKeys(uploadFile.getAbsolutePath());
    }

    public void checkAdministratorsCheckbox() {
        checkCheckbox(administratorsCheckBox);
    }

    public void checkTenderersAllCheckbox() {
        checkCheckbox(tenderersAllCheckBox);
    }

    public void checkTenderersAcceptedCheckbox() {
        checkCheckbox(tenderersAcceptedCheckBox);
    }

    public void checkTenderersRejectedCheckbox() {
        checkCheckbox(tenderersRejectedCheckBox);
    }

    public void clickSelectAllButton() {
        clickElement(selectAllButton);
    }

    public void clickDeselectAllButton() {
        clickElement(deselectAllButton);
    }

    public void clickIndividualUsersDropdown() {
        clickElement(individualUsersDropdown);
    }

    public void checkIndividualUserCheckbox() {
        checkCheckbox(individualUserCheckbox);
    }

    public void clickConfirmSendButton() {
        clickElement(confirmSendButton);
    }

    private void enterText(By locator, String text) {
        WebElement element = (WebElement) driver.findElement(locator);
        element.sendKeys(text);
    }


    private void checkCheckbox(By locator) {
        WebElement checkbox = driver.findElement(locator);
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }

    private void clickElement(By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }

}

