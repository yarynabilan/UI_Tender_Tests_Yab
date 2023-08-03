import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait webDriverWait;
    //  protected Logger logger;
    private String title;
    public BasePage(WebDriver driver){
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, 3);
        this.title = title;
    }
}