package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = ".//Features/FlipkartJeansSteps.feature",
    glue = {"stepDefinitions", "hooks"},
    plugin = {"pretty", "html:target/cucumber-reports/flipkart.html"},
    monochrome = true
)

public class FlipkartRunner {

}
