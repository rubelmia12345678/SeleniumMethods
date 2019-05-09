package com.tt.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	@Test
	public void DragDrop() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "/home/mahbub/WebDrivers/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(5000);
		
		Actions act=new Actions(driver);
		// find element which we need to drag
		WebElement drag=driver.findElement(By.xpath(".//*[@id='draggable']"));
		// find element which we need to drop
		WebElement drop=driver.findElement(By.xpath(".//*[@id='droppable']"));
		// this will drag element to destination
		act.dragAndDrop(drag, drop).build().perform();
		driver.close();

		}
	}
