package com.qspiders.AutomationFramework.Listner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qspiders.AutomationFramework.Generic.WebDriverUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(com.qspiders.AutomationFramework.Listner.ListnerTest.class) //Package name.Class name.class
public class Demo_Listner extends WebDriverUtil{

	//public static WebDriver driver;
	
	@Test
	public void test() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.className("")).clear();
		Assert.fail();
	}
}

