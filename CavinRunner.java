package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/Loginn.feature", glue="steps/Loginn", monochrome=true, publish=true, tags="@Smoke")
public class CavinRunner extends AbstractTestNGCucumberTests {

}
