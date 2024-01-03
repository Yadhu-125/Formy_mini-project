package minipack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadhu\\OneDrive\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
		driver.navigate().to("https://formy-project.herokuapp.com/checkbox");
		driver.manage().window().maximize();
		
		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"checkbox-1\"]"));
        checkbox1.click();
        
        WebElement checkbox2 = driver.findElement(By.id("checkbox-2"));
        checkbox2.click();
        
        WebElement checkbox3 = driver.findElement(By.id("checkbox-3"));
        checkbox3.click();
        
        
	}

}
