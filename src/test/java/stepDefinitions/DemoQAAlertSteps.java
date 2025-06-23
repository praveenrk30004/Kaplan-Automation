package stepDefinitions;

import base.BaseClass;
import io.cucumber.java.en.*;
import pageObjects.DemoQAAlertsPage;

public class DemoQAAlertSteps {

	@Given("I open the DemoQA alerts page")
    public void open_demoqa_alerts_page() {
        BaseClass.driver.get("https://demoqa.com/alerts");
    }

    @When("I handle all types of alerts")
    public void handle_all_alerts() throws InterruptedException {
    	DemoQAAlertsPage.clickAlertButtonJS();
    	BaseClass.driver.switchTo().alert().accept();

        DemoQAAlertsPage.timerAlertButton().click();
        Thread.sleep(6000);
        BaseClass.driver.switchTo().alert().accept();

        DemoQAAlertsPage.confirmButton().click();
        BaseClass.driver.switchTo().alert().dismiss();

        DemoQAAlertsPage.promptButton().click();
        BaseClass.driver.switchTo().alert().sendKeys("Test");
        BaseClass.driver.switchTo().alert().accept();
    }

    @Then("All alerts are handled successfully")
    public void alerts_handled_successfully() {
        System.out.println("All alerts handled successfully.");
    }
}
