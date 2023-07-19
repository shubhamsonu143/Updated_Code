package RunnerPac;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", 
glue = "com.demo.Cucuc",tags= "@sanityTest", 
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
monochrome=false,dryRun=false)
public class RunnerClass {

}
		