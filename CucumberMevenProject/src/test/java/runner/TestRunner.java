package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={".//features/MyAttendanc.feature"},	// C:\\Users\\sw138\\git\\CucumberMevenProject\\CucumberMevenProject
					glue={"stepDefinition"})
public class TestRunner 
{
	//Test GitHub commit is working
}
