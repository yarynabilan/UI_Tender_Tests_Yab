package main.subReq.allRequirements;

import main.specificationDocuments.FileUpload;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class espdRequirementPage {
    private static WebDriver driver;

    public espdRequirementPage(WebDriver driver) {
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
    private static By createdESPD = By.xpath("//img[@src='/images/info/large_tender_datamandatory.png' and @title='Test ESPD Requirement Name']");
    private By reuseESPDRadioButton = By.xpath("//input[@value='1']");
    private By uploadESPDButton = By.xpath("//span[text()='Upload ESPD Request']");
    private static By confirmUpload = By.xpath("//input[@name='x']");
    private static By fileInput = By.xpath("//input[@type='file' and @name='file1']");

    public static WebElement createdESPD() {
        return driver.findElement(createdESPD);
    }

    public static WebElement fileInput() {
        return driver.findElement(fileInput);
    }

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

    public static void clickUploadOK() {
        WebElement confirmUploadButton = driver.findElement(confirmUpload);
        confirmUploadButton.click();
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

    public void selectReuseESPDRadioButton() {
        WebElement radioButton = driver.findElement(reuseESPDRadioButton);
        radioButton.click();
    }

    public void clickUploadESPDButton() {
        WebElement uploadEspdElement = driver.findElement(uploadESPDButton);
        uploadEspdElement.click();
    }

    private By fileUploadButtonLocator = By.xpath("//span[text()='Upload ESPD Request']");

    //    public void uploadFileFromResourcesToProject(String fileName) throws AWTException {
//        WebElement fileUploadButtonElement = driver.findElement(fileUploadButtonLocator);
//        fileUploadButtonElement.sendKeys("/src/main/resources/");
//    }
    public void uploadFileFromResourcesToProject(String fileName) throws AWTException {
        String projectPath = System.getProperty("user.dir");
        String filePath = projectPath + "/src/main/resources/" + fileName;
        WebElement fileUploadButtonElement = driver.findElement(fileUploadButtonLocator);
        fileUploadButtonElement.sendKeys(filePath);
    }

    public void uploadFileFromResourcesToProject2() throws AWTException {
        File uploadFile = new File("src/main/resources/espd_request.xml");
        WebElement fileInput = driver.findElement(espdRequirementPage.fileInput);
        fileInput.sendKeys(uploadFile.getAbsolutePath());

    }

}


