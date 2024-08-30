package MyStoreObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mystore {

	WebDriver driver;

	public Mystore(WebDriver driver) {
		this.driver=driver;
	}
	
	By signin= By.cssSelector("a[title='Log in to your customer account']");
	By email= By.xpath("//input[@id='email']");
	By passwd=By.xpath("//input[@id='passwd']");
	By loginbtn= By.id("SubmitLogin");
	//By women = By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]");
	By tshirt= By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]");
	By more= By.cssSelector("a[title='View'] span");
	By plus= By.cssSelector(".icon-plus");
	By color= By.cssSelector("#color_13");
	By cart=By.cssSelector("button[name='Submit'] span");
	By checkout = By.cssSelector("a[title='Proceed to checkout'] span");
	By checkout2= By.cssSelector("a[class='button btn btn-default standard-checkout button-medium'] span");
	By checkout3= By.cssSelector("button[name='processAddress'] span");
	By checkbox= By.cssSelector("#cgv");
	By checkout4= By.cssSelector("button[name='processCarrier'] span");
	By pay=By.cssSelector("a[title='Pay by check.']");
	By order= By.cssSelector("button[class='button btn btn-default button-medium'] span");
	
	public WebElement signin() {
		
		return driver.findElement(signin);
	}
	
public WebElement email() {
		
		return driver.findElement(email);
	}

public WebElement passwd() {
	
	return driver.findElement(passwd);
}
	
public WebElement loginbtn() {
	
	return driver.findElement(loginbtn);
}

public void women() {
	
	WebElement women=driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]"));
	Actions action = new Actions(driver);
	action.moveToElement(women).perform();
	//return driver.findElement(women);

}

public WebElement tshirt() {
	
	return driver.findElement(tshirt);
}

public void selectT() {
	WebElement selTshirt=driver.findElement(By.cssSelector("img[title='Faded Short Sleeve T-shirts']"));
	Actions action = new Actions(driver);
	action.moveToElement(selTshirt).perform();
}
	
public WebElement more() {
	
	return driver.findElement(more);
}

public WebElement plus() {
	
	return driver.findElement(plus);
}

public void selectsize() {
	
	Select s=new Select(driver.findElement(By.cssSelector("#group_1")));
	s.selectByVisibleText("L");;
}

public WebElement color() {
	
	return driver.findElement(color);
}

public WebElement cart() {
	
	return driver.findElement(cart);
}

public WebElement checkout() {
	
	return driver.findElement(checkout);
}

public WebElement checkout2() {
	
	return driver.findElement(checkout2);
}

public WebElement checkout3() {
	
	return driver.findElement(checkout3);
}

public WebElement checkbox() {
	
	return driver.findElement(checkbox);
}

public WebElement checkout4() {
	
	return driver.findElement(checkout4);
}

public WebElement pay() {
	
	return driver.findElement(pay);
}

public WebElement order() {
	
	return driver.findElement(order);
}




}
