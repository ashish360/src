package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesreader_util {


	public static String readProperty(String filename, String key){
		
		Properties prop = new Properties();
		
		String value= null;
		try {
            //load a properties file
 		prop.load(new FileInputStream(System.getProperty("user.dir")+"//src//configs//"+filename));

            //get the property value and print it out
 		value = prop.getProperty(key);

 	} catch (IOException ex) {
 		ex.printStackTrace();
     }
		return value;
	}
	
	
}
