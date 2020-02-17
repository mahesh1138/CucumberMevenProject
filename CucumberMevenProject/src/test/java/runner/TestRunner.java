package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={".//features/MyAttendanc.feature"},	// C:\\Users\\sw138\\git\\CucumberMevenProject\\CucumberMevenProject
					glue={"stepDefinition"}, 					// ".//features/Myattendanc.fature"	
					dryRun=false,								//if make it true: cross checking every feature has steps
					monochrome=true,							//remove unneceessay character from console.
					strict=true,
					plugin={"pretty", "html:target/cucumber-html-report", "json:target/cucumber-reports/cucumber.json"}      			//Generate Html Report and plugin={"html:test-output"}    
					//tags={"@sanity, @segression"}  			OR //To run specific scenarion under steps definitions
					//tags={"@sanity", "@segression"}  			AND //To run both santiy and regression test
)
public class TestRunner 
{

}







/* dryRun=true:dryrun true means, it will not execute, it will immedeately check mapping between feature file and step definition, For every step atleast one step definition or not. (it will help when n no of steps)
	once everyting is fine, you can make it has false and execute.

features: Path of the feature file, where you feature file is avaiaoble

glue: path of the step definition file

monochrome=true: display the output in readable format, it remove unneceessay character from console.

format/plugin={"pretty", "html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}

strict=true and if make dryRun=false: it will fail execution if there are any pending/undefine steps are there, (step definition pending like some snippet is missing)

tags:
*/