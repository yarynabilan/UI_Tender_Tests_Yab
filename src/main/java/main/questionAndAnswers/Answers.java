package main.questionAndAnswers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Answers {
    private WebDriver driver;

    public Answers (WebDriver driver) {
        this.driver = driver;
    }
    private By questionToAnswer = By.xpath("//div[contains(text(), 'It will be published - 2 Admin')]");
    private By answerToPublishButton = By.xpath("//div[@class='contentNormalLimited' and contains(text(),'It will be published - 2 Admin')]/following-sibling::div[@class='contentNormal']/input[@type='button' and @value='Answer']");
    private By answerToDraft = By.xpath("");
    private By saveAsDraftButton = By.xpath("//input[@type='button' and @value='Save as draft']");
    private By publishButton = By.xpath("//input[@type='button' and @value='Publish']");
    private By anonymizeLink = By.xpath("//div[@id='anonymize_link']");
    private By inputForFile = By.xpath("//input[@type='file']");
    private By inputForUpdatingQuestion = By.xpath("//textarea[@id='question']");
    private By inputForAnswer = By.xpath("//textarea[@id='answer']");

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
    public void addAttachmentToAnswer() {
        WebElement inputForFile = driver.findElement(this.inputForFile);
        inputForFile.click();
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
    }
//   updatedghjk }

