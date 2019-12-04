package Test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/Cliente.feature",
glue = { "" }, monochrome = true, dryRun = false)

public class comprarTest extends BaseTest {
	
}
