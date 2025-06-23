package pageObjects;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class DemoQADroppablePage {

	 public static WebElement acceptTab() {
	        return BaseClass.driver.findElement(By.id("droppableExample-tab-accept"));
	    }
	 
	 public static void clickAcceptTab() {
	        WebElement element = acceptTab();
	        ((JavascriptExecutor) BaseClass.driver).executeScript("arguments[0].scrollIntoView(true);", element);
	        ((JavascriptExecutor) BaseClass.driver).executeScript("arguments[0].click();", element);
	    }

	 public static WebElement notAcceptable() {
	        return BaseClass.driver.findElement(By.id("notAcceptable"));
	    }

	 public static WebElement dropHereBox() {
	        return BaseClass.driver.findElement(By.cssSelector("#acceptDropContainer #droppable"));
	    }
}
