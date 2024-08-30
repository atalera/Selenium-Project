package CapG.CapGDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GRIDTest1 {

		public static void main(String args[]) throws MalformedURLException, InterruptedException
		{
			String url ="https://www.google.com";
			String node = "http://192.168.1.5:4444/wb/hub";
			
			DesiredCapabilities dc = DesiredCapabilities.chrome();
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (4)\\chromedriver.exe");
			
			dc.setPlatform(Platform.WINDOWS);
			dc.setBrowserName("chrome");
			RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.29.228:4456/wd/hub"),dc);

			driver.get("https://book.spicejet.com/search.aspx");
			//driver.navigate().to("https://dlogixconsulting.cm/about-us");
			System.out.println(driver.getTitle());
			Thread.sleep(5000);  
			
			//System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (4)\\chromedriver.exe");
			//ChromeOptions dc =  new ChromeOptions();
			//dc.setPageLoadStrategy(PageLoadStrategy.NORMAL);	
			//RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.29.228:4456/wd/hub"),dc);
			/*driver.get("https://www.google.com/");
			driver.navigate().to("https://dlogixconsulting.com/about-us");
			System.out.println(driver.getTitle());  */
			
			/*driver.get("https://www.lambdatest.com/blog/selenium-grid-setup-tutorial/");
			System.out.println(driver.getTitle()); */
			
			//driver.get("https://book.spicejet.com/search.aspx");
		//	driver.navigate().to("https://dlogixconsulting.cm/about-us");
			//System.out.println(driver.getTitle());
			
		}

	}


