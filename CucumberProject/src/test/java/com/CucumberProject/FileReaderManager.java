package com.CucumberProject;

import java.io.IOException;

public class FileReaderManager {

	// private constructor should be must for hiding the important data

	private FileReaderManager() {

	}

	// Current class static
	public static FileReaderManager getInstanceFR() {
		FileReaderManager fr = new FileReaderManager();
		return fr;
	}

	// Another class methods should be no static

	public Config_Reader getInstance_CR() throws IOException {
		Config_Reader cr = new Config_Reader();
		return cr;
	}

}
