package step_definition;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Best_Buy_Camera {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver browser =new ChromeDriver();
		browser.get("https://www.bestbuy.com");
		browser.manage().window().maximize();
		//1st way
		WebElement searchbox;
		searchbox = browser.findElement(By.xpath("//input[@id='gh-search-input']"));
		searchbox.sendKeys("Camera" );
		browser.findElement(By.className("header-search-button")).click();
		
		//2nd way
		//browser.findElement(By.xpath("//input[@name='st']")).sendKeys("Camera" + Keys.ENTER);
		
//		List <WebElement>cameras=new ArrayList<WebElement>();
//		cameras = browser.findElements(By.xpath("//ol[@class='sku-item-list']/li"));
//		System.out.println(cameras.size());

		//		for (WebElement camera : cameras) {
//			String price = camera.findElement(By.xpath(".//div/div[@class='priceView-hero-price priceView-customer-price']/span")).getText(); 
//			//browser.switchTO().alert().dismiss();
//			System.out.println(price);
		ArrayList<WebElement> finalLinks =  new ArrayList<WebElement>();
		//WebElement myDiv = browser.findElement(By.id("main-results"));
		List<WebElement> cameras = browser.findElements(By.xpath("//ol[@class='sku-item-list']/li"));
		System.out.println(cameras.size());
		
		//String actualprice = myDiv.findElement(By.xpath(".//div/div[@class='priceView-hero-price priceView-customer-price']/span")).getText(); 
		 // System.err.println(actualprice);
		
		for(WebElement camera:cameras){
		  try{
			  String price = camera.findElement(By.xpath(".//div/div[@class='priceView-hero-price priceView-customer-price']/span")).getText();
		      System.out.println(price);
		      
		  }
		  catch(Exception e){
		      finalLinks.add(camera);
			  
		}
		  String actualprice = browser.findElement(By.xpath(".//div/div[@class='priceView-hero-price priceView-customer-price']/span")).getText(); 
		  System.err.println(actualprice);
		  
//		  for(int i=0;i<cameras.size();i++){
//			  System.out.println(i +" : "+ cameras.get(i).getText());
//			  
//		 
//			  screenshot below:
////		  if (scenario.isFailed()) {
//			TakesScreenshot ts = (TakesScreenshot)driver;
//			byte[] src = ts.getScreenshotAs(OutputType.BYTES);
//			scenario.attach(src, "image/png", "screenshot");
//			scenario.log("this is my failed test case screenshot");
//			scenario.log("Scenario: " + scenario.getName() );
//		}}
		  
		}
		
	}//main

}//class
	
