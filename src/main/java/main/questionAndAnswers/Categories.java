package main.questionAndAnswers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Categories {

    private WebDriver driver;
    public Categories(WebDriver driver) {
        this.driver = driver;
    }
    private By manageCategoriesButton = By.xpath("//img[@title='Manage category']");}
