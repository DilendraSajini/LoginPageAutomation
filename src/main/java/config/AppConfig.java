package config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfig {

	private static final String PROPERTIES_FILE = "application.properties";

	private AppConfig() {
	}

	public static Properties loadProperties() {
		Properties properties = new Properties();
		try (InputStream inputStream = AppConfig.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE)) {
			if (inputStream != null) {
				properties.load(inputStream);
			} else {
				throw new IOException("Unable to load properties file: " + PROPERTIES_FILE);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}
}
