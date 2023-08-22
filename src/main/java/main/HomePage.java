package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.testng.Assert.assertTrue;

public class HomePage extends BasePage {
 //   private By signInByggewebTest = By.xpath("//button[@class='accountButton firstButton' and @id='Byggeweb-OpenIdConnect-TEST']");

//    private By signInButton = By.xpath("//input[@id='submit']");
   // private By userTopLabel = By.xpath("///div[@id = 'companypage-top-user']/p");

    private By logoLocator = By.xpath("//img[@src='images/rib-logo-app.png']");
    private By usernameInputLocator = By.xpath("//input[@id='user']");
    private By passwordInputLocator = By.xpath("//input[@id='password']");
    private By loginButtonLocator = By.xpath("//input[@id='submit']");
    private By errorMessageLabelLocator = By.xpath("//div[@class='error']/p");
    private By forgottenPasswordButtonLocator = By.xpath("//form[@name='login']/parent::div/p[1]/a");

    private final static String TITLE = "Login page";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage(WebDriver driver, String title) {
        super(driver);
    }

    public WebElement getLogo()
    {
        return driver.findElement(logoLocator);
    }

    public HomePage validateErrorMessage(String expectedMessage) {
        String actualMessage = driver.findElement(errorMessageLabelLocator).getText();
        assertTrue(actualMessage.contains(expectedMessage));
        return this;
    }

    public MainPage loginSuccessful(String login, String password) {
        driver.findElement(usernameInputLocator).sendKeys(login);
        driver.findElement(passwordInputLocator).sendKeys(password);
        driver.findElement(loginButtonLocator).click();
        return new MainPage(driver);
    }
    //мейн пейдж - тут обєкт повертаючого значення, те що ми отримуємо головну сторінку апплікації після логіну, стірінги тут - параметри, а у тесті цей стрінг буде називатись аргументом
    public HomePage loginFailed(String login, String password) {
        driver.findElement(usernameInputLocator).sendKeys(login);
        driver.findElement(passwordInputLocator).sendKeys(password);
        driver.findElement(loginButtonLocator).click();
        return this;
    }
}
//    private final static String TITLE = "Home page";
//    public main.HomePage(WebDriver driver) {
//        super(driver, TITLE);
//    }
//
//    public main.LoginPage goToLoginPage() {
//        webDriverWait.until(elementToBeClickable(driver.findElement(signInByggewebTest)));
//        driver.findElement(signInByggewebTest).click();
//        return new main.LoginPage(driver);
//    }
//}
