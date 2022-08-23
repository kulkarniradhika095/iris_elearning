package com.iris_elearing_util;

public class Environment {
	private static String filePathEnv = "/src/main/resources/Environment.properties";
	public static String URL;
	public static String URLFACEBOOKPAGE;
	public static String URLGOOGLEPAGE;
	
	
	
	
	
	
	
	static {
		PropUtil prop = new PropUtil();
		String baseDir = System.getProperty("user.dir");
		URL = prop.getValue(baseDir+filePathEnv, "site_url_env");
		URLFACEBOOKPAGE = prop.getValue(baseDir+filePathEnv, "switched_to_fb");
		URLGOOGLEPAGE = prop.getValue(baseDir+filePathEnv, "switched_to_google");	
		
	}
}
