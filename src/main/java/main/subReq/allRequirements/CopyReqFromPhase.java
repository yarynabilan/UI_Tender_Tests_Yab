package main.subReq.allRequirements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CopyReqFromPhase {
    private WebDriver driver;

    private By copyReqFromPhaseLink = By.xpath("//span[text()='Copy requirements from phase or round']");
    private By checkBoxOfFileReqToCopy = By.xpath("//input[@type='checkbox' and @name='4576']");
    private By copyReqFromPhaseNameInput = By.xpath("//input[@type='text' and @value='File Upload']");
    private By copyButton = By.xpath("//button[text()='Copy']");

    public CopyReqFromPhase(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCopyReqFromPhaseLink() {
        WebElement copyReqFromPhaseLinkElement = driver.findElement(copyReqFromPhaseLink);
        copyReqFromPhaseLinkElement.click();
    }

    public void checkBoxOfFileReqToCopy() {
        WebElement checkBoxOfFileReqToCopyElement = driver.findElement(checkBoxOfFileReqToCopy);
        checkBoxOfFileReqToCopyElement.click();
    }

    public void fillInCopyReqFromPhaseNameInput(String newName) {
        WebElement copyReqFromPhaseNameInputElement = driver.findElement(copyReqFromPhaseNameInput);
        copyReqFromPhaseNameInputElement.clear();
        copyReqFromPhaseNameInputElement.sendKeys(newName);
    }
    public void clickCopyButton() {
        WebElement copyButtonElement = driver.findElement(copyButton);
        copyButtonElement.click();
    }
}
