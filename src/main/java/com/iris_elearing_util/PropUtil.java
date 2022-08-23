package com.iris_elearing_util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropUtil {
	public static String getValue(String filePath , String key) {
		FileInputStream fis = null;
		try {
			 fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			System.err.println("File not Found: "+filePath);
		}
		
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			System.err.println("Unable to load properties file: "+filePath);
		}
		return prop.getProperty(key);
	}
	
	/**
	 * This method can be used on OR.properties file only.
	 * @param key for which we want the locator
	 * @return the locator value in the form of {@code String}
	 */
	public String getEnvDetails(String key) {
		String baseDir = System.getProperty("user.dir");//Current Working Directory
		return getValue(baseDir+"/src/main/resources/Environment.properties", key);
	}
	
}
