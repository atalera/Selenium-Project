package stepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

public class Tester1 {

	@Given("^I am out shopping And I have eggs$")
    public void i_am_out_shopping_and_i_have_eggs() throws Throwable {
		System.out.println("@Given");
       // throw new PendingException();
    }

    @When("^I check my shopping list$")
    public void I_check_my_shopping_list() throws Throwable {
       System.out.println("@When");
    	//throw new PendingException();
    }

    @Then("^I should not have anything left$")
    public void I_should_not_have_anything_left() throws Throwable {
    	System.out.println("@Then");
        //throw new PendingException();
    }

    @And("^I have milk$")
    public void i_have_milk() throws Throwable {
    	System.out.println("@And");
        //throw new PendingException();
    }

    @And("^I have butter$")
    public void i_have_butter() throws Throwable {
    	System.out.println("@And");
        //throw new PendingException();
	}
	
	
}
