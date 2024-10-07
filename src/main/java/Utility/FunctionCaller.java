package Utility;

import BaseClass.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FunctionCaller extends TestBase{

    public static WebDriver driver = getDriver();
    static JavascriptExecutor jse = (JavascriptExecutor) driver;
    public static String sheetName;
    public static int rowNum;
    ExcelHelper helper = new ExcelHelper(ConfigReader.testDataPath);

    public static void loadExcelParameter(String sheet, int row){
        sheetName=sheet;
        rowNum=row;
    }

    public void waitUntillElementVisible(By element){
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(element));
    }
    public void scrollTillElement (By element){
        waitUntillElementVisible(element);
        jse.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(element));
    }

    public void clickOnElementByJS (By element){
        scrollTillElement(element);
        jse.executeScript("arguments[0].click()", driver.findElement(element));
    }

    public void clickOnWebElement(By webElement){
        scrollTillElement(webElement);
        driver.findElement(webElement).click();
    }

    public void enterDataFromExcel(By element, String colName){
        scrollTillElement(element);
        String value = helper.getCellData(sheetName, colName,rowNum);
        driver.findElement(element).sendKeys(value);
    }

}
