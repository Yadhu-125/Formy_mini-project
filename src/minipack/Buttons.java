package minipack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadhu\\OneDrive\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
		driver.navigate().to("https://formy-project.herokuapp.com/buttons");
		driver.manage().window().maximize();
        
		WebElement primary = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[1]"));
        primary.click();
        
        WebElement succes = driver.findElement(By.xpath("//html/body/div/form/div[1]/div/div/button[2]"));
        succes.click();
        
        WebElement info = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[3]"));
        info.click();
        
        WebElement warning = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[4]"));
        warning.click();
        

        WebElement link = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[6]"));
        link.click();
        

        WebElement danger = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[5]"));
        danger.click();
        

        WebElement left = driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[1]"));
        left.click();
        

        WebElement middle = driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[2]"));
        middle.click();
        

        WebElement right = driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[3]"));
        right.click();
        
        

        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"btnGroupDrop1\"]"));
        dropdown.click();
	
	}

}
