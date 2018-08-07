package com.capg.login.pombean;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginBean {

	@FindBy(how=How.NAME, name="uname")
	private WebElement uname;
	
	@FindBy(how=How.NAME, name="pwd")
	private WebElement pwd;
	
	@FindBy(how=How.NAME, name="Submit")
	private WebElement Submit;
	
	@FindBy(how=How.NAME, name="Cancel")
	private WebElement Cancel;

	public String getUname() {
		return uname.getAttribute("value");
	}

	public void setUname(String uname) {
		this.uname.sendKeys(uname);;
	}

	public String getPwd() {
		return pwd.getAttribute("value");
	}

	public void setPwd(String pwd) {
		this.pwd.sendKeys("value");
	}

	/*public WebElement getSubmit() {
		return Submit;
	}

	public void setSubmit(WebElement submit) {
		Submit = submit;
	}

	public WebElement getCancel() {
		return Cancel;
	}

	public void setCancel(WebElement cancel) {
		Cancel = cancel;
	}*/
	public void clickNextPage() {
		Submit.click();
	}
	
}
