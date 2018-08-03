package com.capg.selenium.SeleniumTest;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
WebDriver driver;
	
	Logger logger = Logger.getLogger(App.class.getName());
	@Test
	public void Example() {
		System.setProperty("webdriver.chrome.driver", "D:\\Srinivas\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("scooty");
		driver.findElement(By.className("nav-input")).click();
		/*Alert alert=driver.switchTo().alert();
		logger.info(alert.getText());
		alert.accept();*/
		//logger.info("Done");
		//driver.close();
	}
}
