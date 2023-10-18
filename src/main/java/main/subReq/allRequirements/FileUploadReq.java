package main.subReq.allRequirements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadReq {
    private WebDriver driver;

    public FileUploadReq(WebDriver driver) {
        this.driver = driver;
    }
    private By fileUploadInput = By.xpath("//input[@class=\"contentNormal\"]");
    private By descriptionFiled = By.xpath("//textarea[@class=\"contentNormal\" and @name=\"description\"]");
    private By okButton = By.xpath("//input[@name='x' and @value='OK']");
    private By toDeteleFileUploadReq = By.xpath("//span[text()='To Delete Test File Upload Requirement']");
    private By fileUploadReq = By.xpath("//span[text()='Test File Upload Requirement Name']");
    private By confirmDeletion = By.xpath("//input[@type='BUTTON' and @value='OK']");
    private By checkboxDocx = By.xpath("//input[@type='checkbox' and @value='docx']");
    private By checkboxDoc = By.xpath("//input[@type='checkbox' and @value='doc']");
    private By checkboxXlsx = By.xpath("//input[@type='checkbox' and @value='xlsx']");
    private By checkboxXls = By.xpath("//input[@type='checkbox' and @value='xls']");
    private By checkboxPptx = By.xpath("//input[@type='checkbox' and @value='pptx']");
    private By checkboxPpt = By.xpath("//input[@type='checkbox' and @value='ppt']");
    private By checkboxTxt = By.xpath("//input[@type='checkbox' and @value='txt']");
    private By checkboxPdf = By.xpath("//input[@type='checkbox' and @value='pdf']");
    private By checkboxPng = By.xpath("//input[@type='checkbox' and @value='png']");
    private By checkboxJpg = By.xpath("//input[@type='checkbox' and @value='jpg']");



    public WebElement fileUploadInput() {return driver.findElement(fileUploadInput);}
    public WebElement descriptionFiled() {return driver.findElement(descriptionFiled);}
    public WebElement okButton() { return driver.findElement(okButton);}

    public FileUploadReq fillInNameOfFileUploadReq(String fileUploadName) {
        WebElement fileUploadInput = fileUploadInput();
        fileUploadInput.clear();
        fileUploadInput.sendKeys(fileUploadName);
        return this;
    }
    public FileUploadReq fillInDescriptionField(String newDescription) {
        WebElement descriptionFiled = descriptionFiled();
        descriptionFiled.clear();
        descriptionFiled.sendKeys(newDescription);
        return this;
    }
    public void clickOkButton() {
        okButton().click();
    }


    public void selectFileUploadReqToDelete() {
        WebElement toDeteleFileUploadReq = driver.findElement(this.toDeteleFileUploadReq);
        toDeteleFileUploadReq.click();
    }public void selectFileUpload() {
        WebElement fileUploadReq = driver.findElement(this.fileUploadReq);
        fileUploadReq.click();
    }
    public void confirmDeletion() {
        WebElement confirmDeletion = driver.findElement(this.confirmDeletion);
        confirmDeletion.click();
    }
    public void editFileUploadReq() {
        WebElement fileUploadReq = driver.findElement(this.fileUploadReq);
        fileUploadReq.click();

    }
    public void selectCheckboxDocx() {
        WebElement checkboxDocx = driver.findElement(this.checkboxDocx);
        checkboxDocx.click();
    } public void selectCheckboxDoc() {
        WebElement checkboxDoc = driver.findElement(this.checkboxDoc);
        checkboxDoc.click();
    }public void selectCheckboxXlsx() {
        WebElement checkboxXlsx = driver.findElement(this.checkboxXlsx);
        checkboxXlsx.click();
    }public void selectCheckboxXls() {
        WebElement checkboxXls = driver.findElement(this.checkboxXls);
        checkboxXls.click();
    }public void selectCheckboxPptx() {
        WebElement checkboxPptx = driver.findElement(this.checkboxPptx);
        checkboxPptx.click();
    }public void selectCheckboxPpt() {
        WebElement checkboxPpt = driver.findElement(this.checkboxPpt);
        checkboxPpt.click();
    }public void selectCheckboxPdf() {
        WebElement checkboxPdf = driver.findElement(this.checkboxPdf);
        checkboxPdf.click();
    }public void selectCheckboxPng() {
        WebElement checkboxPng = driver.findElement(this.checkboxPng);
        checkboxPng.click();
    }
}
