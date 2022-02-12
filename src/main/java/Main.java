import webDriverSettings.DriverSetting;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DriverSetting driver = new DriverSetting();
        driver.setup();
        driver.runBrowser("https://antonyrain.com");
        String title = driver.objHomePage.getTitle();
        String name = driver.objHomePage.getHeaderH1();
        System.out.println(name);
        System.out.println(title);
        Thread.sleep(15000);
        driver.closeBrowser();
    }
}
