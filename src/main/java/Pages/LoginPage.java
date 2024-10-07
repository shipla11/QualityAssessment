package Pages;

import BaseClass.TestBase;
import Utility.FunctionCaller;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends TestBase {
    public static WebDriver driver = getDriver();
    By bookstore=By.xpath("//*[text()='Book Store Application']");
    By username= By.id("userName");
    By password=By.id("password");
    By loginbtn=By.id("login");
    FunctionCaller caller=new FunctionCaller();

    public void launchUrl(){
        driver.get(url);
    }
    public void enterUsername(String username) {
        driver.findElement(this.username).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(this.password).sendKeys(password);
    }

    public void clickLoginbtn() {
        caller.clickOnElementByJS(loginbtn);
    }

    public void clickBookstore() {
        caller.clickOnElementByJS(bookstore);
    }
}
