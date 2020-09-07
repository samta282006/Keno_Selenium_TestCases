package appModule;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import pageObject.Find_Your_Location;
/*import pageObject.Login_Page;*/
import java.util.List;

public class Find_Venue {
	
	
    
	//Click to Find Location
		public static void Find_Venu_Process(ChromeDriver driver) {
			Find_Your_Location.Find_Venue_Object(driver).click();
			Find_Your_Location.Pub_Button_Object(driver).click();
		}
		
		//Find the venue1 detail List
		public static void Find_Venue_List(ChromeDriver driver) throws Exception {
			
			Find_Your_Location.Venue_List_Object(driver).size();
			//System.out.println(Find_Your_Location.Venue_List_Object(driver).size());
			
			List<WebElement> venuelist1=driver.findElements(By.xpath("//*[@data-id ='venue']"));
					
			Thread.sleep(500);
			
			 System.out.println(venuelist1.size());

		        for (WebElement webElement : venuelist1) {
		            String name = webElement.getText();
		            System.out.println(name);
		        }
			
	
	}

}
