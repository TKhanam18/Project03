package step_definition;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Rough_codes {
	
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver browser = new ChromeDriver();
		browser.get("https://www.bestbuy.com");
		browser.manage().window().maximize();
		
		
		// 1st way
	WebElement searchBox;
		searchBox = browser.findElement(By.xpath("//input[@id='gh-search-input']"));
		searchBox.sendKeys("Camera"+ Keys.ENTER);
		browser.findElement(By.xpath("//button[@class='header-search-button']")).click();
		
		
		//2nd way
		//browser.findElement(By.xpath("//input[@id='gh-search-input']")).sendKeys("Camera"+ Keys.ENTER);
		
		ArrayList<WebElement> finalLinks =  new ArrayList<WebElement>();
		WebElement myDiv = browser.findElement(By.id("main-results"));
		List<WebElement> links = myDiv.findElements(By.xpath("//ol[@class='sku-item-list']/li"));
		System.out.println(links.size());

		for(WebElement link:links){
		  try{
			 String containingtable = link.findElement(By.xpath(".//div/div[@class='priceView-hero-price priceView-customer-price']/span")).getText();

               System.out.println(containingtable);
		  }
		  catch(Exception e){
		      finalLinks.add(link);
		
		  }
		  
		 // screenshot below:
////		  if (scenario.isFailed()) {
//			TakesScreenshot ts = (TakesScreenshot)driver;
//			byte[] src = ts.getScreenshotAs(OutputType.BYTES);
//			scenario.attach(src, "image/png", "screenshot");
//			scenario.log("this is my failed test case screenshot");
//			scenario.log("Scenario: " + scenario.getName() );
//		}
		  
		  
		  
		  
		  
		  
		  
//		
//		  String actualprice = myDiv.findElement(By.xpath(".//div/div[@class='priceView-hero-price priceView-customer-price']/span")).getText();
//		     System.err.println(actualprice);
////		  
//		  for(int i=0; i<links.size();i++) {
//			  System.out.println(i+":"+links.get(i).getText());
//		  }
		  
		
		  
//		List<WebElement> cameras = new ArrayList<WebElement>();
//		
//		cameras = browser.findElements(By.xpath("//ol[@class='sku-item-list']/li"));
//		
//		for(WebElement camera : cameras) {
//			String value =camera.findElement(By.xpath(".//div/div[@class='priceView-hero-price priceView-customer-price']/span")).getText();
//			//browser.switchTo().alert().dismiss();
//			
//			System.out.println(value);
		}
		
		//div[@id='main-results']
		
		
		
		

		}

}//class


