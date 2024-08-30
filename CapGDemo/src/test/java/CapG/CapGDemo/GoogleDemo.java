package CapG.CapGDemo;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		
		List<WebElement> links = driver.findElementsByTagName("a");
		int total = links.size();
		System.out.println("Total number of links "+total);
		for(int i=0;i<total;i++)
		{
			System.out.println(links.get(i).getAttribute("href"));
		}

	}
	

}
