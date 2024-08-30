package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import RediffObjectRepository.RediffHomePage;
import RediffObjectRepository.RediffLoginPage;

public class RediffLogin {

	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(2000);

		//Rediff login page instance
		RediffLoginPage redlog=new RediffLoginPage(driver);

		redlog.username().sendKeys("Candidate1");
		redlog.password().sendKeys("test123");

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		redlog.home().click();  //takes the user to home page

		RediffHomePage redhome=new RediffHomePage(driver);
		redhome.news().click();

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

	}


}

