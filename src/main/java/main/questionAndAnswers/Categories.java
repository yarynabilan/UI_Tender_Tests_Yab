package main.questionAndAnswers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Categories {

    private WebDriver driver;
    public Categories(WebDriver driver) {
        this.driver = driver;
    }
    private By manageCategoriesButton = By.xpath("//img[@title='Manage category']");
    private By categoryNameField = By.xpath("//td[@class='content']//input[@name='name']");
    private By deleteCategoryDropdown = By.xpath("//select[@name='id']");
    private By categoryToDelete = By.xpath("//option[contains(text(), 'to delete')]");
    private By categoryToDeleteInUse = By.xpath("//option[contains(text(), 'Test Categoty 2')]");
    private By deleteCategoryButton = By.xpath("//input[@value='Delete']\n");
    private By okButton = By.xpath("//input[@value='OK']");
    public void clickManageCategoriesButton() {
        driver.findElement(manageCategoriesButton).click();
    }

    public void enterCategoryName(String categoryName) {
        WebElement nameField = driver.findElement(categoryNameField);
        nameField.clear();
        nameField.sendKeys(categoryName);
    }

    public void selectCategoryToDelete() {
        Select dropdown = new Select(driver.findElement(deleteCategoryDropdown));
        dropdown.selectByVisibleText("to delete");
    } public void selectCategoryInUse() {
        Select dropdown = new Select(driver.findElement(deleteCategoryDropdown));
        dropdown.selectByVisibleText("Test Categoty 2");
    }

    public void clickDelete() {
        driver.findElement(deleteCategoryButton).click();
    }
    public void clickOkButton() {
        driver.findElement(okButton).click();
    }

}


