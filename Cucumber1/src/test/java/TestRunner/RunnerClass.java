package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\S2605\\GIT_HUB\\SFL_TESTING\\Cucumber1\\src\\test\\resources",
        glue = "stepDefinition",
        dryRun = false, plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class RunnerClass {

}
