package common.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ResourceUtils {

    public static final String FILE_PATH = "src/test/resources/configuration/";
    public static final String YML_MAPPER = "src/test/resources/topics/";
    public static Properties properties;

    public static void readYaml() {

    }

    public static String getKey(String keyName, String fileName) {
        try {
            FileInputStream inputStream = new FileInputStream(FILE_PATH + fileName+".properties");
            properties = new Properties();
            properties.load(inputStream);
            inputStream.close();
        } catch (Exception e) {
            System.out.println(fileName + " doesn't exist, or file path is incorrect");
            e.printStackTrace();
        }
        return properties.getProperty(keyName);
    }


}
