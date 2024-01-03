package minipack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yadhu\\OneDrive\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
		driver.navigate().to("https://formy-project.herokuapp.com/fileupload");
		driver.manage().window().maximize();

        
        Select option = new Select(driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton\"]")));
        option.selectByVisibleText("Buttons");
      //option.selectByIndex(1);
//     option.selectByValue("");

	}

}
