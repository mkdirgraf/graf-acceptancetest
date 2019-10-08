package seleniumRevising;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumDemo {
    public WebDriver driver;
    public String homePageTitle = "Practice | Let's Kode It";

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://learn.letskodeit.com/p/practice");

    }

    @Test
    public void test1() {
        WebElement practicePage = driver.findElement(By.xpath("//h1[contains(text(),'Practice Page')]"));
        WebElement practiceButton = driver.findElement(By.xpath("(//a[@class='fedora-navbar-link navbar-link'])[1]"));
        WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
        WebElement signUpButton = driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]"));
        Assert.assertTrue(driver.getTitle().toString().equals(homePageTitle), "Home page title is not correct");
        Assert.assertTrue(practicePage.isDisplayed(), "Practice page test is not displayed");
        assertTrue(practiceButton.isDisplayed(), "Practice button is not displayed");
        assertTrue(signUpButton.isDisplayed(), "Sign Up button is not displayed");
        assertTrue(loginButton.isDisplayed(), "Log in Button is not displayed");

    }

    @Test
    public void checkBoxTest() throws Throwable {
        WebElement radioButtonText = driver.findElement(By.xpath("//legend[.='Radio Button Example']"));
        WebElement bmwRadioText = driver.findElement(By.xpath("//label[@for='bmw'][1]"));
        WebElement bmwRadioButton = driver.findElement(By.id("bmwradio"));
        WebElement benzRadioButton = driver.findElement(By.id("benzradio"));
        WebElement hondaRadioButton = driver.findElement(By.id("hondaradio"));
        List<WebElement> elements = new LinkedList<>();
        elements.add(bmwRadioButton);
        elements.add(benzRadioButton);
        elements.add(hondaRadioButton);
        for (int i = 0; i < elements.size(); i++) {
            try {
                elements.get(i).click();
                assertTrue(elements.get(i).isSelected(), "Following option is not selected" + elements.get(i).getText());
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void selectDemo() {
        WebElement selectLocator = driver.findElement(By.id("carselect"));
        Select select = new Select(selectLocator);
        List<WebElement> listOfOptions = new LinkedList<>();
        listOfOptions.addAll(select.getOptions());
        listOfOptions.forEach(v -> System.out.println("options are " + v.getText()));
        System.out.println(select.getFirstSelectedOption().getText());


    }


}
