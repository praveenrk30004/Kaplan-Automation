package pageObjects;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class DemoQAAlertsPage {

	public static WebElement alertButton() {
        return BaseClass.driver.findElement(By.id("alertButton"));
    }
	
	public static void clickAlertButtonJS() {
	    JavascriptExecutor js = (JavascriptExecutor) BaseClass.driver;
	    WebElement alertButton = alertButton();
	    
	    js.executeScript("arguments[0].scrollIntoView(true);", alertButton);
	    js.executeScript("arguments[0].click();", alertButton);
	}

    public static WebElement timerAlertButton() {
        return BaseClass.driver.findElement(By.id("timerAlertButton"));
    }

    public static WebElement confirmButton() {
        return BaseClass.driver.findElement(By.id("confirmButton"));
    }

    public static WebElement promptButton() {
        return BaseClass.driver.findElement(By.id("promtButton"));
    }
}
