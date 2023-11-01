package main.users;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class allUsers {
    private WebDriver driver;
    public allUsers(WebDriver driver) {
        this.driver = driver;
    }
    private By administratorsTab = By.xpath("//img[@src='/images/info/large_tender_administrators.png']");
    private By tenderersTab = By.xpath("//img[@src='/images/info/large_tender_tenderers.png']");
    private By clientVendorsTab = By.xpath("//img[@src='/images/info/large_tender_company_users.png']");
    private By addUserButton = By.xpath("//option[contains(text(), 'to delete')]");
    private By removeUserButton = By.xpath("//input[@value='Delete']\n");
    private By okButton = By.xpath("//input[@value='OK']");
    private By selectPreviouslyInvitedUsersLink = By.xpath("//input[@value='OK']");
    public void clickAdmTab() {
        WebElement admTabElement = driver.findElement(administratorsTab);
        admTabElement.click();
    }
    public void clickTenderersTab() {
        WebElement tenderersTabElement = driver.findElement(tenderersTab);
        tenderersTabElement.click();
    }
    public void clickVendorsTab() {
        WebElement vendorsTabElement = driver.findElement(clientVendorsTab);
        vendorsTabElement.click();
    }


//    public void selectCategoryToDelete() {
//        Select checkBox = new Select(driver.findElement(deleteCategoryDropdown));
//        checkBox.selectByVisibleText("to delete");
//    }


    public void confirmOK() {
        WebElement okButtonElement = driver.findElement(okButton);
        okButtonElement.click();}

}


