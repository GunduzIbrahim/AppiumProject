package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/default-cucumber-reports"},
        features="src/test/resources",
        glue = "stepdefinitions",
        tags = "@toast",
        dryRun = false
)
public class Runner {}
