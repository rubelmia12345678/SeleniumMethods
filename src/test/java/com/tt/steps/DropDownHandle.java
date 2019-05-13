package com.tt.steps;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownHandle {
	@Test
	public void dropDown() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/mahbub/WebDrivers/chromedriver_linux64/chromedriver");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.bnymellon.com/us/en/contact.jsp");
	    Thread.sleep(3000);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    //Drop down steps starts
	    WebElement slct_drpdwn = driver.findElement(By.id("topic_selector"));
		Select se_category = new Select(slct_drpdwn);
		se_category.selectByVisibleText("Careers");
		WebElement drp_dwn2 = driver.findElement(By.name("topic_selector_careers"));
		Select sub_category = new Select(drp_dwn2);
		sub_category.selectByVisibleText("Forgot username/password");
		//Drop down steps end
		
		driver.findElement(By.xpath("//*[@id=\"topics-form\"]/ul/li[3]/a")).click();
		driver.close();
	}

}
