package courseraObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CourseraSearch {

	WebDriver driver;

	public CourseraSearch(WebDriver driver) {
		this.driver=driver;
	}
	
	By search= By.className("react-autosuggest__input");
	By sign=By.xpath("//button[@class='nostyle search-button']//div[@class='magnifier-wrapper']//*[name()='svg']");
	By course=By.xpath("//h2[normalize-space()='Google IT Automation with Python']");
	By enroll= By.className("_mkj5xnr");
	//By google = By.className("_d6ddka css-1581srh");
	By joinbtn= By.xpath("//button[contains(text(),'Join for Free')]");
	By fullname=By.xpath("//input[@id='name']");
	By email=By.xpath("//input[@id='email']");
	By password=By.xpath("//input[@id='password']");
	By continuebtn= By.xpath("//button[contains(text(),'Continue')]");
	
	public WebElement joinbtn() {
		return driver.findElement(joinbtn);
	}
	
	public WebElement continuebtn() {
		return driver.findElement(continuebtn);
	}
	
	public WebElement fullname() {
		return driver.findElement(fullname);
	}
	
	public WebElement email() {
		return driver.findElement(email);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}
	
	
	public WebElement search() {
		return driver.findElement(search);
	}
	
	//public WebElement google() {
		//return driver.findElement(google);
	//}
	
	public WebElement sign() {
		return driver.findElement(sign);
	}
	
	public WebElement course() {
		return driver.findElement(course);
	}
	
	public void enroll() {
		driver.findElement(enroll).click();
	}
	
	
	
}
