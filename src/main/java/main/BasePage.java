package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Set;

public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait webDriverWait;
    private String title;

    public BasePage(WebDriver driver){
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, 3);
        this.title = title;
    }

    public void switchToNewWindow(String mainWindowHandle) {
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String windowHandle : allWindowHandles) {
            if (!windowHandle.equals(mainWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }
    public void switchToLastTab() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        try {
            driver.switchTo().window(tabs.get(tabs.size() - 1));
        } catch (IndexOutOfBoundsException ex) {
            throw new RuntimeException("Switching to tab is impossible because it doesn't exist.");
        }
    }

    public void switchToFrame(WebElement frameElement) {
        driver.switchTo().frame(frameElement);
    }

    public void switchToParentFrame() {
        driver.switchTo().parentFrame();
    }

    public void switchToNewWindowTest() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }
}
