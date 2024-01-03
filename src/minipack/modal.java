package minipack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class modal {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadhu\\OneDrive\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
        driver.get("https://formy-project.herokuapp.com/modal");
        driver.manage().window().maximize();
        
        WebElement open_modal = driver.findElement(By.xpath("//*[@id=\"modal-button\"]"));
        open_modal.click();
        
        Alert alertbox = driver.switchTo().alert();
	     //driver.switchTo().alert().accept();
	     driver.switchTo().alert().dismiss();
        
	}

}
