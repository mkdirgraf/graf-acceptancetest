package selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RadioCheckBox {
    WebDriver driver;
    String baseUrl = "letskodeit.teachable.com/pages/practice";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/opt/chromedriver74/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void test1() throws Throwable {
        driver.get("https://learn.letskodeit.com/p/practice");
        WebElement bmwRadio = driver.findElement(By.id("bmwradio"));
        WebElement bmwCheck = driver.findElement(By.id("bmwcheck"));
        WebElement benzCheck = driver.findElement(By.id("benzcheck"));
        WebElement hondaCheck = driver.findElement(By.id("hondacheck"));
        Thread.sleep(3000);
        bmwCheck.click();
        benzCheck.click();
        hondaCheck.click();

    }


}
