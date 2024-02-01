package com.reusable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class OperationsProperties {
	public static Properties config=new Properties();
	public static FileInputStream fis;
	
	public static String getProperty(String key) {
		String path="C:\\Users\\Raviraj\\eclipse-workspace\\Framework4\\src\\test\\resources\\configuration.properties";
		try {
			fis=new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			config.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return config.getProperty(key);
	}

}
