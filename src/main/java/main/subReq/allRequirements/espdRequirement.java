package main.subReq.allRequirements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class espdRequirement {
    private WebDriver driver;

    public espdRequirement(WebDriver driver) {
        this.driver = driver;
    }
    private By ESPDnameInput = By.xpath("//input[@class='contentNormal' and @type='text' and @name='name']");
    private By ESPDdescriptionFiled = By.xpath("//textarea[@class=\"contentNormal\" and @name=\"description\"]");
    private By mainAuthorityRadioButton = By.xpath("//input[@type='radio' and @name='agent' and @value='ca']");
    private By nextButton = By.xpath("//span[@id='button-1108-btnInnerEl']\n");
    private By nextButton2 = By.xpath("//span[@id='button-1218-btnInnerEl']\n");
    private By nextButton3 = By.xpath("//span[@id='button-1372-btnInnerEl']\n");
    private By saveButton = By.xpath("//span[@id='espdsavebutton-btnInnerEl']");
    private By okButton = By.xpath("//input[@name='x' and @value='OK']");
    private By createdESPD = By.xpath("//img[@src='/images/info/large_tender_datamandatory.png' and @title='Test ESPD Requirement Name']");
    public WebElement createdESPD() { return driver.findElement(createdESPD);}

    public void fillInESPDName(String espdName) {
        WebElement espdNameInput = driver.findElement(ESPDnameInput);
        espdNameInput.clear();
        espdNameInput.sendKeys(espdName);
    }
    public void fillInESPDdescriptionField(String descriptionText) {
        WebElement descriptionFiled = driver.findElement(ESPDdescriptionFiled);
        descriptionFiled.clear();
        descriptionFiled.sendKeys(descriptionText);
    }
    public void selectMainAuthorityRadioButton() {
        WebElement mainAuthorityRadioButton = driver.findElement(this.mainAuthorityRadioButton);
        if (!mainAuthorityRadioButton.isSelected()) {
            mainAuthorityRadioButton.click();
        }
    }
    public void clickOnOk() {
        WebElement okButton = driver.findElement(this.okButton);
        okButton.click();
    }
    public void clickOnNext() {
        WebElement nextButton = driver.findElement(this.nextButton);
        nextButton.click();
    }
    public void clickOnNext2() {
        WebElement nextButton2 = driver.findElement(this.nextButton2);
        nextButton2.click();
    }
    public void clickOnNext3() {
        WebElement nextButton3 = driver.findElement(this.nextButton3);
        nextButton3.click();
    }
    public void clickOnSave() {
        WebElement saveButton = driver.findElement(this.saveButton);
        saveButton.click();
    }


}
