package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//import com.sun.tools.javac.util.List;
import java.util.List;

public class Find_Your_Location {

public static WebElement element= null;
public static List<WebElement> venuelist= null;
	
	public static WebElement Find_Venue_Object(ChromeDriver driver) {	
		element= driver.findElement(By.xpath("/html/body/div[2]/ui-view/headroom/navbar-top/nav/div[2]/ul[1]/li[4]/p/a"));
		return element;
	}
	
	public static WebElement Pub_Button_Object(ChromeDriver driver) {	
		element= driver.findElement(By.xpath("/html/body/div[2]/ui-view/div[2]/div/div[2]/form/div/div[3]/ul/li[3]/a"));
		return element;
	}
	
	public static WebElement Venue_Search_Object(ChromeDriver driver) {	
		element= driver.findElement(By.id("venue-search"));
		return element;
	}
	
	public static List<WebElement> Venue_List_Object(ChromeDriver driver) {	
		venuelist=driver.findElements(By.className("ng-scope"));
		//List<WebElement> venuelist=driver.findElements(By.className("ng-scope"));
		return venuelist;
	}
	
	
	
	
}
