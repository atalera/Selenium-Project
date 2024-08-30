package courseraObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CourseraJoinFree {

	WebDriver driver;

	public CourseraJoinFree(WebDriver driver) {
		this.driver=driver;
	}

	By joinbtn= By.className("_6dgzsvq css-1af0gyj");
	By fullname=By.xpath("//input[@id='name']");
	By email=By.xpath("//input[@id='email']");
	By password=By.xpath("//input[@id='password']");
	By btn=By.xpath("//button[contains(text(),'Login')]");
	
	public WebElement joinbtn() {
		return driver.findElement(joinbtn);
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
	
	public WebElement btn() {
		return driver.findElement(btn);
	}
	
}
