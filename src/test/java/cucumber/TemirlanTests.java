package cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/tima.html", "json:target/reports/tima.json"},
        features = "",
        glue = {"common:path", "common:"},
        tags = "@auto",
        dryRun = true

)
public class TemirlanTests {
}
