package main.questionAndAnswers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ExportQandA {
    private WebDriver driver;

    public ExportQandA(WebDriver driver) {
        this.driver = driver;
    }
    private By exportQuestionButton = By.xpath("//img[@title='Export Q&A']");
    private By fileFormatDropdown = By.xpath("//select[@name='fileformat']");
    private By wordFormatOption = By.xpath("//option[@value='word']");
    private By excelFormatOption = By.xpath("//option[@value='excel']");
    private By sortColumnDropdown = By.xpath("//select[@name='column']");
    private By answerDateOption = By.xpath("//option[@value='AnswerDate']");
    private By questionDateOption = By.xpath("//option[@value='CreateDate']");
    private By sortOrderDropdown = By.xpath("//select[@name='direction']");
    private By oldestFirstOption = By.xpath("//option[@value='asc']");
    private By newestFirstOption = By.xpath("//option[@value='desc']");
    private By qANDaStatusDropdown = By.xpath("//select[@name='status']");
    private By allOption = By.xpath("//select[@name='status']/option[text()='All']");
    private By unansweredOption = By.xpath("//select[@name='status']/option[text()='Unanswered questions']");
    private By draftsOption = By.xpath("//select[@name='status']/option[text()='Drafts']");
    private By publishedOption = By.xpath("//select[@name='status']/option[text()='Published answers']");
    private By okButton = By.xpath("//input[@type='submit' and @value='OK']");
    private By link = By.xpath("//a[@id='filelink' and contains(text(), 'QA')]");

    public WebElement link(){return driver.findElement(link);}

    public void clickExportQA_button() {
        WebElement exportQuestionButtonElement = driver.findElement(exportQuestionButton);
        exportQuestionButtonElement.click();
    }
    public void selectWordFormat() {
        WebElement wordFormatOptionElement = driver.findElement(wordFormatOption);
        wordFormatOptionElement.click();}
    public void selectAll_QA() {
        Select qANDaStatusDropdownElement = new Select(driver.findElement(qANDaStatusDropdown));
        qANDaStatusDropdownElement.selectByVisibleText("All");
    }
    public void confirmOK() {
        WebElement okButtonElement = driver.findElement(okButton);
        okButtonElement.click();}
    public void selectExcelFormat() {
        WebElement excelFormatOptionElement = driver.findElement(excelFormatOption);
        excelFormatOptionElement.click();}

        public void sortByAnswerDate() {
            Select sortColumnDropdownElement = new Select(driver.findElement(sortColumnDropdown));
            sortColumnDropdownElement.selectByValue("AnswerDate");
        }
    public void sortByOrderDesc() {
        Select sortOrderDropdownElement = new Select(driver.findElement(sortOrderDropdown));
        sortOrderDropdownElement.selectByValue("desc");}
    public void selectAll() {
        Select qANDaStatusDropdownElement = new Select(driver.findElement(qANDaStatusDropdown));
        qANDaStatusDropdownElement.selectByVisibleText("All");
    }
    public void selectUnanswered() {
        Select qANDaStatusDropdownElement = new Select(driver.findElement(qANDaStatusDropdown));
        qANDaStatusDropdownElement.selectByVisibleText("Unanswered questions");
    }

    public void selectDrafts() {
        Select qANDaStatusDropdownElement = new Select(driver.findElement(qANDaStatusDropdown));
        qANDaStatusDropdownElement.selectByVisibleText("Drafts");
    }

    public void selectPublished() {
        Select qANDaStatusDropdownElement = new Select(driver.findElement(qANDaStatusDropdown));
        qANDaStatusDropdownElement.selectByVisibleText("Published answers");
    }

//    public boolean getLinkLocator() {
//        WebElement linkElement = driver.findElement(link);
//        return linkElement.isDisplayed();
//    }

}
