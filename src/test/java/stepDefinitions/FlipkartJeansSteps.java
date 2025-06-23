package stepDefinitions;

import base.BaseClass;
import io.cucumber.java.en.*;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageObjects.FlipkartPage;

public class FlipkartJeansSteps {

	 WebDriver driver = BaseClass.driver;
	    String selectedItemName;
	    String selectedItemPrice;

	    @Given("I launch Flipkart website")
	    public void launch_flipkart() {
	        driver.get("https://www.flipkart.com/");
	    }

	    @When("I hover over Fashion > Kids > Boys & Girls Jeans")
	    public void hover_fashion_kids_jeans() throws InterruptedException {
	        Actions actions = new Actions(driver);
	        actions.moveToElement(FlipkartPage.fashionMenu()).perform();
	        Thread.sleep(1000);
	        actions.moveToElement(FlipkartPage.kidsSubMenu()).perform();
	        Thread.sleep(1000);
	        FlipkartPage.jeansLink().click();
	    }

	    @When("I sort by Price Low to High")
	    public void sort_low_to_high() throws InterruptedException {
	      //  FlipkartPage.sortByDropdown().click();
	        FlipkartPage.lowToHighOption().click();
	        Thread.sleep(2000);
	    }

	    @When("I select a jeans item")
	    public void select_item() throws InterruptedException {
	        FlipkartPage.firstItem().click();
	        
	        for (String windowHandle : BaseClass.driver.getWindowHandles()) {
	            BaseClass.driver.switchTo().window(windowHandle);
	        }

	        FlipkartPage.waitForProductPageToLoad();
	    }

	    @When("I fetch item name and price")
	    public void fetch_item_details() {
	    	String name = FlipkartPage.itemName().getText();
	        String price = FlipkartPage.itemPrice().getText();

	        System.out.println("Item Name: " + name);
	        System.out.println("Item Price: " + price);
	    }

	    @When("I add item to cart")
	    public void add_to_cart() throws InterruptedException {
	    	Thread.sleep(3000);
	        FlipkartPage.sizeOption().click();
	        WebElement addToCartBtn = FlipkartPage.addToCartButton();
	        ((JavascriptExecutor) BaseClass.driver).executeScript("arguments[0].scrollIntoView(true);", addToCartBtn);
	        ((JavascriptExecutor) BaseClass.driver).executeScript("arguments[0].click();", addToCartBtn);

	    }

	    @Then("Item details in checkout match")
	    public void verify_checkout_details() throws InterruptedException {
	    	for (String handle : driver.getWindowHandles()) {
	    	    driver.switchTo().window(handle);
	    	}
	    	Thread.sleep(4000);
	    	
	    	String actualName = FlipkartPage.cartItemName().getText();
	    	String expectedName = FlipkartPage.itemName().getText();

	    	if (actualName != null && expectedName != null && actualName.contains(expectedName)) {
	    	    System.out.println("Item name matched.");
	    	} else {
	    	    System.out.println("Item name mismatch.");
	    	    System.out.println("Actual: " + actualName);
	    	    System.out.println("Expected: " + expectedName);
	    	}
	    	
	    	String actualPrice = FlipkartPage.cartItemPrice().getText();
	    	String expectedPrice = FlipkartPage.itemPrice().getText();

	    	if (actualPrice != null && expectedPrice != null && actualPrice.contains(expectedPrice)) {
	    	    System.out.println("Item name matched.");
	    	} else {
	    	    System.out.println("Item name mismatch.");
	    	    System.out.println("Actual: " + actualPrice);
	    	    System.out.println("Expected: " + expectedPrice);
	    	}
	    }
}
