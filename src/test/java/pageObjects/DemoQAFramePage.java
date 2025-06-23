package pageObjects;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class DemoQAFramePage {

	public static void switchToParentFrame() {
        BaseClass.driver.switchTo().frame("frame1");
    }

    public static void switchToChildFrame() {
        BaseClass.driver.switchTo().frame(0);
    }

    public static WebElement childTextElement() {
        return BaseClass.driver.findElement(By.tagName("p"));
    }

    public static void switchToDefault() {
        BaseClass.driver.switchTo().defaultContent();
    }
    
}
