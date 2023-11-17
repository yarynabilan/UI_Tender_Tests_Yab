package main.specificationDocuments;

import main.subReq.allRequirements.espdRequirementPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
public class FileUpload {

    private WebDriver driver;

    public FileUpload(WebDriver driver) {
        this.driver = driver;
    }

    private By uploadFileButton = By.xpath("//img[@name='upload_file']");
    private By enhancedUploadTab = By.xpath("//nobr[text()='Enhanced upload']");
    private By standartUploadTab = By.xpath("//nobr[text()='Standard upload']");
    private By transferralUploadTab = By.xpath("//nobr[text()='Transferral']");
    private By uploadFoldersTab = By.xpath("//nobr[text()='Upload folders']");
    private By inputForDestinationFolder = By.xpath("//input[@name='name']");
    private By OkButton = By.xpath("//input[@name='OK']");
    private By confirmUpload = By.xpath("//input[@value='OK']");
    private By addFilesButton = By.xpath("//span[text()='Add more files']");
    private static By fileInput = By.xpath("//input[@type='file']");

    private By folderLocator = By.xpath("//span[text()='Folder A']");

    public void clickUploadFileButton() {
        WebElement uploadFileElement = driver.findElement(uploadFileButton);
        uploadFileElement.click();
    }

    public void clickEnhancedUploadTab() {
        WebElement enhancedUploadElement = driver.findElement(enhancedUploadTab);
        enhancedUploadElement.click();
    }

    public void inputDestinationFolder(String folderName) {
        WebElement destinationFolderElement = driver.findElement(inputForDestinationFolder);
        destinationFolderElement.sendKeys(folderName);
    }

    public void clickOkButton() {
        WebElement okButtonElement = driver.findElement(OkButton);
        okButtonElement.click();
    }

    public void clickAddFilesButton() {
        WebElement addFilesElement = driver.findElement(addFilesButton);
        addFilesElement.click();
    }
    public void selectFolder() {
        WebElement folderElement = driver.findElement(folderLocator);
        folderElement.click();
    }

    public void uploadFirstFileVersion() throws AWTException {
        File uploadFile = new File("src/main/resources/files/Test File.pdf");
        WebElement fileInputElement = driver.findElement(FileUpload.fileInput);
        fileInputElement.sendKeys(uploadFile.getAbsolutePath());
        }
        public void uploadSecondFileVersion() throws AWTException {
        File uploadFile = new File("src/main/resources/files/filesVersion2/Test File.pdf");
        WebElement fileInputElement = driver.findElement(FileUpload.fileInput);
        fileInputElement.sendKeys(uploadFile.getAbsolutePath());
        }
        public void uploadFileToMove() throws AWTException {
        File uploadFile = new File("src/main/resources/files/File To Move.png");
        WebElement fileInputElement = driver.findElement(FileUpload.fileInput);
        fileInputElement.sendKeys(uploadFile.getAbsolutePath());
        }
    public void confirmUpload() {
        WebElement confirmUploadElement = driver.findElement(confirmUpload);
        confirmUploadElement.click();
    }

}