package main.messages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
}

