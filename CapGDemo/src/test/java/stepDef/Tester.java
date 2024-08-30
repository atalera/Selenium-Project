package stepDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tester {
	
	@Given("^I am a manual tester$")
	public void I_am_a_manual_tester()
	{
		System.out.println("@Given -- I am a manual tester");
	}

	@When("^I apply for a job$")
	public void I_apply_for_a_job()
	{
		System.out.println("@When -- I apply for a job");
	}
	@Then("^I got less paid job$")
	public void I_got_less_paid_job()
	{
		System.out.println("@Then -- I got less paid job");
	}

	@And("^I am not satisfied with my salary$")
	public void I_am_not_satisfied_with_my_salary()
	{
		System.out.println("@And -- I am not satisfied with my salary");
	}

	@But("^my parents are still satisfied$")
	public void my_parents_are_still_satisfied()
	{
		System.out.println("@But -- my parents are still satisfied");
	}

	@Given("^I am a Automation tester$")
	public void i_am_a_Automation_tester() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("@Given -- I am a Automation tester");
	}
	@Then("^I got hihgly paid job$")
	public void i_got_hihgly_paid_job() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("@Then -- I got hihgly paid job");
	}
	@And("^I am satisfied with my salary$")
	public void i_am_satisfied_with_my_salary() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("@And -- I am satisfied with my salary");
	}
	@But("^my parents are highly satisfied$")
	public void my_parents_are_highly_satisfied() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("@But -- my parents are highly satisfied");
	}
}

