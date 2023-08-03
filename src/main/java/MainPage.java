
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertTrue;
public class
MainPage extends BasePage {
    private By imgLocator = By.xpath("//div[@id = 'companypage-top-user']/p"); // це user TOP Label
    //   By userTopLabel = By.xpath("///div[@id = 'companypage-top-user']/p");
    private By signOutLocator = By.xpath("//span[@onclick=\"Company.User.LogOff();\"]");
    private By applications = By.xpath("//*[@id='tab_applications']");
    private final static String TITLE = "Main page";

    public MainPage(WebDriver driver) {

        super(driver);
    }

    public WebElement getProfileLogoOnTheMainPage() {
        return driver.findElement(imgLocator);
    }

    public WebElement signOut() {
        return driver.findElement(signOutLocator);
    }
    public WebElement applications(){

        return driver.findElement(applications);
}



    public MainPage goToMainPage() {
        assertTrue(driver.findElement(signOutLocator).isDisplayed());
        driver.findElement(signOutLocator).click();
        return new MainPage(driver);
    }

    public MainPage navigateToApplications(){
        driver.findElement(applications).click();
        return this;
    }
}


//import org.openqa.selenium.By;
//        import com.codeborne.selenide.SelenideElement;
//        import org.openqa.selenium.WebDriver;
//        import org.openqa.selenium.WebElement;
//
//        import static com.codeborne.selenide.Selectors.byXpath;
//        import static com.codeborne.selenide.Selenide.$;
//        import static org.testng.Assert.assertTrue;

//public class MySpace extends BasePage {
//
//    By signOutLocator = By.xpath("//span[@onclick=\"Company.User.LogOff();\"]");
//    By userTopLabel = By.xpath("///div[@id = 'companypage-top-user']/p");
//    By tenderLink = By.xpath("//li[@id='docia_tender']");
//
//    private final static String TITLE = "My space - Desktop";
//    public MySpace(WebDriver driver) {
//        super(driver, TITLE);
//    }
//

//
//    public TendersPage gotoAllTendersPage() {
//        assertTrue(driver.findElement(tenderLink).isDisplayed());
//        driver.findElement(tenderLink).click();
//        return new TendersPage(driver);
//    }
//
//
//}