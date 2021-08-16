package swag_labs;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "swag_labs/steps",
        tags = "@test",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerTest {
}
