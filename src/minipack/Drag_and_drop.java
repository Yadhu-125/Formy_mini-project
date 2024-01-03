package minipack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadhu\\OneDrive\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 driver.navigate().to("https://formy-project.herokuapp.com/dragdrop");
		 driver.manage().window().maximize();
		 driver.switchTo().frame(0);
		 WebElement sourceElement = driver.findElement(By.xpath("//*[@id=\"image\"]/img"));
		 WebElement targetElement = driver.findElement(By.xpath("//*[@id=\"box\"],"));
		 
		 Actions ac = new Actions(driver);
		 ac.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		 
	        
	}

}
