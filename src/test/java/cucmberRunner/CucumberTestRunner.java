package cucmberRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber/CucumberTestRunner.html", "json:target/cucumber/CucumberTestRunner.json"},
        monochrome = true,
        tags = "@smoke",
        glue = "steps",
        features = "src/test/resources/Amazon/BookName.feature")
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
}