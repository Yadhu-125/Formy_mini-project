package minipack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadhu\\OneDrive\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    
        driver.get("https://formy-project.herokuapp.com/switch-window");
        driver.manage().window().maximize();
        
       // WebElement newtab = driver.findElement(By.xpath("//*[@id=\"new-tab-button\"]"));
        //newtab.click();
        
        WebElement alert = driver.findElement(By.xpath("//*[@id=\"alert-button\"]"));
        alert.click();
        
        Alert alertbox = driver.switchTo().alert();
	    driver.switchTo().alert().accept();
        
        
	        

	}

}
