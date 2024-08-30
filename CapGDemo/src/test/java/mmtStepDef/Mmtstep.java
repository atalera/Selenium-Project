package mmtStepDef;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

//@RunWith(Cucumber.class)
public class Mmtstep {

	WebDriver driver;
	
	@Given("^user is on MMT home page\\.$")
    public void user_is_on_mmt_home_page() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
    }

    @Then("^user login and search for Andaman in activities\\.$")
    public void user_search_for_andaman_in_activities() throws Throwable {
    	//driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[3]/div[1]/div[2]")).click();
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("yashshirke102@gmail.com");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[contains(@class,'capText font16')]")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Shirkeyash@102");
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[@class='capText font16']")).click(); 
		//Thread.sleep(2000);
	/*	driver.findElement(By.xpath("//div[2]//div[1]//div[1]//nav[1]//ul[1]//li[10]//a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='activitySearch']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Andaman");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@class='appendBottom5 suggestionTxt'][normalize-space()='Andaman']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='search_button']")).click();
		Thread.sleep(2000);*/
    	
    	driver.findElement(By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']")).click();
    	driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chActivities']")).click();
    	driver.findElement(By.xpath("//input[@id='activitySearch']")).click();
    	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Andaman");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//p[@class='appendBottom5 suggestionTxt'][normalize-space()='Andaman']")).click();
    	driver.findElement(By.xpath("//button[@id='search_button']")).click();
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[2]/div[2]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]/figure[1]/span[1]/img[1]")).click();
		Thread.sleep(1000);
    }

   

    @And("^user select desired cruise\\.$")
    public void user_select_desired_cruise() throws Throwable {
    	//driver.findElement(By.className("card2-title")).click();
		//Thread.sleep(1000);
		
		String parentWindow = driver.getWindowHandle();{
			for (String childWindowHandle : driver.getWindowHandles()) {
				if(!childWindowHandle.equalsIgnoreCase(parentWindow)){
					driver.switchTo().window(childWindowHandle);
					
					for (int i =0; i<4; i++) {
						driver.findElement(By.xpath("//body/div[@id='root']/div/div[@class='container flex-row page-content']/div[@class='details-left-wrapper']/div[@class='detail-media-carousel-wrapper flex-row']/div[@class='detail-media-carousel']/div[@class='slick-slider slick-initialized']/div[3]//*[name()='svg']")).click();
						Thread.sleep(2000);
					}
					//package selection
					driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/a[6]")).click();
					Thread.sleep(1000);
					
					for (int i =0; i<1; i++) {
						driver.findElement(By.xpath("//button[normalize-space()='+']")).click();
					}
					Thread.sleep(2000);
					
					driver.findElement(By.xpath("//button[normalize-space()='BOOK NOW']")).click();
					Thread.sleep(2000);					
				}
			}
		}
    }
    
    @Then("^user will select appropriate package\\.$")
    public void user_will_select_appropriate_package() throws Throwable {
    
    	//package selection
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/a[6]")).click();
		Thread.sleep(1000);
		
		for (int i =0; i<1; i++) {
			driver.findElement(By.xpath("//button[normalize-space()='+']")).click();
		}
		Thread.sleep(2000);
		
		
    }
    

    @And("^book it by giving relevant details\\.$")
    public void book_it_by_giving_relevant_details() throws Throwable {
    	driver.findElement(By.xpath("//button[normalize-space()='BOOK NOW']")).click();
		Thread.sleep(2000);	
		
		
    }

}
