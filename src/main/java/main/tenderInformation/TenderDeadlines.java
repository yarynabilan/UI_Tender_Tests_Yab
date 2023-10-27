package main.tenderInformation;

import lombok.Getter;
import main.PublicTenderPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
@Getter
public class TenderDeadlines {
    private WebDriver driver;

    private By startDateInput = By.xpath("//input[@type='text' and @class='date hasDatepicker' and @name='PRI_startdate' and @id='PRI_startdate']");
    private By submissionDeadlineDateInput = By.xpath("//input[@type='text' and @class='date hasDatepicker' and @name='PRI_enddate' and @id='PRI_enddate']");
    private By deadlineForReceivingQuestionsDateInput= By.xpath("//input[@type='text' and @class='date hasDatepicker' and @name='PRI_qadate' and @id='PRI_qadate']");
    private By okButton = By.xpath("//input[@type='button' and @name='x']");
    private By deadlinesSubTab = By.xpath("//img[@src='/images/info/large_tender_deadlines.png']");
    private By startDateHoursInput = By.xpath("//td[@class='value']//input[@type='text' and @class='time' and @name='PRI_starttime']");
    private By submissionDeadlineInput = By.xpath("//td[@class='value']//input[@type='text' and @class='time' and @name='PRI_endtime']");
    private By deadlineForReceivingQuestionsInput = By.xpath("//td[@class='value']//input[@type='text' and @class='time' and @name='PRI_qatime']");
    private By saveButton = By.xpath("//button[text()='Save']");
    private By directoryFrame = By.xpath("//frame[@name='directory']");

    private final static String TITLE = "Tender Deadlines";

    public TenderDeadlines(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement startDateInput(){return driver.findElement(startDateInput);}
    public WebElement submissionDeadlineDateInput(){return driver.findElement(submissionDeadlineDateInput);}
    public WebElement deadlineForReceivingQuestionsDateInput(){return driver.findElement(deadlineForReceivingQuestionsDateInput);}
    public WebElement startDateHoursInput(){return driver.findElement(startDateHoursInput);}
    public WebElement submissionDeadlineHoursInput(){return driver.findElement(submissionDeadlineInput);}
    public WebElement deadlineForReceivingQuestionsHoursInput(){return driver.findElement(deadlineForReceivingQuestionsInput);}

    public void clickSaveButton() {
        WebElement saveButtonElement = driver.findElement(saveButton);
        saveButtonElement.click();
    }
    public TenderDeadlines changeStartDate (String newDate) {
        WebElement startDateInput = startDateInput();
        startDateInput.clear();
        startDateInput.sendKeys(newDate);
        return this;
    }
    public TenderDeadlines changeSubmissionDeadlineDate (String newSubmissionDate) {
        WebElement submissionDeadlineDateInput = submissionDeadlineDateInput();
        submissionDeadlineDateInput.clear();
        submissionDeadlineDateInput.sendKeys(newSubmissionDate);
        return this;
    }
    public TenderDeadlines changeDateOfReceivingQuestions (String newDateOfReceivingQuestions) {
        WebElement deadlineForReceivingQuestionsDateInput = deadlineForReceivingQuestionsDateInput();
        deadlineForReceivingQuestionsDateInput.clear();
        deadlineForReceivingQuestionsDateInput.sendKeys(newDateOfReceivingQuestions);
        return this;
    }

    public TenderDeadlines changeSubmissionDeadline(String newTime) {
        WebElement inputElementTime = submissionDeadlineHoursInput();
        inputElementTime.clear();
        inputElementTime.sendKeys(newTime);
        return this;
    }
    public TenderDeadlines changeDeadlineForReceivingQuestions(String newTime) {
        WebElement inputElementTime = deadlineForReceivingQuestionsHoursInput();
        inputElementTime.clear();
        inputElementTime.sendKeys(newTime);
        return this;
    }public TenderDeadlines changeStartDateHours(String newTime) {
        WebElement inputElementTime = startDateHoursInput();
        inputElementTime.clear();
        inputElementTime.sendKeys(newTime);
        return this;

}
}