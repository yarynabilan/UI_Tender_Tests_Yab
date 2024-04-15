package main.questionAndAnswers

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.Select

class Categories(private val driver: WebDriver) {
    val manageCategoriesButton: By = By.xpath("//img[@title='Manage category']")
    private val categoryNameField: By = By.xpath("//td[@class='content']//input[@name='name']")
    private val deleteCategoryDropdown: By = By.xpath("//select[@name='id']")
    private val categoryToDelete: By = By.xpath("//option[contains(text(), 'to delete')]")
    private val categoryToDeleteInUse: By = By.xpath("//option[contains(text(), 'Test Categoty 2')]")
    val deleteCategoryButton: By = By.xpath("//input[@value='Delete']\n")
    val okButton: By = By.xpath("//input[@value='OK']")
    val editCategoryButton: By = By.xpath("//input[@value='Edit category']\n")
    val changeCategoryButton: By = By.xpath("//input[@value='Change category']")
    private val changeCategoryDropdown: By = By.xpath("//select[@name='category']")

    fun enterCategoryName(categoryName: String?) {
        val nameField = driver.findElement(categoryNameField)
        nameField.clear()
        nameField.sendKeys(categoryName)
    }

    fun selectCategoryToDelete() {
        val dropdown = Select(driver.findElement(deleteCategoryDropdown))
        dropdown.selectByVisibleText("to Delete")
    }

    fun changeCategoryForPublishedAnswer() {
        val dropdown = Select(driver.findElement(changeCategoryDropdown))
        dropdown.selectByVisibleText("category TO Change")
    }

    fun selectCategoryInUse() {
        val dropdown = Select(driver.findElement(deleteCategoryDropdown))
        dropdown.selectByVisibleText("Test Categoty 2")
    }


//    fun clickOkButton() {
//        driver.findElement(okButton).click()

    }



