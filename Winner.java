package appModule;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.chrome.ChromeDriver;


import pageObject.Winner_Object;
public class Winner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}//Click to Find Location
	public static void Winner_Process(ChromeDriver driver) {
		
		Winner_Object.Winner1_Object(driver).click();
		
		// Scrolling the web page is not required for this test. Can be skipped by commenting it out.
 		JavascriptExecutor jse = (JavascriptExecutor)driver;
 		jse.executeScript("window.scrollBy(0,1500)", "");
		
	}
	

}
