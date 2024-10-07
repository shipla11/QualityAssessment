package Pages;

import BaseClass.TestBase;
import Utility.FunctionCaller;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class ButtonsPage extends TestBase {

    By buttons=By.xpath("//span[text()='Buttons']");
    By doubleClick=By.id("doubleClickBtn");
    By rightClick=By.id("rightClickBtn");
    By dynamicClick = By.xpath("//button[text()='Click Me']");
    By doubleClickMessage = By.id("doubleClickMessage");
    By rightClickMessage = By.id("rightClickMessage");
    By dynamicClickMessage = By.id("dynamicClickMessage");

    FunctionCaller caller = new FunctionCaller();
    Actions actions = new Actions(driver);

    public void clickOnButtons() {
        caller.clickOnWebElement(buttons);
    }
    public void doubleClickOnButton() {
        caller.scrollTillElement(doubleClick);
        actions.doubleClick(driver.findElement(doubleClick)).build().perform();
    }

    public void rightClickOnButton() {
        caller.scrollTillElement(rightClick);
        actions.contextClick(driver.findElement(rightClick)).perform();
    }

    public void dynamicClickOnButton() {
        caller.scrollTillElement(dynamicClick);
        caller.clickOnWebElement(dynamicClick);
    }

    public String getDoubleClickMessage(){
        return driver.findElement(doubleClickMessage).getText();
    }

    public String getRightClickMessage(){
        return driver.findElement(rightClickMessage).getText();
    }

    public String getDynamicClickMessage(){
        return driver.findElement(dynamicClickMessage).getText();
    }
}
