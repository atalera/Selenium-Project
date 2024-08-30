package stepDef;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\HP\\eclipse-workspace\\CapGDemo\\src\\test\\java\\Feature\\tester1.feature",
		glue= {"stepDef"}	
		
		)

public class Tester1Runner {

}
