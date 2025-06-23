package stepDefinitions;

import base.BaseClass;
import io.cucumber.java.en.*;
import pageObjects.DemoQAFramePage;

public class DemoQAChildFrameSteps {

	@Given("I open the DemoQA nested frames page")
    public void open_demoqa_nested_frames() {
        BaseClass.driver.get("https://demoqa.com/nestedframes");
    }

    @Then("I print the text from child iframe")
    public void print_text_from_child_iframe() {
        DemoQAFramePage.switchToParentFrame();
        DemoQAFramePage.switchToChildFrame();
        String text = DemoQAFramePage.childTextElement().getText();
        System.out.println("Child Iframe Text: " + text);
        DemoQAFramePage.switchToDefault();
    }
}
