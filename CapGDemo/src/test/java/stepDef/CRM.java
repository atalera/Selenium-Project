package stepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import java.util.concurrent.TimeUnit;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//@RunWith(Cucumber.class)
public class CRM{
	
	WebDriver driver;
	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://freecrm.com/");
	}
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_free_crm() throws Throwable {
		String title = driver.getTitle();
		Assert.assertEquals("#1 Free CRM customer relationship management software cloud", title);
		System.out.println("Execution completed with PASS");       

	}    
	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_something_and_something(String username, String password) throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".icon.icon-xs.mdi-chart-bar")).click();
		driver.findElement(By.name("email")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");       

	}
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.cssSelector(".ui.fluid.large.blue.submit.button")).click();
	}
}
