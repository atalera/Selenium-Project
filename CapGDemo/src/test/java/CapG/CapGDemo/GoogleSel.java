package CapG.CapGDemo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	}
	
	@Test
	public void test() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.coursera.org/professional-certificates/google-it-automation?action=enroll");
	
	/*WebElement w1=*/driver.findElementByCssSelector("//input[@title='Search']").sendKeys("Selenium");
	//w1.sendKeys("Selenium");
	//w1.sendKeys(Keys.ARROW_DOWN.ARROW_DOWN.ENTER);
	driver.findElement(By.className("_mkj5xnr"));
	Thread.sleep(2000);
	
	}

}
