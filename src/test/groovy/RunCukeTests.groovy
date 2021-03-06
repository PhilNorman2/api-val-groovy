import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    format=["pretty", "html:build/reports/cucumber"],
    strict=true,
    features=["features"],
    glue=["src/test/steps"]
)
public class RunCukesTest { }
