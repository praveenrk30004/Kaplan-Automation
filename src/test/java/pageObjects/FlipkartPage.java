package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;

import java.time.Duration;

public class FlipkartPage {
	

	 public static WebElement fashionMenu() {
	        return BaseClass.driver.findElement(By.xpath("//span[text()='Fashion']"));
	    }

	    public static WebElement kidsSubMenu() {
	        return BaseClass.driver.findElement(By.xpath("//a[text()='Kids']"));
	    }

	    public static WebElement jeansLink() {
	        return BaseClass.driver.findElement(By.linkText("Boys & Girls Jeans"));
	    }

	    public static WebElement lowToHighOption() {
	        return BaseClass.driver.findElement(By.xpath("//div[text()='Price -- Low to High']"));
	    }

	    public static WebElement firstItem() {
	        return BaseClass.driver.findElement(By.xpath("//a[@title='Girls Regular Mid Rise Blue Jeans']"));
	    }

	    public static WebElement itemName() {

	    	WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(10));
	        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class, 'VU-ZEz')]")));
	    }

	    public static WebElement itemPrice() {
	    	 WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(10));
	         return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'Nx9bqj')]")));
	    }

	    public static WebElement sizeOption() {
	    	WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(10));
	    	 return BaseClass.driver.findElement(By.xpath("//a[normalize-space()='7 - 8 Years']"));
	    }

	    public static WebElement addToCartButton() {
	    	WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(10));
	        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space(.)='Add to cart']")));
	    }

	    public static WebElement cartItemName() {
	    	 WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(10));
	    	    return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Thekids')]")));
	    }
	    
	    public static WebElement cartItemPrice() {
	    	WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(10));
	    	 return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'₹279')]")));

	    }
	    
	    
	    public static void waitForProductPageToLoad() {
	        WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.urlContains("/p/"));
	    }
}
