package main.specificationDocuments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUpload {

    private WebDriver driver;

    public FileUpload(WebDriver driver) {
        this.driver = driver;
    }
    private By uploadFileButton = By.xpath("");
    private By fileInput = By.xpath("");
    private By pdfFileLocator1 = By.xpath("");


    public void uploadFile() {
        // Отримання поточного каталогу проекту
        String projectPath = System.getProperty("user.dir");

        // Формування шляху до файлу, який знаходиться у папці resources проекту
        String filePath = projectPath + "/src/main/resources//files/MyTestFile1.pdf";

        // Шукаємо елемент для завантаження файлу, використовуючи локатор
        By fileInputLocator = By.id("fileInputId"); // Замініть 'fileInputId' на відповідний локатор

        WebElement fileInput = driver.findElement(fileInputLocator);

        // Завантажуємо файл за вказаним шляхом
        fileInput.sendKeys(filePath);
    }
}
