package testRunner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    FlipkartRunner.class,
    DemoQAChildFrameRunner.class,
    DemoQAAlertsRunner.class,
    DemoQADroppableRunner.class,
    DemoQABrowserWindowRunner.class
})

public class OrderedTestSuite {

	
}
