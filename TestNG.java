package automationFramework;

import org.testng.annotations.Test;

import appModule.Check_Result;
import appModule.Check_Result_Camb;
import appModule.Find_Venue;
import appModule.Game_Guide;
import appModule.Winner;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG {
	
  public static ChromeDriver driver= null;	
  @BeforeTest
   public void beforeTest() throws Exception {
	  String exepath= "C:\\SamtaSelenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exepath);
		
		 driver= new ChromeDriver();
		 driver.get("https://www.keno.com.au?jurisdiction=VIC");
		Thread.sleep(5000);
	    
		// Maximize Browser Window
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
   }	
	
  @Test
  public void f() throws Throwable {
	  // Find the Venue in Pub
	     Find_Venue.Find_Venu_Process(driver);
	     Find_Venue.Find_Venue_List(driver); 
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     
	    
	    //Check Result for Camberwell Location
	    Check_Result_Camb.Find_Venu_Process(driver);
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    
	    //Find the Winner in Game
	    driver.get("https://www.keno.com.au?jurisdiction=VIC");
	    Winner.Winner_Process(driver);
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    
	  //Check Result
	    Check_Result.Check_Result1(driver);
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    
	    //Find the Game Guide
	    driver.get("https://www.keno.com.au/games/classic");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    Game_Guide.Game_Guide_Process(driver); 
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }
  

  @AfterTest
  public void afterTest() {
	  driver.quit();
	  
  }

}
