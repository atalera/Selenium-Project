package CapG.CapGDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGuru99 {

	public static void main(String agrs[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/index.php");
		driver.manage().window().maximize();

		//username
		driver.findElementByName("uid").sendKeys("mngr356065");

		//password
		driver.findElementByName("password").sendKeys("mAgYnEg");
		Thread.sleep(2000);
		//login button
		driver.findElementByName("btnLogin").click();

		//manager Id
		WebElement w1=driver.findElementByXPath("//td[contains(text(),'Manger Id : mngr356065')]");
		System.out.println(w1.getText());
		Thread.sleep(2000);

		driver.findElementByXPath("//a[contains(text(),'Log out')]").click();
	}

}
