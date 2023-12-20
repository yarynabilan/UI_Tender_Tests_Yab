package main.QuetionsAndAnswers;
import main.ApplicationsNavigationTest;
import main.PublicTenderPage;
import main.TendersPage;
import main.questionAndAnswers.Answers;
import main.questionAndAnswers.Categories;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class CategoriesTests extends ApplicationsNavigationTest {

    @Test
    public void addNewCategotyforQuestions() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getQuestionsAndAnswersTab());
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        Categories categories = new Categories(driver);
        String mainWindowHandle = driver.getWindowHandle();
        categories.clickManageCategoriesButton();
        tendersPage.switchToNewWindowTest();
        categories.enterCategoryName("reTest 1");
        categories.clickOkButton();
        driver.switchTo().window(mainWindowHandle);
        tendersPage.switchToNavigationFrame();
        Thread.sleep(3000);
        categories.clickManageCategoriesButton();
        Thread.sleep(3000);
        tendersPage.switchToNewWindowTest();
        categories.enterCategoryName("to Delete");
        categories.clickOkButton();
        driver.switchTo().window(mainWindowHandle);
        tendersPage.switchToNavigationFrame();
        Thread.sleep(3000);
        categories.clickManageCategoriesButton();
        Thread.sleep(3000);
        tendersPage.switchToNewWindowTest();
        categories.enterCategoryName("Test Categoty 2");
        categories.clickOkButton();
    }
    @Test
    public void deleteCategory() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getQuestionsAndAnswersTab());
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        Categories categories = new Categories(driver);
        categories.clickManageCategoriesButton();
        tendersPage.switchToNewWindowTest();
        categories.selectCategoryToDelete();
        categories.clickDelete();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);}
@Test
    public void deleteCategoryInUse() throws InterruptedException {
    TendersPage tendersPage = new TendersPage(driver);
    tendersPage.switchToBrowserFrame();
    PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
    publicTenderPage.clickOnElement(publicTenderPage.getQuestionsAndAnswersTab());
    driver.switchTo().defaultContent();
    tendersPage.switchToNavigationFrame();
    Categories categories = new Categories(driver);
    categories.clickManageCategoriesButton();
    tendersPage.switchToNewWindowTest();
    categories.selectCategoryInUse();
    categories.clickDelete();
    Alert alert = driver.switchTo().alert();
    alert.accept();
    Thread.sleep(3000);
}
@Test
public void editCategoryNameInPublishedAnswers() throws InterruptedException {
    TendersPage tendersPage = new TendersPage(driver);
    tendersPage.switchToBrowserFrame();
    PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
    publicTenderPage.clickOnElement(publicTenderPage.getQuestionsAndAnswersTab());
    driver.switchTo().defaultContent();
    tendersPage.switchToNavigationFrame();
    Categories categories = new Categories(driver);
    Answers answers = new Answers(driver);
    driver.switchTo().defaultContent();
    tendersPage.switchToDirectoryFrame();
    answers.goToPublishedAnswersTab();
    Thread.sleep(3000);
    answers.selectQuestionToAnswer();
    categories.clickEditCategoryButton();
    tendersPage.switchToNewWindowTest();
    categories.enterCategoryName("edited category name");
    categories.clickOkButton();
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
    Thread.sleep(3000);

}
    @Test
    public void deleteCategoryWithPublishedAnswers() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getQuestionsAndAnswersTab());
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        Categories categories = new Categories(driver);
        Answers answers = new Answers(driver);
        driver.switchTo().defaultContent();
        tendersPage.switchToDirectoryFrame();
        answers.goToPublishedAnswersTab();
        Thread.sleep(3000);
        answers.selectQuestionToAnswer();
        categories.clickEditCategoryButton();
        tendersPage.switchToNewWindowTest();
        categories.clickDelete();
        categories.clickOkButton();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);

    }

}