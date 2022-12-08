package com.training.utilities;

import static com.training.utilities.Contants.APPLICATION_PROPERTIES;
import static com.training.utilities.Contants.USER_DIR;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonUtilities {
	public String getApplicationProperty(String key ) throws IOException {
		
		String sPath = USER_DIR +File.separator+APPLICATION_PROPERTIES;
		FileInputStream fileinput = new FileInputStream(sPath);
		Properties prop = new Properties ();
		prop.load(fileinput);
		String value  =prop.getProperty(key);
		return value;
		}
}
