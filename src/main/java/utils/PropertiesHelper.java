package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHelper {
    static Properties props = new Properties();

    public static String getUsername() throws IOException {
        props.load(new FileInputStream("src/main/resources/user.properties"));
        return props.getProperty("user.username");
    }

    public static String getPassword() throws IOException {
        props.load(new FileInputStream("src/main/resources/user.properties"));
        return props.getProperty("user.password");
    }

    public static String getUrl() throws IOException {
        props.load(new FileInputStream("src/main/resources/user.properties"));
        return props.getProperty("url");
    }

}
