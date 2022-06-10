package com.qspiders.AutomationFramework.Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property implements AutoConstant {
	
	public String getProperty(String key) throws FileNotFoundException, IOException {
		Properties p = new Properties();
		p.load(new FileInputStream(propertyFilePath));
		return p.getProperty(key);
	}
}
