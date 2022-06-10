package com.qspiders.AutomationFramework.Generic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtil {

	public static WebDriver driver;
	
//	public WebDriverUtil(WebDriver driver) {
//		this.driver = driver;
//	}

	public void dropdownSelectByVisibleText(WebElement element , String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public void mouseHower(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public void mouseDoubleClick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}

	public void switchToFrame() {
		driver.switchTo().frame(0);
	}

	public void switchToDefaultFrame() {
		driver.switchTo().parentFrame();
	}

	public void alertPoPUp() {
		driver.switchTo().alert().accept();
	}
	public void switchTabs() {
		Set<String> window = driver.getWindowHandles();
		for (String wb : window) {
			driver.switchTo().window(wb);
		}
	}
	
	public void enterText(By userName, String text) {
		driver.findElement(userName).sendKeys(text);
	}
	
	public void clickOnElement(By locator) {
		driver.findElement(locator).click();
	}
	
	public void enterText(WebElement userName, String text) {
		userName.sendKeys(text);
	}
	public void clickOnElement(WebElement locator) {
		(locator).click();
	}
}
