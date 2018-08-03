package com.capg.selenium.SeleniumTest;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IConnectTitile {

	WebDriver driver;
	static Logger logger = Logger.getLogger(AlertExample.class.getName());
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "D:\\Srinivas\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://signincorp.capgemini.com");
		if(driver.getTitle().equals("OpenAM (Login)")) {
			logger.info("title matched");
		} else {
			logger.info("Title is not matched");
		}
	}

}
