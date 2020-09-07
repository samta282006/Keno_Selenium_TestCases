package appModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObject.Check_Result_Objects;

public class Check_Result {

	        //Check Results
			public static void Check_Result1(ChromeDriver driver) {
				
				Check_Result_Objects.Check_Result_Object(driver).click();
				
				
				WebDriverWait wait = new WebDriverWait(driver,30);
				
				/*
				 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
				 * xpath("//*[@data-id ='download-results']")));
				 * driver.findElement(By.xpath("//*[@data-id ='download-results']")).click();
				 * 
				 * searchForMovie = WebDriverWait (driver,
				 * 10).until(EC.element_to_be_clickable((By.
				 * xpath("//*[@data-id ='download-results']"))) searchForMovie.click()
				 * searchForMovie.clear()
				 */
				
				 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				 Check_Result_Objects.Date_Tab_Object(driver).click();
				 Check_Result_Objects.Date_Tab_Object(driver).clear();
				 Check_Result_Objects.Date_Tab_Object(driver).clear();
				 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				 Check_Result_Objects.Date_Tab_Object(driver).sendKeys("03-09-2020");
				 
				 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				 Check_Result_Objects.Start_Game_Object(driver).click();
				 Check_Result_Objects.Start_Game_Object(driver).clear();
				 
				 Check_Result_Objects.Start_Game_Object(driver).sendKeys("501");
				 
				 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				 Check_Result_Objects.Numer_Of_Games_Object(driver).click();
				 
				 Check_Result_Objects.Numer_Of_Games_Object(driver).clear();
				 
				 Check_Result_Objects.Numer_Of_Games_Object(driver).sendKeys("10");
				 
				  //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				  //Check_Result_Objects.Date_Tab_Object(driver).clear();
				  
				  //Check_Result_Objects.Date_Tab_Object(driver).sendKeys("02-09-2020");
				  
				  Check_Result_Objects.Check_Results_Final_Object(driver).click();
				  
				 Check_Result_Objects.Download_Result_Final_Object(driver).click();
				  
				 
				 
				 
			}
}
