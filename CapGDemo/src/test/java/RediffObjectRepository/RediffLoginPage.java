package RediffObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

	WebDriver driver;

	public RediffLoginPage(WebDriver driver) {
		this.driver=driver;
	}

	By username=By.xpath("//input[@id='login1']");  //username
	By password=By.xpath("//input[@id='password']"); //password

	By signin=By.name("proceed"); //submit

	By home=By.xpath("//a[contains(text(),'rediff.com')]"); //Navigate to Home Page

	public WebElement username() {

		return driver.findElement(username);
	}

	public WebElement password() {

		return driver.findElement(password);
	}

	public WebElement signin() {

		return driver.findElement(signin);
	}

	public WebElement home() {

		return driver.findElement(home);
	}
}
