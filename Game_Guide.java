package appModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import pageObject.Game_Guide_Object;

public class Game_Guide {
     
	public static ChromeDriver driver= null;
	
	//Check Results
	public static void Game_Guide_Process(ChromeDriver driver) {
		
		//Game_Guide_Object.Game_Object(driver).click();
		 
		// Scrolling the web page is not required for this test. Can be skipped by commenting it out.
	 		JavascriptExecutor jse = (JavascriptExecutor)driver;
	 		jse.executeScript("window.scrollBy(0,500)", "");
	 		
	 		Game_Guide_Object.Game_Guide(driver).click();	
		
	}
	
    public static void Game_Dropdown(ChromeDriver driver) {
		
    	WebElement testDropDown = driver.findElement(By.className("dropdown-menu"));  
    	Select dropdown = new Select(testDropDown);  
    	dropdown.selectByVisibleText("mega-millions");
		
	}

}
