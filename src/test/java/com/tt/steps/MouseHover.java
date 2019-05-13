package com.tt.steps;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
	public static WebDriver driver;
	
	@Test
	public void hover(){
		
		System.setProperty("webdriver.chrome.driver", "/home/mahbub/WebDrivers/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bnymellon.com/");
		driver.manage().window().maximize();
		  
		WebElement element = driver.findElement(By.xpath("/html/body/nav[3]/div[2]/ul/li[2]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/nav[3]/div[2]/ul/li[2]/div/ul/li[2]/a")).click();
		//driver.close();

	}

}
