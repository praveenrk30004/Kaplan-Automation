package stepDefinitions;


import base.BaseClass;
import io.cucumber.java.en.*;
import pageObjects.DemoQABrowserWindowPage;

import java.util.Set;

public class DemoQABrowserWindowSteps {

	String mainWindow;

    @Given("I open the DemoQA browser windows page")
    public void open_demoqa_browser_windows() {
        BaseClass.driver.get("https://demoqa.com/browser-windows");
    }

    @When("I click on New Window button")
    public void click_new_window_button() {
        mainWindow = BaseClass.driver.getWindowHandle();
        DemoQABrowserWindowPage.clickNewWindowButtonJS();
    }

    @Then("I verify the text in new window and close it")
    public void verify_text_and_close_new_window() {
        Set<String> handles = BaseClass.driver.getWindowHandles();
        for (String handle : handles) {
            if (!handle.equals(mainWindow)) {
                BaseClass.driver.switchTo().window(handle);
                String text = DemoQABrowserWindowPage.newWindowText().getText();
                System.out.println("New Window Text: " + text);
                BaseClass.driver.close();
            }
        }
        BaseClass.driver.switchTo().window(mainWindow);
    }
}
