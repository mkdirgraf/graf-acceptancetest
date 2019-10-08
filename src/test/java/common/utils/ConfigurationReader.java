package common.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;
    private static final String PATH = "src/test/resources/configuration/";

    public static String getPropertyKey(String resourceName, String keyName) {

        try {
            FileInputStream inputStream = new FileInputStream(PATH + resourceName + ".properties");
            properties = new Properties();
            properties.load(inputStream);
            inputStream.close();

        } catch (Exception e) {
            throw new RuntimeException("Following File was not found");
        }

        return properties.getProperty(keyName);

    }


}
