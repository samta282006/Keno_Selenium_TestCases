package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Winner_Object {

public static WebElement element= null;
	

	public static WebElement Winner1_Object(ChromeDriver driver) {	
		element= driver.findElement(By.xpath("//*[@data-id ='winners']"));
		return element;
	}

}
