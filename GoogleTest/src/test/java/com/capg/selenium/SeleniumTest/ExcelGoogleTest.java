package com.capg.selenium.SeleniumTest;

import java.io.FileInputStream;

import java.io.InputStream;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExcelGoogleTest {
	Logger logger = Logger.getLogger(App.class.getName());
	WebDriver driver;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "D:\\Srinivas\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void gitHubTest() {

		try {
			i_have_google_account();
			username_and_password_matches();
			redirect_to_google_account_home_page();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Given("^I have google account$")
	public void i_have_google_account() {
		driver.get("https://github.com/login");
		String title = driver.getTitle();
		if (title.equals("Sign in to GitHub · GitHub")) {
			logger.info("sign in");
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("^Username and password matches$")
	public void username_and_password_matches() throws Throwable {
		/*
		 * driver.findElement(By.id("login_field")).sendKeys("SailajaBatchu");
		 * driver.findElement(By.name("password")).sendKeys("sailaja@12");
		 * logger.info("Login done");
		 */

		InputStream ExcelFileToRead = new FileInputStream("D:/Book1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead);
		XSSFWorkbook test = new XSSFWorkbook();
		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow row;
		XSSFCell cell;

		int rowCount = sheet.getLastRowNum();
		logger.info(rowCount);
		for (int i = 0; i <= rowCount; i++) {
			logger.info(i);
			String un = sheet.getRow(i).getCell(0).getStringCellValue();
			String pw = sheet.getRow(i).getCell(1).getStringCellValue();
			logger.info(un);
			logger.info(pw);
			if (un.equals("SailajaBatchu")) {
				if (pw.equals("sailaja@12")) {
					driver.findElement(By.id("login_field")).sendKeys(un);
					driver.findElement(By.name("password")).sendKeys(pw);

					break;
				}
			}
			
		}
	}

	@Then("^Redirect to google account home page$")
	public void redirect_to_google_account_home_page() {

		driver.findElement(By.name("commit")).click();
		logger.info("Excel Done");
	}

	@After
	public void closeDriver() {
		driver.close();
	}

}
