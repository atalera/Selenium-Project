package googleTestcase;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import googleObjects.GoogleSuggestionPOM;


public class GoogleTestCases {
	
	public GoogleTestCases() {
        // TODO Auto-generated constructor stub
    }
    //WebDriver driver=null;
        Properties prop;
        FileInputStream fis;
        WebDriver driver=null;
        
        @BeforeTest
        public void setup()
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
            //  WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        
        @Test
        public void googleSearch() throws InterruptedException
        {
            driver.get("https://www.google.com/");
            GoogleSuggestionPOM gsp = new GoogleSuggestionPOM(driver);
            gsp.selectSuggestionmethod();
            
            
        }


}
