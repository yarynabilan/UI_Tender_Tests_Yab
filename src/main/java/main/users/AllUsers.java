package main.users;

import main.users.all.Administrators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllUsers {
    private WebDriver driver;
    public AllUsers(WebDriver driver) {
        this.driver = driver;
    }
    private By administratorsTab = By.xpath("//img[@src='/images/info/large_tender_administrators.png']");
    private By tenderersTab = By.xpath("//img[@src='/images/info/large_tender_tenderers.png']");
    private By clientVendorsTab = By.xpath("//img[@src='/images/info/large_tender_company_users.png']");
    private By addUserButton = By.xpath("//img[@name='add_user']\n");
    private By removeUserButton = By.xpath("//img[@title='Remove user']\n");
    private By okButton = By.xpath("//input[@value='OK']");
    private By selectPreviouslyInvitedUsersLink = By.xpath("//input[@value='OK']");
    private By emailField = By.xpath("//textarea[@name='emails']");
    private By closeWindowButton = By.xpath("//input[@value='Close window']");


    private WebElement textFieldForEmailInput() {
        return driver.findElement(emailField);
    }
    public void clickAdmTab() {
        WebElement admTabElement = driver.findElement(administratorsTab);
        admTabElement.click();
    } public void clickCloseWindowButton() {
        WebElement closeWindowElement = driver.findElement(closeWindowButton);
        closeWindowElement.click();
    }
    public void clickTenderersTab() {
        WebElement tenderersTabElement = driver.findElement(tenderersTab);
        tenderersTabElement.click();
    }
    public void clickVendorsTab() {
        WebElement vendorsTabElement = driver.findElement(clientVendorsTab);
        vendorsTabElement.click();
    } public void clickAddUserButton() {
        WebElement addUserButtonElement = driver.findElement(addUserButton);
        addUserButtonElement.click();
    }
    public void clickRemoveUserButton() {
        WebElement removeUserButtonElement = driver.findElement(removeUserButton);
        removeUserButtonElement.click();
    }
    public void confirmOK() {
        WebElement okButtonElement = driver.findElement(okButton);
        okButtonElement.click();}
    public AllUsers fillInTextFieldForEmailInput(String emailField) {
        WebElement textFieldForEmailInput = textFieldForEmailInput();
        textFieldForEmailInput.sendKeys(emailField);
        return this;
    }
    public void enterEmail(String email) {
        WebElement emailElement = driver.findElement(emailField);
        emailElement.clear();
        emailElement.sendKeys(email);
    }

}


