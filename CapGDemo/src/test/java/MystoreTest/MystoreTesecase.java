package MystoreTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import MyStoreObject.Mystore;


public class MystoreTesecase {

	@Test
	public void myStore() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(2000);
		
		Mystore m=new Mystore(driver);
		m.signin().click();
		m.email().sendKeys("a9644822769@gmail.com");
		m.passwd().sendKeys("Aanchal");
		m.loginbtn().click();
		Thread.sleep(1000);
		m.women();
		Thread.sleep(1000);
		m.tshirt().click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)","");
		Thread.sleep(1000);
		
		m.selectT();
		m.more().click();
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,350)","");
		Thread.sleep(1000);
		
		m.plus().click();
		Thread.sleep(1000);
		m.selectsize();
		m.color().click();
		m.cart().click();
		m.checkout().click();
		Thread.sleep(1000);
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,550)","");
		Thread.sleep(1000);
		
		m.checkout2().click();
		Thread.sleep(1000);
		
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,550)","");
		Thread.sleep(1000);
		
		m.checkout3().click();
		Thread.sleep(1000);
		
		m.checkbox().click();
		Thread.sleep(1000);
		
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,550)","");
		Thread.sleep(1000);
		
		m.checkout4().click();
		Thread.sleep(1000);
		
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollBy(0,550)","");
		Thread.sleep(1000);
		
		m.pay().click();
		Thread.sleep(1000);
		
		m.order();
		
		
		
	}
	
}
