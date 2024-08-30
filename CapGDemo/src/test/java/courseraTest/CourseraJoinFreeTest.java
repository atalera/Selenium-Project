package courseraTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import RediffObjectRepository.RediffHomePage;
import RediffObjectRepository.RediffLoginPage;
import courseraObject.CourseraJoinFree;
import courseraObject.CourseraSearch;


public class CourseraJoinFreeTest{

	@Test(priority=0)
	public void joinBtn() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("https://www.coursera.org/in");
		//Thread.sleep(2000);

		CourseraSearch cs=new CourseraSearch(driver);

		System.out.println(driver.getTitle());

		cs.search().sendKeys("Automation");
		Thread.sleep(1000);
		cs.sign().click();
		Thread.sleep(1000);
		cs.course().click();
		
	}

	@Test(priority=1)
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		CourseraSearch cs=new CourseraSearch(driver);

		driver.get("https://www.coursera.org/professional-certificates/google-it-automation");
		cs.enroll();

		cs.fullname().sendKeys("Aanchal Talera");
		cs.email().sendKeys("taleraaanchal@gmail.com");
		cs.password().sendKeys("Aanchal@123");
		cs.joinbtn().click();
		

	}

}




