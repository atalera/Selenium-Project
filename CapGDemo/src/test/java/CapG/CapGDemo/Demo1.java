package CapG.CapGDemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Demo1 {
	

	private static int counter=1;
	public static void main(String args[]) throws IOException {
		
					
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
				
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		WebElement s1=driver.findElementByXPath("//tbody");
		//System.out.println(s1.getText());
		
		WebElement s2=driver.findElement(By.xpath("//div[@id='leftcontainer']/table[@class='dataTable']/thead/tr/th"));
		//System.out.println(s2.getText());
		
		WebElement s3=driver.findElementByXPath("//tbody/tr[1]");
		//System.out.println(s3.getText());
		
		WebElement s4=driver.findElementByXPath("//tbody//tr[1]//td[4]");
		//System.out.println(s4.getText());
		
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		Demo1 d=new Demo1();
		
		
		Files.copy(src,new File("./screenshot/SF1"+counter+".png"));
		Files.copy(src,new File("./screenshot/SF1"+counter+".png"));
		Files.copy(src,new File("./screenshot/SF1"+counter+".png"));
		counter++;
		
		
		System.out.println(counter);
	}

}
