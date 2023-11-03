package main.users.all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClientVendors {

    private WebDriver driver;
    public ClientVendors(WebDriver driver) {
        this.driver = driver;
    }
    private By nameFiled = By.xpath("//input[@name=\"name\"]");
    private By emailField = By.xpath("//input[@name=\"email\"]");
    private By messageField = By.xpath("//textarea[@name=\"message\"]");
    private By danskDropdown = By.xpath("//textarea[@name=\"message\"]");
    private By okButton = By.xpath("//input[@value=\"OK\"]\n");


}
