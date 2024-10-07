package Pages;

import BaseClass.TestBase;
import Utility.FunctionCaller;
import org.openqa.selenium.By;

public class TestBoxSubmitPage extends TestBase {

    By elements=By.xpath("//div[@class='card mt-4 top-card'][1]");
    By textBox=By.xpath("//span[text()='Text Box']");
    By userName = By.id("userName");
    By userEmail = By.id("userEmail");
    By currentAddress = By.id("currentAddress");
    By permanentAddress = By.id("permanentAddress");
    By submit = By.id("submit");

    FunctionCaller caller = new FunctionCaller();

    public void clickOnElements() {
       caller.clickOnWebElement(elements);
    }

    public void clickOnTextBox() {
        caller.clickOnWebElement(textBox);
    }

    public void enterUserName(String column){
       caller.enterDataFromExcel(userName, column);
    }

    public void enteruserEmail(String column){
        caller.enterDataFromExcel(userEmail, column);
    }

    public void entercurrentAddress(String column){
        caller.enterDataFromExcel(currentAddress, column);
    }

    public void enterpermanentAddress(String column){
        caller.enterDataFromExcel(permanentAddress, column);
    }

    public void clickOnSubmit() {
        caller.clickOnWebElement(submit);
    }

}
