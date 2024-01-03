package minipack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebForm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadhu\\OneDrive\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
        driver.get("https://formy-project.herokuapp.com/form");
        driver.manage().window().maximize();

        
        WebElement firstname = driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
        firstname.sendKeys("yadhu ");
        
        WebElement lastname = driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
        lastname.sendKeys("k j");

        WebElement job = driver.findElement(By.xpath("//*[@id=\"job-title\"]"));
        job.sendKeys("Software tester");
        
        WebElement education = driver.findElement(By.xpath("//*[@id=\"radio-button-2\"]"));
        education.click();
        
        WebElement sex = driver.findElement(By.xpath("//*[@id=\"checkbox-1\"]"));
        sex.click();
        
        Select experience = new Select(driver.findElement(By.xpath("//*[@id=\"select-menu\"]")));
        experience.selectByVisibleText("0-1");
        
        String month = "March 2003";
        String day = "12";
        
        WebElement datepicker = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
        datepicker.click();
        
        Thread.sleep(2000);
        
        while(true)
        {
        String monthyear1 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[2]/th[2]")).getText();
        
        if(monthyear1.equals(month))
        {
        break;	
        }
        else
        {
        	WebElement leftarrow = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[2]/th[1]"));
        	leftarrow.click();
        	}
        }
        WebElement day1 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[3]/td[4]"));
        day1.click();
        
        WebElement submit = driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a"));
        submit.click();
        
        Thread.sleep(3000);
        
        driver.close();
	}

}
