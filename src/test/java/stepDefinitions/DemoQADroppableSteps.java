package stepDefinitions;

import base.BaseClass;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import pageObjects.DemoQADroppablePage;

public class DemoQADroppableSteps {

	 @Given("I open the DemoQA droppable page")
	    public void open_demoqa_droppable_page() {
	        BaseClass.driver.get("https://demoqa.com/droppable");
	    }

	    @When("I drop Not Acceptable item into Drop Here box")
	    public void drop_not_acceptable_item() {
	        DemoQADroppablePage.clickAcceptTab();
	        Actions actions = new Actions(BaseClass.driver);
	        actions.dragAndDrop(DemoQADroppablePage.notAcceptable(), DemoQADroppablePage.dropHereBox()).perform();
	    }

	    @Then("It should not be accepted")
	    public void verify_drop_not_accepted() {
	        String text = DemoQADroppablePage.dropHereBox().getText();
	        System.out.println("Drop Box Text After Drop: " + text);
	    }
}
