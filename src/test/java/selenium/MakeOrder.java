package selenium;

import common.pages.HomePage;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MakeOrder {

    public static WebDriver driver;
    static HomePage homePage;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/opt/chromedriver74/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @Test
    public void test1()throws Throwable {
        driver.navigate().to("https://www.expedia.com/?afmcid=nav.exp.mis.expidia");
        homePage.setOrigin("Chicago");
        Thread.sleep(2000);
        homePage.setDestination("New York");
        homePage.setDate("07/22/2019");
        homePage.setReturningTime("07/26/2019");
        homePage.selectClass("Business");
    }

}
