package common.utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;

import java.util.HashMap;

public class StatefulSingleton {
    private static StatefulSingleton instance;
    private WebDriver driver = null;
    private AndroidDriver androidDriver = null;
    private final HashMap<String, Object> testData;
    private HashMap<String, LoadableComponents> pages;

    private StatefulSingleton() {
        testData = new HashMap<String, Object>();
        pages = new HashMap<String, LoadableComponents>();
    }

    public static synchronized StatefulSingleton instance() {
        if (instance == null) {
            instance = new StatefulSingleton();
        }

        return instance;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void setAndroidDriver(AndroidDriver driver) {
        this.androidDriver = driver;
    }

    public AndroidDriver getAndroidDriver() {
        return androidDriver;
    }

    public HashMap<String, Object> testData() {
        return this.testData;
    }

    public HashMap<String, LoadableComponents> pages() {
        return this.pages;
    }


}
