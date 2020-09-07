package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Game_Guide_Object {

	public static WebElement element= null;
	

	public static WebElement Game_Object(ChromeDriver driver) {	
		element= driver.findElement(By.xpath("//*[@data-id ='games']"));
		return element;
	}
	
	
	public static WebElement Game_Guide(ChromeDriver driver) {
		element= driver.findElement(By.xpath("/html/body/div[2]/ui-view/div[2]/div/div/div[2]/div/div[11]/game-page-section/div/div/div/div/game-page-column/div/div/div/div/game-page-text/div/div/div/p/a/strong"));
		return element;
	}

}
