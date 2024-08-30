package guru99Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Guru99Login {
	
	WebDriver driver;
	
	public Guru99Login(WebDriver driver) {
		this.driver=driver;
	}

	By userID= By.name("uid");
	By password= By.name("password");
	By login= By.name("btnLogin");
	By managerID= By.xpath("//td[contains(text(),'Manger Id : mngr356065')]");
	By logout= By.xpath("//a[contains(text(),'Log out')]");
	
	public WebElement userid() {
		return driver.findElement(userID);
	}
	
	public WebElement passwrd() {
		return driver.findElement(password);
	}
	
	public WebElement logn() {
		return driver.findElement(login);
	}
	
	public WebElement managerId() {
		return driver.findElement(managerID);
	}
	
	public WebElement logt() {
		return driver.findElement(logout);
	}
	
}
