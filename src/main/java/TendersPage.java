import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class TendersPage extends BasePage {

    List<WebElement> repositoriesList = driver.findElements(By.xpath("//a[@itemprop=\"name codeRepository\"]"));
    private final static String TITLE = "Tenders";
    public TendersPage(WebDriver driver) {
        super(driver, TITLE);
    }

    public List<String> getRepositories() {
        List<String> repositList = repositoriesList.stream().map(rep -> rep.getText()).collect(Collectors.toList());
        return repositList;
    }
}