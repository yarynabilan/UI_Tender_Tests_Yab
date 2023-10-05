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
}
