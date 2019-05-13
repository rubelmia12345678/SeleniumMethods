package com.tt.steps;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NumberOfLinks {
	@Test
	public void Total_Links() throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "/home/mahbub/WebDrivers/chromedriver_linux64/chromedriver");
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    Thread.sleep(3000);
    driver.manage().window().maximize();
    
    List<WebElement> links = driver.findElements(By.tagName("a"));
    System.out.println("Total links : "+links.size());
    
    for (int i =0; i<links.size(); i++){
    	System.out.println(links.get(i).getText());
    	//driver.close();
      }

   }
	
}
