package pageObjects;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class DemoQABrowserWindowPage {

	public static WebElement newWindowButton() {
        return BaseClass.driver.findElement(By.id("windowButton"));
    }
	
	public static void clickNewWindowButtonJS() {
	    JavascriptExecutor js = (JavascriptExecutor) BaseClass.driver;
	    WebElement button = newWindowButton();
        js.executeScript("arguments[0].scrollIntoView(true);", button);
        js.executeScript("arguments[0].click();", button);
	}


    public static WebElement newWindowText() {
        return BaseClass.driver.findElement(By.id("sampleHeading"));
    }
}
