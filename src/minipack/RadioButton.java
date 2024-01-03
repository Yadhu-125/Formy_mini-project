package minipack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadhu\\OneDrive\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
        driver.get("https://formy-project.herokuapp.com/radiobutton");
        driver.manage().window().maximize();
        
        WebElement RadioButton1 = driver.findElement(By.xpath("//*[@id=\"radio-button-1\"]"));
        RadioButton1.click();
        
        WebElement RadioButton2 = driver.findElement(By.xpath("/html/body/div/div[2]/input"));
        RadioButton2.click();
        
        WebElement RadioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        RadioButton3.click();
        

	}

}
