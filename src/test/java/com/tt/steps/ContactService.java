package com.tt.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactService {
	public static WebDriver driver;
	@Given("^I am on BNY Mellon homepage$")
	public void i_am_on_BNY_Mellon_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/home/mahbub/WebDrivers/chromedriver_linux64/chromedriver");
	    driver = new ChromeDriver();
	    driver.get("https://www.bnymellon.com/");
	    Thread.sleep(4000);
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	}

	@When("^I click on contact$")
	public void i_click_on_contact() throws Throwable {
		driver.findElement(By.linkText("Contact")).click();
		WebElement slct_drpdwn = driver.findElement(By.id("topic_selector"));
		Select se_category = new Select(slct_drpdwn);
		se_category.selectByVisibleText("Careers");
		WebElement drp_dwn2 = driver.findElement(By.name("topic_selector_careers"));
		Select sub_category = new Select(drp_dwn2);
		sub_category.selectByVisibleText("Forgot username/password");
	}

	@When("^click on “clicking here”$")
	public void click_on_clicking_here() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"topics-form\"]/ul/li[3]/a")).click();
		driver.findElement(By.id("input-question")).sendKeys("I am a QAE.");
		driver.findElement(By.xpath("//*[@id=\"form-question\"]/div[2]/div[2]/a")).click();
		driver.findElement(By.name("Phone")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id=\"phone-ul\"]/div[2]/a")).click();
		
	}

	@When("^put my name, phone number, complaint employee name and click submit$")
	public void put_my_name_phone_number_complaint_employee_name_and_click_submit() throws Throwable {
		driver.findElement(By.name("FirstName")).sendKeys("Name");
		driver.findElement(By.name("LastName")).sendKeys("l_Name");
		driver.findElement(By.name("Email")).sendKeys("a1b1c1@gmail.com");
		driver.quit();
	  
	}

	/*@Then("^I see complain submitted successfully$")
	public void i_see_complain_submitted_successfully() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"form-your-info\"]/div[2]/div[6]/a")).click();
	    driver.close();*/
	}

