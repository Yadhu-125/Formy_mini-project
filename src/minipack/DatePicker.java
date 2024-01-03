package minipack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args)  throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadhu\\OneDrive\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
		driver.navigate().to("https://formy-project.herokuapp.com/datepicker");
		driver.manage().window().maximize();
		    
	
		        String month = "May 2000";
		        String day = "3";
		        
		        WebElement datepicker = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
		        datepicker.click();
		        
		        Thread.sleep(2000);
		        
		        while(true)
		        {
		        String monthyear = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[2]/th[2]")).getText();
		        
		        if(monthyear.equals(month))
		        {
		        break;	
		        }
		        else
		        {
		        	WebElement leftarrow = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[2]/th[1]"));
		        	leftarrow.click();
		        	}
		        }
		        WebElement day1 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[2]/td[1]"));
		        day1.click();
			
		
	}

}
