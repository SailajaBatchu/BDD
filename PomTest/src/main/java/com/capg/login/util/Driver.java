package com.capg.login.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	WebDriver driver;
	
	public void startDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Srinivas\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public WebDriver getDriver() {
		driver.get("http://localhost:8081/PomPractice/LoginForm.html");
		return driver;
	}
}
