package RunnerFile;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Resources/FeatureFiles",
        glue = {"StepDefination"},
        plugin = { "pretty", "html:target/cucumber-reports" },
        tags = "@Test",
        dryRun = false
)
public class TestRunner {
}
