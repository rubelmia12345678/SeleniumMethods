package com.fb.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_setData {

	public static WebDriver driver;
	@Given("^I am on facebook login page$")
    public void i_am_on_facebook_login_page() throws Throwable {
    	System.setProperty("webdriver.chrome.driver", "/home/mahbub/WebDrivers/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();
    	driver.get("https://www.facebook.com");
    	
        
    }
	@When("^I enter my valid name and pass t(\\d+)$")
    public void i_enter_my_valid_name_tanima_and_pass_t(String userName, int userPass) throws Throwable {
        
    }

    @Then("^I souuld be able to succesfully login$")
    public void i_souuld_be_able_to_succesfully_login() throws Throwable {
        
    }//changes
}
