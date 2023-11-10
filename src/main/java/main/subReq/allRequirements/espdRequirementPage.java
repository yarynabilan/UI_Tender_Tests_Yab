package main.subReq.allRequirements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.InputStream;
public class espdRequirementPage {
    private WebDriver driver;

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
    private By createdESPD = By.xpath("//img[@src='/images/info/large_tender_datamandatory.png' and @title='Test ESPD Requirement Name']");
    private By reuseESPDRadioButton = By.xpath("//input[@value='1']");
    private By uploadESPDButton = By.xpath("//span[text()='Upload ESPD Request']");
    private By confirmUpload = By.xpath("//input[@name='x']");

    public WebElement createdESPD() {
        return driver.findElement(createdESPD);
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

    public void clickUploadOK() {
        WebElement confirmUploadButton = driver.findElement(this.confirmUpload);
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

    public void uploadFileFromResources() throws InterruptedException {
        Thread.sleep(3000);

        // Знайти елемент для завантаження файлу
        WebElement uploadElement = driver.findElement(uploadESPDButton);

        // Вказати шлях до файлу у ресурсах
        String filePath = "src/main/resources/files/espd_request.xml";

        // Завантажити файл за допомогою методу sendKeys
        uploadElement.sendKeys(filePath);

        // Додати паузу або очікування, щоб забезпечити завантаження файлу перед подальшими діями
        // Наприклад: Thread.sleep(3000);

        // Тут можна додати код для подальших дій після завантаження файлу
        // Наприклад, клікнути на інші елементи чи натискати кнопку
        // Наприклад: WebElement uploadButton = driver.findElement(By.xpath("//button[@id='uploadButton']"));
        // uploadButton.click();
    }

    public void uploadTest() {
        try {
            // Specify the file name and destination path
            String fileName = "espd_request.xml";
            String destinationPath = "src/main/resources/files";

            // Load the file from the classpath
            InputStream inputStream = espdRequirementPage.class.getClassLoader().getResourceAsStream(fileName);

            if (inputStream != null) {
                // Save the file to the destination directory
                Path destinationFilePath = Path.of(destinationPath, fileName);
                Files.copy(inputStream, destinationFilePath, StandardCopyOption.REPLACE_EXISTING);

                System.out.println("File successfully loaded to: " + destinationFilePath);
            } else {
                System.err.println("File not found in resources.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void uploadFileFromResources2() {
        try {
            // Ім'я файлу, яке міститься в ресурсах
            String fileName = "espd_request.xml";

            // Отримуємо InputStream для файла з ресурсів
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName);

            if (inputStream != null) {
                // Завантажуємо файл з ресурсів безпосередньо
                uploadFile(inputStream);

                System.out.println("File successfully loaded from resources.");
            } else {
                System.err.println("File not found in resources.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Метод для завантаження файлу із InputStream
    private void uploadFile(InputStream inputStream) throws IOException {
        // Код для завантаження файлу, використовуючи ваш спосіб завантаження
        // Наприклад, виклик методу uploadFile(inputStream)
        // ...

        // Додатково, якщо вам потрібно, ви можете використовувати WebDriver для взаємодії з елементами на сторінці
        // Наприклад:
        // WebElement uploadButton = driver.findElement(By.xpath("//button[@id='uploadButton']"));
        // uploadButton.click();

        // Пауза або очікування, щоб забезпечити завантаження файлу перед подальшими діями
        // Наприклад: Thread.sleep(3000);
    }



    // Отримати абсолютний шлях до ресурсу
    private String getAbsolutePathFromResource(String resource) throws IOException, URISyntaxException {
        URL resourceUrl = getClass().getClassLoader().getResource(resource);
        if (resourceUrl != null) {
            return Paths.get(resourceUrl.toURI()).toAbsolutePath().toString();
        } else {
            throw new FileNotFoundException("Resource not found: " + resource);
        }
    }
}