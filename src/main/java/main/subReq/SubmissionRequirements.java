package main.subReq;

import lombok.Getter;
import main.PublicTenderPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Getter
public class SubmissionRequirements extends PublicTenderPage {
    public SubmissionRequirements(WebDriver driver) {
        super(driver);
    }

    private By createSubReqButton = By.xpath("//img[@title=\"Register submission requirement\"]");
    private By dataInputReqLink = By.xpath("//span[text()=\"Data input requirement\"]");
    private By fileUploadReqLink = By.xpath("//span[text()=\"File upload requirement\"]");
    private By edpdReqLink = By.xpath("//span[text()=\"European Single Procurement Document (ESPD)\"]");
    private By copyReqFromPhaseOrRoundLink = By.xpath("//span[text()=\"Copy requirements from phase or round\"]");
    private By copyReqFromAnotherTenderLink = By.xpath("//span[text()=\"Copy requirements from another tender\"]");

    public WebElement createSubReqButton() {return driver.findElement(createSubReqButton);}
    public WebElement dataInputReqLink() {return driver.findElement(dataInputReqLink);}
    public WebElement fileUploadReqLink() {return driver.findElement(fileUploadReqLink);}
    public WebElement edpdReqLink() {return driver.findElement(edpdReqLink);}
    public WebElement copyReqFromPhaseOrRoundLink() {return driver.findElement(copyReqFromPhaseOrRoundLink);}
    public WebElement copyReqFromAnotherTenderLink() {return driver.findElement(copyReqFromAnotherTenderLink);}

    public void clickOnCreateSubReqButton() {
        createSubReqButton().click();
    }
    public void clickOnDataInputReqLink() {dataInputReqLink().click();}
    public void clickOnFileUploadReqLink() {
        fileUploadReqLink().click();
    }
    public void clickOnEdpdReqLink() {edpdReqLink().click();}
    public void clickOnCopyReqFromPhaseOrRoundLink() {
        copyReqFromPhaseOrRoundLink().click();
    }
    public void clickOncopyReqFromAnotherTenderLink() {
        copyReqFromAnotherTenderLink().click();
    }

}