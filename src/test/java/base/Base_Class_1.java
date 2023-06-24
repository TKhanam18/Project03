package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class_1 {
	public static WebDriver driver;//driver declaration




	public static void navigateURL(String url) {
		driver.get(url);
	}
	public static void click(By locator) {
		driver.findElement(locator).click();
		
		
	}
	public static void sendkeys(By locator,String values ) {
		driver.findElement(locator).sendKeys(values);
		
			
		
		String s = driver.findElement(locator).getText();
	}
	public static String getElementText(By locator) {
		
		WebElement element =  driver.findElement( locator );
		//get the text of that element
		String s = element.getText();	
		return s;
	}

	
}//class
