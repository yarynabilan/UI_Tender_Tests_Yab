package main.specificationDocuments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.io.File;

public class FileUpload {

    private WebDriver driver;

    public FileUpload(WebDriver driver) {
        this.driver = driver;
    }
    private By uploadFileButton = By.xpath("//img[@name='upload_file']");
    private By enhancedUploadTab = By.xpath("//nobr[text()='Enhanced upload']");
    private By standartUploadTab = By.xpath("//nobr[text()='Standard upload']");
    private By transferralUploadTab = By.xpath("//nobr[text()='Transferral']");
    private By tenderPhasesTab = By.xpath("//img[@src='/images/info/tender_phases.png']");
    private By myFoldersTab = By.xpath("//div[@class='WMP_trans_pers_folders large_icon']//span[text()='My folders']");
    private By sharedFoldersTab = By.xpath("//img[@src='/images/info/large_desktop_company_folders.png']\n");
    private By ribProjectTab = By.xpath("//img[@src='/images/info/large_desktop_projects.png']\n");
    private By ribArchivesTab = By.xpath("//img[@src='/images/info/large_desktop_archives.png']\n");
    private By ribTendersTab = By.xpath("//img[@src='/images/info/large_desktop_tenders.png']\n");
    private By uploadFoldersTab = By.xpath("//nobr[text()='Upload folders']");
    private By inputForDestinationFolder = By.xpath("//input[@name='name']");
    private By OkButton = By.xpath("//input[@name='OK']");
    private By confirmUpload = By.xpath("//input[@value='OK']");
    private By addFilesButton = By.xpath("//span[text()='Add more files']");
    public static By fileInput = By.xpath("//input[@type='file']");

    private By folderLocator = By.xpath("//span[text()='Folder A']");
    private By fileFromMyFolder = By.xpath("//td[contains(text(), 'FileTøTransferFrom MyFolder.pdf')]/preceding-sibling::td/input[@type='checkbox' and @name='file']\n");
    private By transferButton = By.xpath("//input[@type='button' and @value='Transfer']\n");
    private By selectAllButton = By.xpath("//input[@value='Select all']");

    public void clickUploadFileButton() {
        WebElement uploadFileElement = driver.findElement(uploadFileButton);
        uploadFileElement.click();
    }
    public void clickSelectAllButton() {
        WebElement selectAllElement = driver.findElement(selectAllButton);
        selectAllElement.click();
    }
    public WebElement sharedFoldersTab() {
        return driver.findElement(sharedFoldersTab);
    } public WebElement myFoldersTab() {
        return driver.findElement(myFoldersTab);
    }
    public void clickEnhancedUploadTab() {
        WebElement enhancedUploadElement = driver.findElement(enhancedUploadTab);
        enhancedUploadElement.click();
    }
  public void clickStandardUploadTab() {
        WebElement standartUploadTablement = driver.findElement(standartUploadTab);
      standartUploadTablement.click();
    }public void clickTransferralUploadTab() {
        WebElement transferralUploadTabElement = driver.findElement(transferralUploadTab);
        transferralUploadTabElement.click();
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
        } public void uploadFileToDelete() throws AWTException {
        File uploadFile = new File("src/main/resources/files/fileToDelete.xlsx");
        WebElement fileInputElement = driver.findElement(FileUpload.fileInput);
        fileInputElement.sendKeys(uploadFile.getAbsolutePath());
        }public void standardUpload() throws AWTException {
        File uploadFile = new File("src/main/resources/files/fstandardUpload.txt");
        WebElement fileInputElement = driver.findElement(FileUpload.fileInput);
        fileInputElement.sendKeys(uploadFile.getAbsolutePath());
        }
    public void clickTenderPhasesTab() {
        WebElement tenderPhasesTabElement = driver.findElement(tenderPhasesTab);
        tenderPhasesTabElement.click();
    }
    public By clickMyFoldersTab() {
        WebElement myFoldersTabElement = driver.findElement(myFoldersTab);
        myFoldersTabElement.click();
        return myFoldersTab;
    }

public void selectFileFromMyFolder() {
        WebElement fileFromMyFolderCheckBox = driver.findElement(fileFromMyFolder);
        fileFromMyFolderCheckBox.click();

    }
    public void clickTransferButton() {
        WebElement transferButtonElement = driver.findElement(transferButton);
            transferButtonElement.click();
    }
    public void clickSharedFoldersTab() {
        WebElement sharedFoldersTabElement = driver.findElement(sharedFoldersTab);
        sharedFoldersTabElement.click();
    }
    public void clickRibProjectTab() {
        WebElement ribProjectTabElement = driver.findElement(ribProjectTab);
        ribProjectTabElement.click();
    }
    public void clickRibArchivesTab() {
        WebElement ribArchivesTabElement = driver.findElement(ribArchivesTab);
        ribArchivesTabElement.click();
    }
    public void clickRibTendersTab() {
        WebElement ribTendersTabElement = driver.findElement(ribTendersTab);
        ribTendersTabElement.click();
    }

    public void confirmUpload() {
        WebElement confirmUploadElement = driver.findElement(confirmUpload);
        confirmUploadElement.click();
    }

}