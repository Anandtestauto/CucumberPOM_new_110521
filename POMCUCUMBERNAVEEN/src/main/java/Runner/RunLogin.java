package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@SuppressWarnings("deprecation")
@CucumberOptions(features= {"src/main/java/features/F01_Login.feature"},
                 glue= {"step","hooks"},
                 monochrome =true,
                 //tags= {"@smoke"},  //  to execute tag name with regression
               // tags= {"@smoke,@functional"},  //  to execute tag name with smoke or regression
                //tags= {"@smoke","@functional"}, //  to execute tag name with smoke and regression
                //tags= {"~@smoke"}, // to execute except smoke testcase
                // plugin= {"pretty","html:reports"}, // to generate reports in folder and in console
               // plugin= {"pretty","json:target/MyReports/Report.json"}, // to generate json reports in folder and in console
                // plugin="pretty","com.aventstack.extentreports.cucumber.adaper.ExtentCucumberAdapter:",
                plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                 dryRun=false, // to map between feature and step defnition
                 snippets = SnippetType.CAMELCASE)
public class RunLogin extends AbstractTestNGCucumberTests {

}
 