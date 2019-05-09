package com.tt.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HighlightAnObject {
	@Test
	public void Highlight_Object() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "/home/mahbub/WebDrivers/chromedriver_linux64/chromedriver");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://www.facebook.com");
		 Thread.sleep(4000);
		 driver.manage().window().maximize();
		 WebElement username =  driver.findElement(By.name("email"));
		 color(username, driver);
		  //driver.close();
		  
		 }
 public static void color(WebElement element, WebDriver driver) {
	 
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("arguments[0].setAttribute('style', 'background: yellow;');", element);
	 try { 
		 Thread.sleep(4000);
	 }
	 catch(InterruptedException e) { 
	 System.out.println(e.getMessage());	 
	 }
	 js.executeScript("arguments[0].setAttribute('style', 'background: black;');", element);
  }
 
}

