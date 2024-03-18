package main.specificationDocuments

import lombok.Getter
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.testng.Assert

@Getter
class Folders(private val driver: WebDriver) {
    private val createFolderButton: By = By.xpath("//img[@title=\"Create folder\"]")
    private val renameFolderButton: By = By.xpath("//img[@title=\"Rename folder\"]")
    private val deleteFolderButton: By = By.xpath("//img[@title=\"Delete folder\"]")
    private val inputFolderName: By = By.xpath("//input[@name=\"name\"]")
    private val popUpFrame: By = By.xpath("//iframe[@title='No content']")
    private val okButton: By = By.xpath("//input[@name='OK']")
    private val errorMessageLocator: By = By.xpath("//td[@class='content' and contains(text(), 'Error! The folder name is already in use. Please choose a different name.')]\n")
    fun clickOnCreateFolderButton() {
        val createFolderButton = driver.findElement(this.createFolderButton)
        createFolderButton.click()
    }

    fun clickOnRenameFolderButton() {
        val renameFolderButton = driver.findElement(this.renameFolderButton)
        renameFolderButton.click()
    }

    fun clickOnDeleteOnFolderButton() {
        val deleteFolderButton = driver.findElement(this.deleteFolderButton)
        deleteFolderButton.click()
    }

    fun clickOnOkButton() {
        val okButton = driver.findElement(this.okButton)
        okButton.click()
    }

    fun fillInFolderName(folderName: String?) {
        val inputFolderName = driver.findElement(this.inputFolderName)
        inputFolderName.clear()
        inputFolderName.sendKeys(folderName)
    }

    fun validateErrorMessage(expectedMessage: String?): Folders {
        val actualMessage = driver.findElement(errorMessageLocator).text
        Assert.assertTrue(actualMessage.contains(expectedMessage!!))
        return this
    }
}

