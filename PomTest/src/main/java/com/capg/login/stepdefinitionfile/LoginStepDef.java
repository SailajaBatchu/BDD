package com.capg.login.stepdefinitionfile;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import com.capg.login.pombean.LoginBean;
import com.capg.login.util.Driver;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDef {
	
	WebDriver driver;
	LoginBean loginbean;
	Driver util=new Driver();
	
	@Before
	public void init() {
		util.startDriver();
	}
	
	
	@Given("^I have a login form$")
	public void i_have_a_login_form() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver = util.getDriver();
		
		loginbean = new LoginBean();
		PageFactory.initElements(driver, loginbean);

	}

	@When("^Username and password matches$")
	public void username_and_password_matches() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		/*driver.findElement(By.name("uname")).sendKeys("Sailaja");
		driver.findElement(By.name("pwd")).sendKeys("sailaja");*/
		loginbean.setUname("Sailaja");
		loginbean.setPwd("sailu");
		
	}

	@Then("^Login Success$")
	public void login_Success() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 loginbean.clickNextPage();
	}

	/*@After
	public void closeDriver() {
		driver.close();
	}*/
}
