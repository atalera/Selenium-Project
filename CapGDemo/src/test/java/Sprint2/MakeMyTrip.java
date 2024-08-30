package Sprint2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//opening MMT website
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1000);
		
		driver.findElementByXPath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']").click();
		
		//selecting Activities
		driver.findElementByXPath("//div[1]//nav[1]//ul[1]//li[10]//a[1]").click();
		Thread.sleep(1000);
		
		//selecting Activities
		driver.findElementByXPath("//input[@id='activitySearch']").click();
		Thread.sleep(1000);
		
		//Type Andaman
		WebElement className = driver.findElement(By.xpath("//input[@class='react-autosuggest_input react-autosuggest_input--open']"));
		className.sendKeys("Andaman");
		Thread.sleep(2000);
		driver.findElementByXPath("//li[@id='react-autowhatever-1-section-0-item-1']//p[@class='appendBottom5 suggestionTxt']").click();
		Thread.sleep(1000);
		
		//click on search button
		driver.findElementByXPath("//button[@id='search_button']").click();
		Thread.sleep(1000);
		
		//scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(1000);
		
		//Cruises
		driver.findElementByXPath("//section[1]//ul[1]//li[5]//a[1]//div[1]").click();
		Thread.sleep(2000);
		
		//scroll down
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2000);
		
		//selecting havelock to portblair
		driver.findElementByXPath("//body/div[@id='root']/div/section[@class='container']/div[@class='section-container']/section[@class='section-right']/div[@class='product-list']/div[@class='infinite-scroll-component__outerdiv']/div[@class='infinite-scroll-component ']/a[2]/div[1]").click();
		Thread.sleep(1000);
		
		//child window
		String parentWindow = driver.getWindowHandle();
		for (String childWindowHandle : driver.getWindowHandles()) {
			if(!childWindowHandle.equalsIgnoreCase(parentWindow)){
				driver.switchTo().window(childWindowHandle);
				driver.findElementByXPath("//body/div[@id='root']/div/div[@class='container flex-row page-content']/div[@class='details-left-wrapper']/div[@class='detail-media-carousel-wrapper flex-row']/div[@class='detail-media-carousel']/div[@class='slick-slider slick-initialized']/div[3]//*[name()='svg']").click();
				Thread.sleep(1000);
				driver.findElementByXPath("//body/div[@id='root']/div/div[@class='container flex-row page-content']/div[@class='details-left-wrapper']/div[@class='detail-media-carousel-wrapper flex-row']/div[@class='detail-media-carousel']/div[@class='slick-slider slick-initialized']/div[3]//*[name()='svg']").click();
				Thread.sleep(1000);
				driver.findElementByXPath("//body/div[@id='root']/div/div[@class='container flex-row page-content']/div[@class='details-left-wrapper']/div[@class='detail-media-carousel-wrapper flex-row']/div[@class='detail-media-carousel']/div[@class='slick-slider slick-initialized']/div[3]//*[name()='svg']").click();
				Thread.sleep(1000);
				
		        //package Selection
				driver.findElementByXPath("//a[normalize-space()='Package Selection']").click();
				
				driver.findElementByXPath("//div[@class='rp-cd-header rp-cd-header-active']//p[@class='rp-cd-name'][contains(text(),'Swaraj Dweep')]").click();
				
			}
		}			
	}
}