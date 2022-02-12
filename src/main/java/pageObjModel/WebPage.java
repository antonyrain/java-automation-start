package pageObjModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebPage {
    WebDriver driver;
    By headerH1 = By.tagName("h1");

    public WebPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public String getHeaderH1() {
        return driver.findElement(headerH1).getText();
    }
}
