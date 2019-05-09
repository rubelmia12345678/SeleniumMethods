package com.tt.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindowsHandle {
	@Test
	public void windowsHandle() throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/home/mahbub/WebDrivers/chromedriver_linux64/chromedriver");
	    driver = new ChromeDriver();
	    driver.get("https://www.online.citibank.co.in/");
	    driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div[2]/div/div[1]/div[1]/p[2]/a[1]/img")).click();
	    
	    String parentWindow = driver.getWindowHandle();
	    for(String childWindow: driver.getWindowHandles()) {
	    	
	    	driver.switchTo().window(childWindow);
	    	
	    }
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"withKeyboard\"]/div[1]/div/div[2]/div[5]")).click();
	    	//driver.close();
	    	driver.switchTo().window(parentWindow);
	    	driver.findElement(By.id("topMnucreditcards")).click();
	    	//driver.close();
	    }	
	}


