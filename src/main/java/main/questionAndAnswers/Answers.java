package main.questionAndAnswers;

import main.subReq.allRequirements.espdRequirementPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.io.File;

public class Answers {
    private WebDriver driver;

    public Answers (WebDriver driver) {
        this.driver = driver;
    }
//    private By questionToAnswer = By.xpath("//div[contains(text(), 'It will be published - 2 Admin')]");
    private By questionToAnswer = By.xpath("//tr[@class='rowNormal']/td[@class='vline' and text()='2']\n");
    private By unAnsweredQuestionsTab = By.xpath("//img[@src='/images/info/large_quanda_questions.png']");
    private By draftsTab = By.xpath("//img[@src='/images/info/large_quanda_drafts.png']");
    private By answerToPublishButton = By.xpath("//div[@class='contentNormalLimited' and contains(text(),'It will be published - 2 Admin')]/following-sibling::div[@class='contentNormal']/input[@type='button' and @value='Answer']");
    private By answerToDraft = By.xpath("");
    private By saveAsDraftButton = By.xpath("//input[@type='button' and @value='Save as draft']");
    private By publishButton = By.xpath("//input[@type='button' and @value='Publish']");
    private By anonymizeLink = By.xpath("//div[@id='anonymize_link']");
    private static By fileInput = By.xpath("//input[@type='file']");
    private By inputForUpdatingQuestion = By.xpath("//textarea[@id='question']");
    private By inputForAnswer = By.xpath("//textarea[@id='answer']");
    //private By categoryDropdownLocator = By.xpath("//option[text()='Not categorized']");
    private By categoryDropdownLocator = By.xpath("//select[@name='category']");


    public void goToUnAnsweredQuestionsTab() {
        WebElement unAnsweredQuestionsTab = driver.findElement(this.unAnsweredQuestionsTab);
        unAnsweredQuestionsTab.click();
    }
    public void goToDraftsTab() {
        WebElement draftsTab = driver.findElement(this.draftsTab);
        draftsTab.click();
    }
    public void selectQuestionToAnswer() {
        WebElement questionToAnswer = driver.findElement(this.questionToAnswer);
        questionToAnswer.click();
    }
    public void clickAnswerToPublishButton() {
        WebElement answerToPublishButton = driver.findElement(this.answerToPublishButton);
        answerToPublishButton.click();
    }
    public void clickSaveAsDraftButton() {
        WebElement saveAsDraftButton = driver.findElement(this.saveAsDraftButton);
        saveAsDraftButton.click();
    }
    public void clickPublishButton() {
        WebElement publishButton = driver.findElement(this.publishButton);
        publishButton.click();
    }
    public void clickAnonymizeLink() {
        WebElement anonymizeLink = driver.findElement(this.anonymizeLink);
        anonymizeLink.click();
    }
    public void uploadFileToAdnswer() throws AWTException {
        File uploadFile = new File("src/main/resources/files/QandA attachment.pdf");
        WebElement fileInput = driver.findElement(Answers.fileInput);
        fileInput.sendKeys(uploadFile.getAbsolutePath());
    }
    public Answers fillInQuestionText(String test) {
        WebElement inputForUpdatingQuestion = driver.findElement(this.inputForUpdatingQuestion);
        inputForUpdatingQuestion.clear();
        inputForUpdatingQuestion.sendKeys(test);
            return this;
        }
    public Answers writeAnswer(String test) {
        WebElement inputForAnswer = driver.findElement(this.inputForAnswer);
        inputForAnswer.clear();
        inputForAnswer.sendKeys(test);
        return this;
    }
    public void selectCategory(){
        Select categoryDropdown = new Select(driver.findElement(categoryDropdownLocator));
        categoryDropdown.selectByVisibleText("Not categorized");

    }
    }
//   updatedghjk }

