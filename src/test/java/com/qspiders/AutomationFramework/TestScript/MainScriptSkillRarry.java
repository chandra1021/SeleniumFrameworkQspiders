package com.qspiders.AutomationFramework.TestScript;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.qspiders.AutomationFramework.Generic.BaseClass;
import com.qspiders.AutomationFramework.POM.SkillrarryLogin;

public class MainScriptSkillRarry extends BaseClass  {

	
	@Test
	public static void Test1() throws FileNotFoundException, IOException {
		SkillrarryLogin sk = new SkillrarryLogin(driver);
		sk.enterEmail("admin");
		sk.enterPasssword("admin");
		sk.clickLogin();
	}
}
