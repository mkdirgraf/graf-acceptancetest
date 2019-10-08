package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.text.Position;

import static org.testng.Assert.*;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SelectDemo {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Software/chromdriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://learn.letskodeit.com/p/practice");
        driver.manage().window().maximize();
    }

    @Test
    public void test1() {
        WebElement selectId = driver.findElement(By.id("carselect"));
        Select select = new Select(selectId);
        List<WebElement> allOptions = new LinkedList<>();
        List<String> stringOptions = new LinkedList<>();
        allOptions.addAll(select.getOptions());
        allOptions.forEach(e -> System.out.println(e.getText()));
        String[] expectedOptions = new String[]{"BMW", "Benz", "Honda"};
        for (int i = 0; i < allOptions.size(); i++) {
            stringOptions.add(allOptions.get(i).getText());
        }
        for (int j = 0; j < expectedOptions.length; j++) {
            assertTrue(stringOptions.contains(expectedOptions[j]), "doesn't exist" + expectedOptions[j]);
        }

        //how to select multiple options
        WebElement mulOptions = driver.findElement(By.id("multiple-select-example"));
        System.out.println(select.getFirstSelectedOption().getText() + " is the first selected option");
        //isMultiple()--->means if we can select multiple options from Select
        Select sel = new Select(mulOptions);
        assertTrue(sel.isMultiple());
        List<WebElement> multipleOptions = new LinkedList<>();
        multipleOptions.addAll(sel.getOptions());
        multipleOptions.forEach(e -> e.click());

    }

    @Test
    public void test2() {

        int height = driver.manage().window().getSize().getHeight();
        System.out.println("height is " + height);
        WebElement element = driver.findElement(By.id("carselect"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
        WebElement hoverOver = driver.findElement(By.id("mousehover"));
        WebElement top = driver.findElement(By.xpath("//a[contains(text(),'Top')]"));
        WebElement reload = driver.findElement(By.xpath("//a[contains(text(),'Reload')]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
        actions.moveToElement(hoverOver).perform();
        assertTrue(top.isDisplayed());
        assertTrue(reload.isDisplayed());
        System.out.println(hoverOver.getLocation().getY()+ " is the location");

        int secondheight = driver.manage().window().getSize().getHeight();
        System.out.println(secondheight+" is the second height");
        int contentHeight = ((Number) js.executeScript("return window.innerHeight")).intValue();
        System.out.println("javascript height "+contentHeight);
        int x=driver.manage().window().getPosition().getX();
        System.out.println(x+ " position");
    }


}
