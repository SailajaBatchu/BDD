package com.capg.selenium.SeleniumTest;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;*/

public class PizzaForm {
	static Logger logger = Logger.getLogger(PizzaForm.class.getName());
	WebDriver driver;
	//creating a reference variable for the interface
	@Test
	public void ExampleForAlert() {
		System.setProperty("webdriver.chrome.driver","D:\\Srinivas\\Selenium\\chromedriver.exe");//giving the path for chrome driver
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://localhost:8081/Selenium/pitzza.html");
		WebElement element=driver.findElement(By.id("sel"));
		Select se=new Select(element);
		se.selectByVisibleText("Tomato");
		se.selectByVisibleText("Panner");
		List<WebElement> allSelectedOptions=se.getAllSelectedOptions();
		for(WebElement webElement:allSelectedOptions)
		{
			logger.info(""+webElement.getText());
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("done");
		//driver.close();
		}

}
