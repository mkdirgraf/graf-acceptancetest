package frontenddemo.features.practicepagedemo.automation.ui;






import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/practice", "json:target/reports/practice"},
        features = "src/test/resources/frontenddemo/features/seleniumPracticePage/automation/ui/VerifyHomePage.feature",
        glue = "frontenddemo/features/practicepagedemo/automation/ui",
        tags = "@auto",
        dryRun = true
)
public class PracticePageDemoTests {
}
