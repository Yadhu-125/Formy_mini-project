package minipack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadhu\\OneDrive\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
        driver.get("https://formy-project.herokuapp.com/fileupload");
        driver.manage().window().maximize();
       
        WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file-upload-field\"]"));
        fileInput.sendKeys("C:\\Users\\yadhu\\OneDrive\\Pictures\\Screenshots\\2022-08-12 (1).png");
        
        try {
        	Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {
        	e.printStackTrace();
        }
        WebElement reset = driver.findElement(By.xpath("/html/body/div/form/div/div/span[2]"));
        reset.click();
        
Thread.sleep(3000);
        
        //driver.close();
	}

}
