import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignOutPage extends BasePage {

    private By signOutLocator = By.xpath("//span[@onclick=\"Company.User.LogOff();\"]");

    private final static String TITLE = "SignOut page";
    public SignOutPage(WebDriver driver) {
        super(driver, TITLE);
    }

    public WebElement getSignOutLocator() {
        return driver.findElement(signOutLocator);
    }
}

