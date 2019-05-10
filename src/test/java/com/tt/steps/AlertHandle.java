package com.tt.steps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AlertHandle {
	public static WebDriver driver;
	@Given("^I am at rediff login page$")
	public void i_am_at_rediff_login_page() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "/home/mahbub/WebDrivers/chromedriver_linux64/chromedriver");
		    driver = new ChromeDriver();
		    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		    Thread.sleep(3000);
		    driver.manage().window().maximize();
		    Thread.sleep(5000);
	    
	}
	
	@When("^I click on go button witout entering name and password$")
	public void i_click_on_go_button_witout_entering_name_and_password() throws Throwable {
		driver.findElement(By.name("proceed")).click();
		
	}
	
	@When("^I click on ok button in new pop up windows$")
	public void i_click_on_ok_button_in_new_pop_up_windows() throws Throwable {
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
	
	@Then("^I see new windows gone$")
	public void i_see_new_windows_gone() throws Throwable {
	 //this is change
	}

}
