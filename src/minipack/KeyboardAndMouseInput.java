package minipack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardAndMouseInput {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadhu\\OneDrive\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
        driver.get("https://formy-project.herokuapp.com/keypress");
        driver.manage().window().maximize();
        
        WebElement fullname = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		fullname.sendKeys("yadhu kj");
		
		WebElement button = driver.findElement(By.xpath("/html/body/div/form/div[2]/div"));
        button.click();

	}

}
