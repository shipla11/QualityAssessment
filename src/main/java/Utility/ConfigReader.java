package Utility;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

	static Properties properties;
	public static String browser;
	public static  String url;
	public static String testDataPath;
	public static String configpath ="src\\main\\resources\\Config.properties";

	public ConfigReader() {
		BufferedReader reader;
		try {
				reader = new BufferedReader(new FileReader(configpath));
				properties = new Properties();
				properties.load(reader);
			getBrowser();
			getURL();
			getExcelDataFilePath();
		} catch (Exception e) {
			System.out.println("File not found:" + e.getMessage());
		}
	}

	public String getBrowser() {
		browser = properties.getProperty("browser");
		System.out.println(browser);
		if (browser != null) {
			return browser;
		}
		else {
			throw new RuntimeException("Browser name is not specified in the Configuration.properties file.");
		}
	}

	public String getURL() {
		url = properties.getProperty("url");
		if (url != null) {
			return url;
		} else {
			throw new RuntimeException("url is not specified in the Configuration.properties file.");
		}
	}

	public String getExcelDataFilePath() {
		testDataPath = properties.getProperty("testDataPath");
		System.out.println(testDataPath);
		if (testDataPath != null) {
			return testDataPath;
		}
		else {
			throw new RuntimeException("testDataPath is not specified in the Configuration.properties file.");
		}
	}
}
