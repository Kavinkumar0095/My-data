package com.CucumberProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config_Reader {

	public static Properties p;

	// When we invoke any method, it will invoke the in contructor

	public Config_Reader() throws IOException {
		File f = new File(
				"C:\\Users\\Kavin\\eclipse-mine\\CucumberProject\\src\\test\\java\\com\\CucumberProject\\configuration.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);

	}

	public String getBrowser() {
		String browser = p.getProperty("Browser");
		return browser;

	}

	public String getUrl() {
		String Url = p.getProperty("Url");
		return Url;
	}

	public String getUsername() {
		String Username = p.getProperty("Username");
		return Username;
	}

	public String getPassword() {
		String Password = p.getProperty("Password");
		return Password;

	}

}
