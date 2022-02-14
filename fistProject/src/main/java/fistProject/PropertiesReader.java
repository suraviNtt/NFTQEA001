package fistProject;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesReader {

	public static void main(String[] args) throws Exception {
		
		String configFileLocation = System.getProperty("user.dir")+"/src/main/resources/config.properties";
		System.out.println(configFileLocation);
		
		InputStream stream = new FileInputStream(configFileLocation);
		
		Properties prop = new Properties();
		prop.load(stream);
		
		String url = prop.getProperty("url");
		String name = prop.getProperty("name");
		String password = prop.getProperty("password");
		String wait = prop.getProperty("wait");
		
		System.out.println(url);
		System.out.println(name);
		System.out.println(password);
		System.out.println(wait);
		
		OutputStream ostream = new FileOutputStream(configFileLocation);
		prop.setProperty("key", "value");
		prop.store(ostream, "update");
		
		System.out.println(prop.getProperty("key"));
		
	}
}
