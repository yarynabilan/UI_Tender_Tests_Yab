package main.specificationDocuments;

import io.qameta.allure.Step;
import lombok.Getter;
import main.LoginPage;
import main.PublicTenderPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertTrue;

@Getter

public class Folders {
    private WebDriver driver;

    public Folders(WebDriver driver) {
        this.driver = driver;
    }
    private By createFolderButton = By.xpath("//img[@title=\"Create folder\"]");
    private By renameFolderButton = By.xpath("//img[@title=\"Rename folder\"]");
    private By deleteFolderButton = By.xpath("//img[@title=\"Delete folder\"]");
    private By inputFolderName = By.xpath("//input[@name=\"name\"]");
    private By popUpFrame = By.xpath("//iframe[@title='No content']");
    private By okButton  = By.xpath("//input[@name='OK']");
    private By errorMessageLocator  = By.xpath("//td[@class='content' and contains(text(), 'Error! The folder name is already in use. Please choose a different name.')]\n");
    public void clickOnCreateFolderButton() {
        WebElement createFolderButton = driver.findElement(this.createFolderButton);
        createFolderButton.click();
    }
    public void clickOnRenameFolderButton() {

        WebElement renameFolderButton = driver.findElement(this.renameFolderButton);
        renameFolderButton.click();
    }
    public void clickOnDeleteOnFolderButton() {
        WebElement deleteFolderButton = driver.findElement(this.deleteFolderButton);
        deleteFolderButton.click();
    }
    public void clickOnOkButton() {
        WebElement  okButton = driver.findElement(this.okButton);
        okButton.click();
    }
    public void fillInFolderName(String folderName) {
        WebElement inputFolderName = driver.findElement(this.inputFolderName);
        inputFolderName.clear();
        inputFolderName.sendKeys(folderName);
    }
    public void switchToPopUpFrame() {
        driver.switchTo().frame(driver.findElement(popUpFrame));
    }

    public Folders validateErrorMessage(String expectedMessage) {
        String actualMessage = driver.findElement(errorMessageLocator).getText();
        assertTrue(actualMessage.contains(expectedMessage));
        return this;
    }

}

