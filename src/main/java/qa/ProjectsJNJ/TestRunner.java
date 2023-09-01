package qa.ProjectsJNJ;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="C:\\Users\\admin\\Desktop\\end to end\\ProjectsJNJ\\Features",
		glue="stepDefinitions",
		dryRun=true,
		monochrome=true,
		plugin= {"pretty","json:target/cucumber1.json"})


public class TestRunner extends AbstractTestNGCucumberTests {

}
