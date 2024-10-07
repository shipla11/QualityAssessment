package BaseClass;


import Utility.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static String browser;
    public static String url;

    public static WebDriver getDriver(){
        if (driver==null){
            launchBrowser();
        }
        return driver;
    }

    public static WebDriver launchBrowser() {
        ConfigReader reader = new ConfigReader();
        browser=ConfigReader.browser;
        url=ConfigReader.url;
        if(browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            driver=new ChromeDriver();
        }else if(browser.equalsIgnoreCase("firefox")){
            driver=new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
            driver=new EdgeDriver();

        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }

}
