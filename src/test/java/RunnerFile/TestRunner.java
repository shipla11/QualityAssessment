package RunnerFile;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Resources/FeatureFiles",
        glue = {"StepDefination"},
        plugin = {"pretty"},
        tags = "@Test",
        dryRun = false
)
public class TestRunner {
}
