package mmt;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class MMTTest {

	@Test
	public void login() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		
		MMTObject m =new MMTObject(driver);
		Thread.sleep(2000);
		m.login().click();
		m.activities().click();
		m.search().click();
		m.text().sendKeys("Andaman");
		Thread.sleep(1000);
		m.selectAndaman().click();
		m.button().click();
		m.cruise().click();
		Thread.sleep(2000);
		m.port().click();
		
		//child window
		String parentWindow = driver.getWindowHandle();{
		for (String childWindowHandle : driver.getWindowHandles()) {
			if(!childWindowHandle.equalsIgnoreCase(parentWindow)){
				driver.switchTo().window(childWindowHandle);
				for (int i =0; i<3; i++) {
					m.swipe().click();
					Thread.sleep(1000);
				}
				
				//package Selection
				m.pack().click();
				Thread.sleep(1000);
				
				for (int i =0; i<1; i++) {
					m.plus().click();
				}
				Thread.sleep(1000);
				
			    m.book().click();
				Thread.sleep(2000);
				m.title();
				Thread.sleep(1000);
				m.fname().sendKeys("Aanchal");
				Thread.sleep(1000);
				
				m.lname().sendKeys("Talera");
				Thread.sleep(1000);
				
				m.email().sendKeys("taleraaanchal@gmail.com");
				Thread.sleep(1000);
				
				m.phone().sendKeys("1234567890");
				Thread.sleep(1000);
				
				m.payment().click();
				Thread.sleep(2000);
				
				m.title1().click();
				Thread.sleep(1000);

				m.fullname1().sendKeys("Aanchal Talera");
				Thread.sleep(1000);
				
				m.age1().sendKeys("21");
				Thread.sleep(1000);
				
				m.gender1().click();
				Thread.sleep(1000);
				
				m.nationality1().click();
				Thread.sleep(1000);
				
				m.title2().click();
				Thread.sleep(1000);

				m.fullname2().sendKeys("Minnie");
				Thread.sleep(1000);
				
				m.age2().sendKeys("22");
				Thread.sleep(1000);
				
				m.gender2().click();
				Thread.sleep(1000);
				
				m.nationality2().click();
				Thread.sleep(1000);
				
				m.save().click();
				Thread.sleep(1000);
				
				m.screenshot();
			  }
			}
		}
	}
}
