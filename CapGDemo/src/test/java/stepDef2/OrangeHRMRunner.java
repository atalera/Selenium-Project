package stepDef2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\HP\\eclipse-workspace\\CapGDemo\\src\\test\\java\\feature2\\OrangeHRM.feature",
		glue= {"stepDef2"}
		
		)
public class OrangeHRMRunner {

}
