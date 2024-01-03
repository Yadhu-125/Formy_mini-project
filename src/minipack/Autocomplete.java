package minipack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadhu\\OneDrive\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://formy-project.herokuapp.com/autocomplete");
        driver.manage().window().maximize();
        
        WebElement address= driver.findElement(By.id("autocomplete"));
		address.sendKeys("kottayam");
		//WebElement alert = driver.findElement(By.className("dismissButton"));
        //alert.click();
		
	    WebElement street_address= driver.findElement(By.xpath("autocompletestreet_number//*[@id=\"street_number\"]"));
	    street_address.sendKeys("Ayarkunnam");
	    
	    WebElement street_address2= driver.findElement(By.xpath("//*[@id=\"route\"]"));
	    street_address2.sendKeys("Ayarkunnam");
	    
	    WebElement city= driver.findElement(By.xpath("//*[@id=\"locality\"]"));
	    city.sendKeys("kottayam");
	    
	    
	    WebElement state= driver.findElement(By.xpath("//*[@id=\"administrative_area_level_1\"]"));
	    state.sendKeys("kerala");
	    
	    WebElement zipcode= driver.findElement(By.xpath("//*[@id=\"postal_code\"]"));
	    zipcode.sendKeys("686564");
	    
	    WebElement country= driver.findElement(By.xpath("//*[@id=\"country\"]"));
	    country.sendKeys("india");
	    
	    
	    
	    
	}

}
