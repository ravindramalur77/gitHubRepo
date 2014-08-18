package com.mkyong.crawler.util;
 
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
 
public class FileHelper {
 
  public String getFilePathToSave() {
 
	Properties prop = new Properties();
	String filePath = "";
 
	try {
 
	  InputStream inputStream = 
	    getClass().getClassLoader().getResourceAsStream("config.properties");
 
	  prop.load(inputStream);
	  filePath = prop.getProperty("json.filepath");
 
        } catch (IOException e) {
		e.printStackTrace();
	}
 
	return filePath;
	hjfdhdjkf
 
  }
 
}
