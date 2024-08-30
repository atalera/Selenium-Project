package CapG.CapGDemo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet{

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://book.spicejet.com/");
		
		driver.findElementById("highlight-book").click();
		Thread.sleep(2000);
		
		driver.findElementByClassName("selected").click();		
		Thread.sleep(2000);
		
		driver.findElementById("ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip").click();
		Thread.sleep(2000);
		
		//agra
		driver.findElementById("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT").click();
		driver.findElementByXPath("//a[contains(text(),'Agra (AGR)')]").click();
		Thread.sleep(2000);  
		
		//jaipur
		//driver.findElementByXPath("ctl00_mainContent_ddl_destinationStation1_CTXT").click();
		driver.findElementByXPath("//body[1]/div[17]/form[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[3]/div[1]/div[1]/ul[2]/li[1]/a[1]").click();
		Thread.sleep(2000);
		
		//depart date
		//driver.findElementById("custom_date_picker_id_1").click();
		driver.findElementByXPath("//tbody/tr[1]/td[7]/a[1]").click();
		Thread.sleep(2000);

		//return date
		//driver.findElementById("custom_date_picker_id_2").click();
		driver.findElementByXPath("//body/div[17]/form[1]/div[2]/div[1]/div[2]/div[3]/div[s1]/div[2]/div[1]/div[3]/input[1]").click();
		Thread.sleep(2000);
		
		driver.findElementByXPath("//div[@id='divpaxinfo']");
		Thread.sleep(2000); 
		
		Select s2=new Select(driver.findElementByXPath("//select[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency']"));
		s2.selectByVisibleText("EUR");
		Thread.sleep(2000);
		
		driver.findElementById("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit']").click();  
	}

}

