package main.subReq.allRequirements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CopyReqFromAnotherTender {
    private WebDriver driver;
    private By tenderToCopyReqFrom = By.xpath("//td[contains(., 'Tender - Copy requirement (for Auto TestProject)')]");
    private By checkBoxOfDataReqToCopy = By.xpath("//input[@type='checkbox' and @name='4575']");
    private By copyReqFromAnotherTenderNameInput = By.xpath("//input[@type='text' and @value='data input test']");
    private By copyButton = By.xpath("//button[text()='Copy']");

    public CopyReqFromAnotherTender(WebDriver driver) {
        this.driver = driver;
    }

    public void selectTenderToCopyReqFrom() {
        WebElement tenderToCopyReqFromElement = driver.findElement(tenderToCopyReqFrom);
        tenderToCopyReqFromElement.click();
    } public void checkBoxOfDataReqToCopy() {
        WebElement checkBoxOfDataReqToCopyElement = driver.findElement(checkBoxOfDataReqToCopy);
        checkBoxOfDataReqToCopyElement.click();
    }

    public void fillIncopyReqFromAnotherTenderNameInput(String newName) {
        WebElement copyReqFromAnotherTenderNameInputElement = driver.findElement(copyReqFromAnotherTenderNameInput);
        copyReqFromAnotherTenderNameInputElement.clear();
        copyReqFromAnotherTenderNameInputElement.sendKeys(newName);
    }

    public void clickCopyButton() {
        WebElement copyButtonElement = driver.findElement(copyButton);
        copyButtonElement.click();
    }
}

