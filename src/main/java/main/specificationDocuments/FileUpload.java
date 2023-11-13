package main.specificationDocuments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    private By addFilesButton = By.xpath("//span[text()='Add more files']");
    private By fileInput = By.xpath("");

    private By folderLocator = By.xpath("//span[text()='Test']");

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

    public void addFileFromResources() {

    }

    public void uploadFile() {

    }


        public static void uploadFileFromResources(String fileName, String destinationPath) throws IOException {
            // Отримати InputStream для файла з ресурсів
            InputStream inputStream = FileUpload.class.getClassLoader().getResourceAsStream(fileName);

            if (inputStream != null) {
                // Зберегти файл у вказаний шлях
                Path destinationFilePath = Path.of(destinationPath, fileName);
                Files.copy(inputStream, destinationFilePath, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("File successfully loaded to: " + destinationFilePath);
            } else {
                System.err.println("File not found in resources.");
            }
        }

}