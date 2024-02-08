package main.specificationDocuments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.io.File;

import static java.awt.SystemColor.text;

public class FileUpload {

    private WebDriver driver;

    FileUpload(WebDriver driver) {
        this.driver = driver;
    }
     By uploadFileButton = By.xpath("//img[@name='upload_file']");
     By enhancedUploadTab = By.xpath("//nobr[text()='Enhanced upload']");
     By standartUploadTab = By.xpath("//nobr[text()='Standard upload']");
     By transferralUploadTab = By.xpath("//nobr[text()='Transferral']");
     By tenderPhasesTab = By.xpath("//div[@class='WMP_trans_phases large_icon']//span[text()='Tender phases']");
    By prequalificationTab = By.xpath("//div[@class='timelimit' and div[@class='phase']//span[@class='description' and text()='Prequalification']]");
    By folderALocator = By.xpath("//td[contains(text(), 'Folder A')]");
    By fileFromFirstPhase = By.xpath("//td[contains(text(), 'FileFromFirstPhase.png')]/preceding-sibling::td/input[@type='checkbox']");
    By myFoldersTab = By.xpath("//div[@class='WMP_trans_pers_folders large_icon']//span[text()='My folders']");
    By sharedFoldersTab = By.xpath("//div[@class='WMP_trans_shared_folders large_icon']//span[text()='Shared folders']");
    By ribProjectTab = By.xpath("//div[@class='WMP_trans_projects large_icon']//span[text()='RIB projects']");
    By ribArchivesTab = By.xpath("//div[@class='WMP_trans_archives large_icon']//span[text()='RIB archives']");
    By ribTendersTab = By.xpath("//div[@class='WMP_trans_tenders large_icon']//span[text()='RIB Tenders']");
     By uploadFoldersTab = By.xpath("//nobr[text()='Upload folders']");
     By inputForDestinationFolder = By.xpath("//input[@name='name']");
     By OkButton = By.xpath("//input[@name='OK']");
     By confirmUpload = By.xpath("//input[@value='OK']");
     By addFilesButton = By.xpath("//span[text()='Add more files']");
    public static By fileInput = By.xpath("//input[@type='file']");

     By folderLocator = By.xpath("//span[text()='Folder A']");
     By fileFromMyFolder = By.xpath("//td[contains(text(), 'FileTøTransferFrom MyFolder.pdf')]/preceding-sibling::td/input[@type='checkbox' and @name='file']\n");
     By fileFromSharedFolder = By.xpath("//td[contains(text(), 'From Shared Folder.pdf')]/preceding-sibling::td/input[@type='checkbox' and @name='file']");
     By transferButton = By.xpath("//input[@type='button' and @value='Transfer']\n");
     By selectAllButton = By.xpath("//input[@value='Select all']");
     By downloadFileButton = By.xpath("//img[@name='download_file']");
     By fileToDownload = By.xpath("//nobr[contains(text(),'File To Move.png')]");
     By previewFileButton = By.xpath("//img[@title='Preview file with RIB-viewer']");
     By openFileButton = By.xpath("//img[@title='Open original file']");
     By compareFileButton = By.xpath("//img[@title='Compare two file versions']");
     By fileLink = By.xpath("//span[@class='contentHeading1']");
     By confirmCompareFileButton = By.xpath("//input[@value='Compare']");
     By fileInfoButton = By.xpath("//nobr[contains(text(),'File information')]");
     By subjectMetadataField = By.xpath("//input[@name='metadata_566559_Ref']");
     By updateButton = By.xpath("//input[@value='Update']");

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
        }
        public void uploadFileToDelete() throws AWTException {
        File uploadFile = new File("src/main/resources/files/fileToDelete.xlsx");
        WebElement fileInputElement = driver.findElement(FileUpload.fileInput);
        fileInputElement.sendKeys(uploadFile.getAbsolutePath());
        }
        public void standardUpload() throws AWTException {
        File uploadFile = new File("src/main/resources/files/standardUpload.txt");
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
    public void selectFileFromSharedFolder() {
        WebElement fileFromSharedFolderCheckBox = driver.findElement(fileFromSharedFolder);
        fileFromSharedFolderCheckBox.click();
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
    public void clickOnPrequalificationTab() {
            WebElement prequalificationTabElement = driver.findElement(prequalificationTab);
            prequalificationTabElement.click();
        }

        public void selectFileFromFirstPhase() {
            WebElement fileFromFirstPhaseElement = driver.findElement(fileFromFirstPhase);
            fileFromFirstPhaseElement.click();
        }
    public void clickOnFolderA() {
        WebElement folderAElement = driver.findElement(folderALocator);
        folderAElement.click();
    }
    public void clickDownloadButton() {
        WebElement downloadFileButtonElement = driver.findElement(downloadFileButton);
        downloadFileButtonElement.click();
    }    public void selectFileToDownload() {
        WebElement fileToDownloadElement = driver.findElement(fileToDownload);
        fileToDownloadElement.click();
    }
    public void clickOnPreviewFileButton() {
        WebElement previewFileButtonElement = driver.findElement(previewFileButton);
        previewFileButtonElement.click();
    }

    public void clickOnOpenFileButton() {
        WebElement openFileButtonElement = driver.findElement(openFileButton);
        openFileButtonElement.click();
    }
   public void clickOnFileLink() {
        WebElement fileLinkElement = driver.findElement(fileLink);
       fileLinkElement.click();
    }

    public void clickOnCompareFileButton() {
        WebElement compareFileButtonElement = driver.findElement(compareFileButton);
        compareFileButtonElement.click();
    }
    public void confirmCompareFile() {
        WebElement confirmCompareFileButtonElement = driver.findElement(confirmCompareFileButton);
        confirmCompareFileButtonElement.click();
    }  public void clickFileInfoButton() {
        WebElement fileInfoButtonElement = driver.findElement(fileInfoButton);
        fileInfoButtonElement.click();
    }
    public void clickUpdateButton() {
        WebElement updateButtonElement = driver.findElement(updateButton);
        updateButtonElement.click();
    }  public void updateSubjectMetadataFiled(String text) {
        WebElement subjectMetadataFieldElement = driver.findElement(subjectMetadataField);
        subjectMetadataFieldElement.click();
        subjectMetadataFieldElement.sendKeys(text);


    }

    }

