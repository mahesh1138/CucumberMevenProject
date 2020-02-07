package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//features/MyAttendanc.feature", 
					glue={"stepDefinition"}, 					// ".//features/Myattendanc.fature"	
					dryRun=false,								//cross checking every feature has steps
					monochrome=true,							//remove unneceessay character from console.
					plugin={"html:test-output"}      			//Generate Html Report
					//tags={"@sanity, @segression"}  			OR //To run specific scenarion under steps definitions
					//tags={"@sanity", "@segression"}  			AND //To run both santiy and regression test
)
public class TestRunner 
{

}

