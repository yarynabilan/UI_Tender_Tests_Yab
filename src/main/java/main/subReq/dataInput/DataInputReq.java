package main.subReq.dataInput;

import main.TenderInformationPanel;
import main.subReq.SubmissionRequirements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DataInputReq extends SubmissionRequirements {
    public DataInputReq(WebDriver driver) {
        super(driver);
    }

    private By dataInputNameFiled = By.xpath("//input[@class=\"contentNormal\"]");
    private By descriptionFiled = By.xpath("//textarea[@class=\"contentNormal\" and @name=\"description\"]");
    private By editButton = By.xpath("//input[@value=\"Edit\"]");
    private By field1 = By.xpath("//*[@id=\"1_field_name\"]");
    private By field2 = By.xpath("//*[@id=\"2_field_name\"]");
    private By field3 = By.xpath("//*[@id=\"3_field_name\"]");
    private By field4 = By.xpath("//*[@id=\"4_field_name\"]");
    private By field5 = By.xpath("//*[@id=\"5_field_name\"]");
    private By field6 = By.xpath("//*[@id=\"6_field_name\"]");
    private By field7 = By.xpath("//*[@id=\"6_field_name\"]");

    public WebElement dataInputNameFiled() {
        return driver.findElement(dataInputNameFiled);
    } public WebElement descriptionFiled() {
        return driver.findElement(descriptionFiled);
    }
    public WebElement editButton() {
        return driver.findElement(editButton);
    } public WebElement field1() {
        return driver.findElement(field1);
    }public WebElement field2() {
        return driver.findElement(field2);
    }public WebElement field3() {
        return driver.findElement(field3);
    }
    public WebElement field4() {
        return driver.findElement(field4);
    }
    public WebElement field5() {
        return driver.findElement(field5);
    }
    public WebElement field6() {
        return driver.findElement(field6);
    }
    public void fillInNameOfDataInputReq() {
        dataInputNameFiled().click();
    }
    public void clickEditButton() {
        editButton().click();
    }

    public DataInputReq fillInNameOfDataInputReq(String newName) {
        WebElement dataInputNameFiled = dataInputNameFiled();
        dataInputNameFiled.clear();
        dataInputNameFiled.sendKeys(newName);
        return this;
    }  public DataInputReq fillInDescriptionFiled(String newDescription) {
        WebElement descriptionFiled = descriptionFiled();
        descriptionFiled.clear();
        descriptionFiled.sendKeys(newDescription);
        return this;
    }
        public DataInputReq fillInfield1(String field1Description) {
        WebElement field1 = field1();
            field1.clear();
            field1.sendKeys(field1Description);
        return this;
    }
    public DataInputReq fillInfield2(String field2Description) {
        WebElement field1 = field1();
        field1.clear();
        field1.sendKeys(field2Description);
        return this;
    }
    public DataInputReq fillInfield3(String field3Description) {
        WebElement field1 = field1();
        field1.clear();
        field1.sendKeys(field3Description);
        return this;
    }
    public DataInputReq fillInfield4(String field4Description) {
        WebElement field1 = field1();
        field1.clear();
        field1.sendKeys(field4Description);
        return this;
    }
    public DataInputReq fillInfield5(String field5Description) {
        WebElement field1 = field1();
        field1.clear();
        field1.sendKeys(field5Description);
        return this;
    }
    public DataInputReq fillInfield6(String field6Description) {
        WebElement field1 = field1();
        field1.clear();
        field1.sendKeys(field6Description);
        return this;
    }
}