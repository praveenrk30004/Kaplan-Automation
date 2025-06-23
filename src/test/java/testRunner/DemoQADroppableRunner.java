package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = ".//Features/DemoQADroppable.feature",
    glue = {"stepDefinitions", "hooks"},
    plugin = {"pretty", "html:target/cucumber-reports/droppable.html"},
    monochrome = true
)

public class DemoQADroppableRunner {

}
