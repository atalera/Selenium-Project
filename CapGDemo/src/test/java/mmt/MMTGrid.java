package mmt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;




public class MMTGrid {
	public static void main(String args[]) throws InterruptedException, IOException
	{
		String url ="https://www.google.com";
		String node = "http://192.168.29.228:4456/wd/hub";
		Properties prop;
		FileInputStream fis;
		
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		dc.setPlatform(Platform.WINDOWS);
		dc.setBrowserName("chrome");
       
		/*DesiredCapabilities dc = DesiredCapabilities.firefox();
		System.setProperty("webdriver.gecko.driver","F:\\Job\\capgemini\\Selenium\\Mozilla\\geckodriver.exe");
		dc.setPlatform(Platform.WINDOWS);
		dc.setBrowserName("firefox");*/
		
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.29.228:4456/wd/hub"), dc);
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		prop = new Properties();
		fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\CapGDemo\\mmt.properties");
		prop.load(fis);
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[3]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(prop.getProperty("emailLogin"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'capText font16')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(prop.getProperty("password"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='capText font16']")).click(); 
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[2]//div[1]//div[1]//nav[1]//ul[1]//li[10]//a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='activitySearch']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(prop.getProperty("place"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@class='appendBottom5 suggestionTxt'][normalize-space()='Andaman']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='search_button']")).click();
		Thread.sleep(2000);
		//scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[1]//ul[1]//li[5]//a[1]//div[1]")).click();
		Thread.sleep(2000);
		//scroll down
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='root']/div/section[@class='container']/div[@class='section-container']/section[@class='section-right']/div[@class='product-list']/div[@class='infinite-scroll-component__outerdiv']/div[@class='infinite-scroll-component ']/a[2]/div[1]")).click();
		Thread.sleep(1000);
		
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


	//booking credentials
			driver.findElement(By.xpath("//select[@class='review-customer-input']")).sendKeys(prop.getProperty("mr"));
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='Enter first name']")).sendKeys(prop.getProperty("firstName"));
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='Enter last name']")).sendKeys(prop.getProperty("lastName"));
			Thread.sleep(1000);
			
			//scroll down
			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("window.scrollBy(0,250)", "");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[normalize-space()='Proceed to payments']")).click();
			Thread.sleep(2000);
			
			//passenger 1
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/input[1]")).sendKeys(prop.getProperty("fullName1"));
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/input[1]")).sendKeys(prop.getProperty("age1"));
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[1]")).click();
			Thread.sleep(1000);
			
			//pasenger 2
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/input[1]")).sendKeys(prop.getProperty("fullName2"));
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/input[1]")).sendKeys(prop.getProperty("age2"));
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[5]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[1]")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[@class='dynamic-form-proceed-button']")).click();	
			Thread.sleep(6000);
		

		/*driver.get("https://experiences.makemytrip.com/activities/landing?cityId=49");
		//Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//p[normalize-space()='Water Sports']")).click();
		Thread.sleep(2000);
		 WebElement radio1 = driver.findElement(By.xpath("(//input[@value='Water Sports'])[1]"));
		 radio1.click();	
		 Thread.sleep(2000);
		 WebElement option1 = driver.findElement(By.xpath("(//input[@value='Best Water Sports in Andamans'])[1]"));
		 option1.click();
		 Thread.sleep(2000);
		 WebElement o1 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/section[2]/div[2]/section[2]/div[2]/div[1]/div[1]/a[1]/div[1]"));
		 o1.click();
		 Thread.sleep(2000);
		 
		//Get the parent window handle and store it in a variable for future use

		 String parentWindow = driver.getWindowHandle();

		 //Iterate through the collection of all available window handles

		 for (String childWindowHandle : driver.getWindowHandles()) {

		 //Ignore which handle is equal to the parent handle

		 if(!childWindowHandle.equalsIgnoreCase(parentWindow)){

		 //Switch to the child window handle

		 driver.switchTo().window(childWindowHandle);

		 //Perform required operations on the current child window....

		 //Switch back to the parent handle

		 //driver.switchTo().window(parentWindow);
		 Thread.sleep(2000);
		 WebElement o = driver.findElement(By.xpath("(//button[normalize-space()='SELECT PACKAGE'])[1]"));
		 o.click();*/
		 

		 }
	 }

		 
//}

//}	