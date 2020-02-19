package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//comment//
@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/sw176/git/CucumberMevenProject/CucumberMevenProject/features/MyAttendanc.feature", glue={"stepDefinition"})
public class TestRunner 
{

}

