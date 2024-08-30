package googleObjects;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GoogleSuggestionPOM {

WebDriver driver = null;
    
    public GoogleSuggestionPOM(WebDriver driver) {
        // TODO Auto-generated constructor stub
        
        this.driver = driver;
        PageFactory.initElements(driver, this);     
    }
    
    @FindBy(css="input[title='Search']") 
    WebElement searchTxt;
    
    @FindBy(xpath="//span[contains(text(),'selenium')]") 
    List<WebElement> suggestions;
    
    public void selectSuggestionmethod() throws InterruptedException
    {
        searchTxt.sendKeys("Selenium");
        Thread.sleep(3000);
        System.out.println(suggestions.size());
        
        for(int i=0;i<suggestions.size();i++)
        {
           
            if(suggestions.get(i).getText().contains("selenium webdriver")) {
            	suggestions.get(i).click();
            }
          
        }
                
    }

}
