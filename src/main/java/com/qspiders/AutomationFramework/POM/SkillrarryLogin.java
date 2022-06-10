package com.qspiders.AutomationFramework.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qspiders.AutomationFramework.Generic.BaseClass;
import com.qspiders.AutomationFramework.Generic.WebDriverUtil;

public class SkillrarryLogin  extends WebDriverUtil{

	@FindBy(id="email")
	private WebElement userName;

	@FindBy(id="password")
	private WebElement password;

	@FindBy(name="login")
	private WebElement login;

//	public SkillrarryLogin() {
//		super(driver);
//	}

	public SkillrarryLogin(WebDriver driver) {
		//super(driver);
		PageFactory.initElements(driver, this);
	}

	public void enterEmail(String un) {
		enterText(userName, un);
		//userName.sendKeys(un);
	}
	public void enterPasssword(String pw) {
		enterText(password, pw);
		//password.sendKeys(pw);
	}
	public void clickLogin() {
		clickOnElement(login);
		//login.click();
	}
}
