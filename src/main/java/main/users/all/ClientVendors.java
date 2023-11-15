package main.users.all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class ClientVendors {

    private WebDriver driver;
    public ClientVendors(WebDriver driver) {
        this.driver = driver;
    }
    private By nameField = By.xpath("//input[@name=\"name\"]");
    private By emailField = By.xpath("//input[@name=\"email\"]");
    private By messageField = By.xpath("//textarea[@name=\"message\"]");
    private By danskDropdown = By.xpath("//select[@name='language']");
    private By vendorProfile = By.xpath("//td[text()='Client Vendor 1 Test']");
    private By resendInvitationButton = By.xpath("//input[@type='button' and @value='Send']");
    private By okButton = By.xpath("//input[@value=\"OK\"]\n");
    private By closeButton = By.xpath("//input[@type='button' and @value='Close window']");

    public void enterName(String name) {
        WebElement nameElement = driver.findElement(nameField);
        nameElement.clear();
        nameElement.sendKeys(name);
    }

    public void enterEmail(String email) {
        WebElement emailElement = driver.findElement(emailField);
        emailElement.clear();
        emailElement.sendKeys(email);
    }

    public void enterMessage(String message) {
        WebElement messageElement = driver.findElement(messageField);
        messageElement.clear();
        messageElement.sendKeys(message);
    }

    public void selectDansk() {
        WebElement danskDropdownElement = driver.findElement(danskDropdown);
        new Select(danskDropdownElement).selectByVisibleText("Dansk");
    }
    public void selectVendorProfile() {
        WebElement vendorProfileElement = driver.findElement(vendorProfile);
        vendorProfileElement.click();
    }

    public void clickResendInvitationButton() {
        WebElement resendInvitationButtonElement = driver.findElement(resendInvitationButton);
        resendInvitationButtonElement.click();
    }
    public void clickOkButton() {
        WebElement okButtonElement = driver.findElement(okButton);
        okButtonElement.click();
    } public void clickCloseButton() {
        WebElement closeButtonElement = driver.findElement(closeButton);
        closeButtonElement.click();
    }

}

