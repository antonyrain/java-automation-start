package webDriverSettings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObjModel.WebPage;

public class DriverSetting {
    WebDriver driver;
    public WebPage objHomePage;

    public void setup() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        this.driver = new ChromeDriver(options);
    }

    public void runBrowser(String url) {
        objHomePage = new WebPage(driver);
        driver.get(url);
    }

    public void closeBrowser() {
        driver.quit();
    }
}