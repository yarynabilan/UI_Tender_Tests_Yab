package main.questionAndAnswers;

import main.tenderInformation.TenderDescription;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Question {
        private WebDriver driver;

        public Question(WebDriver driver) {
            this.driver = driver;
        }
        private By newQuestionButton = By.xpath("//img[@title='New question']");
        private By textInputForQuestion = By.xpath("//textarea[@id='question']");
        private By okButton = By.xpath("//input[@type='button' and @value='OK']\n");
        private By sendButton = By.xpath("//input[@type='button' and @value='Send']\n");
    public void addNewQuestion() {
        WebElement newQuestionButton = driver.findElement(this.newQuestionButton);
        newQuestionButton.click();
    }

    public Question fillInQuestionTest(String test) {
        WebElement textInputForQuestion = driver.findElement(this.textInputForQuestion);
        textInputForQuestion.clear();
        textInputForQuestion.sendKeys(test);
        return this;
    }
    public void confirmQuestionOkSend() {
        WebElement okButton = driver.findElement(this.okButton);
        okButton.click();
        WebElement sendButton = driver.findElement(this.sendButton);
        sendButton.click();
    }
    }
