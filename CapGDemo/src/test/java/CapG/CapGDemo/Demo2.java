package CapG.CapGDemo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//System.out.println(driver.getWindowHandle());
		//System.out.println(driver.getClass());
		//System.out.println(driver.getMouse());
		System.out.println(driver.findElementsByClassName("jumbotron text-center header_style"));
		
		driver.findElementByName("radioButton").click();
		driver.findElementById("autocomplete").sendKeys("Aanchal");
		
		WebElement w1=driver.findElementByXPath("//select[@id='dropdown-class-example']");
		Select s1=new Select(w1);
		s1.selectByIndex(3);
		System.out.println(s1.getAllSelectedOptions());
		System.out.println(s1.getClass());
		
		}

}
