package guru99Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import guru99Object.Guru99Login;

public class Guru99LoginTest {

	@Test
	public void login() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/V4/index.php");
		Thread.sleep(2000);
		
		//guru99 login page instance
		Guru99Login gl=new Guru99Login(driver);
		
		gl.userid().sendKeys("mngr356065");
		gl.passwrd().sendKeys("mAgYnEg");
		Thread.sleep(2000);
		gl.logn().click();
		System.out.println(gl.managerId().getText());
		Thread.sleep(2000);
		gl.logt().click();
		
	}
}
