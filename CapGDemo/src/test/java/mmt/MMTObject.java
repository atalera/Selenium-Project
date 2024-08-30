package mmt;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;
public class MMTObject {

	WebDriver driver;

	public MMTObject(WebDriver driver)
	{
		this.driver=driver;
	}

	By login = By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']");   
	By activities = By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chActivities']");
	By search = By.xpath("//input[@id='activitySearch']");
	By text = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
	By Andaman= By.xpath("//p[@class='appendBottom5 suggestionTxt'][normalize-space()='Andaman']");
	By button = By.xpath("//button[@id='search_button']");
	By cruise =By.xpath("/section[1]//ul/[1]//li[5]//a[1]//div[1]");
	By port= By.xpath("//body/div[@id='root']/div/section[@class='container']/div[@class='section-container']/section[@class='section-right']/div[@class='product-list']/div[@class='infinite-scroll-component__outerdiv']/div[@class='infinite-scroll-component ']/a[2]/div[1]");	
	By swipe =By.xpath("//body/div[@id='root']/div/div[@class='container flex-row page-content']/div[@class='details-left-wrapper']/div[@class='detail-media-carousel-wrapper flex-row']/div[@class='detail-media-carousel']/div[@class='slick-slider slick-initialized']/div[3]//*[name()='svg']");
	//By pack= By.xpath("//h3[contains(text(),'Package Selection')]");


	public WebElement login()
	{
		return driver.findElement(login); 
	}
	public WebElement activities()
	{
		return driver.findElement(activities); 
	}
	public WebElement search()
	{
		return driver.findElement(search); 
	}
	public WebElement text()
	{
		return driver.findElement(text); 
	}
	public WebElement selectAndaman()
	{
		return driver.findElement(Andaman); 
	}
	public WebElement button()
	{
		return driver.findElement(button); 
	}
	public WebElement cruise()
	{
		return driver.findElement(cruise); 
	}
	public WebElement port()
	{
		return driver.findElement(port); 
	}
	public WebElement swipe()
	{
		return driver.findElement(swipe); 
	}

	public WebElement pack()
	{
		return  driver.findElement(By.xpath("//a[contains(text(),'Package Selection')]")); 
	}

	public WebElement plus() {

		return driver.findElement(By.xpath("//button[normalize-space()='+']"));
	}

	public WebElement book() {
		return driver.findElement(By.xpath("//button[contains(text(),'BOOK NOW')]"));
	}

	public void title() {
		//return driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/select[1]"));
		Select sel = new Select(driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/select[1]")));
		sel.selectByVisibleText("Ms");
	}

	public WebElement fname() {
		return driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/input[1]"));
	}

	public WebElement lname() {
		return driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/input[1]"));
	}

	public WebElement email() {
		return driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]"));
	}

	public WebElement phone() {
		return driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]"));
	}

	public WebElement payment() {
		return driver.findElement(By.xpath("//button[contains(text(),'Proceed to payments')]"));
	}

	public WebElement title1() {
		return driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[3]"));
	}

	public WebElement fullname1() {
		return driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/input[1]"));
	}

	public WebElement age1() {
		return driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/input[1]"));
	}

	public WebElement gender1() {
		return driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[2]"));
	}

	public WebElement nationality1() {
		return driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[1]"));
	}

	public WebElement title2() {
		return driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[3]"));
	}

	public WebElement fullname2() {
		return driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/input[1]"));
	}

	public WebElement age2() {
		return driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/input[1]"));
	}

	public WebElement gender2() {
		return driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[2]"));
	}

	public WebElement nationality2() {
		return driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[5]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[1]"));
	}

	public WebElement save() {
		return driver.findElement(By.xpath("//button[contains(text(),'Save & Proceed')]"));
	}
	
	public void screenshot() throws IOException {
		File ss = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);//Type casting
		Files.copy(ss,new File("./screenshot" + System.currentTimeMillis() + ".png"));
		System.out.println("Screenshot is taken successfully");
	}
	
}
