package stepDef2;


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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//@RunWith(Cucumber.class)
public class OrangeHRM{

	WebDriver driver;

	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@When("^title of login page is OrangeHRM")
	public void title_of_login_page_is_OrangeHRM() throws Throwable {
		String title = driver.getTitle();
		Assert.assertEquals("OrangeHRM", title);
		System.out.println("Execution completed with PASS");       

	}    
	@Then("^user enters (.+) and (.+)$")
	public void user_enters_something_and_something(String username, String password) throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);  

		// throw new PendingException();
	}
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.name("Submit")).click();
	}

	@Then("^user clicks on logout button$")
	public void user_clicks_on_logout_button() throws Throwable {
		driver.findElement(By.id("welcome")).sendKeys(Keys.ARROW_DOWN.ARROW_DOWN.ARROW_DOWN.ENTER);
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	}
}

