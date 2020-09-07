package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Result_Objects {

	
	public static WebElement element= null;

	public static WebElement Check_Result_Object(ChromeDriver driver) {	
		element= driver.findElement(By.xpath("/html/body/div[2]/ui-view/headroom/navbar-top/nav/div[2]/ul[1]/li[2]/p/a"));
		return element;
	}
	
	public static WebElement Date_Tab_Object(ChromeDriver driver) {	
		element= driver.findElement(By.id("checkResultsDate"));
		return element;
	}
	
	public static WebElement Start_Game_Object(ChromeDriver driver) {	
		element= driver.findElement(By.name("gameNumber"));
		return element;
	}
	
	public static WebElement Numer_Of_Games_Object(ChromeDriver driver) {	
		element= driver.findElement(By.name("numOfGames"));
		return element;
	}
	
	public static WebElement Check_Results_Final_Object(ChromeDriver driver) {	
		element= driver.findElement(By.id("checkResults"));
		return element;
	}
	public static WebElement Download_Result_Final_Object(ChromeDriver driver) {	
		element= driver.findElement(By.xpath("//*[@data-id ='download-results']"));
		return element;
	}
}
