package selenium;

import org.apache.commons.lang3.builder.ToStringExclude;
import org.omg.CORBA.Any;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class IsEnabledDemo {

    public WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Software/chromdriver/chromedriver.exe");


    }

    @Test
    public void test1() {
        ChromeOptions chrome = new ChromeOptions();
        chrome.setBinary("C:/Software/chromdriver/chromedriver.exe");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setCapability("chromeOptions", chrome);
        driver = new ChromeDriver(cap);
        driver.findElement(By.id(""));

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertAll();
    }
}
