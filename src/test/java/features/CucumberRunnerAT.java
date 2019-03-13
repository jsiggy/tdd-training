package features;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, plugin = {"pretty", "html:target/cucumber", "rerun:target/rerun.txt", "json:target/cucumber.json" }, snippets = SnippetType.CAMELCASE)
public class CucumberRunnerAT {
}
