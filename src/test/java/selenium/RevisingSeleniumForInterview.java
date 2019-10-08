package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.w3c.dom.html.HTMLTableElement;

import static org.testng.Assert.*;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class RevisingSeleniumForInterview {

    public WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Software/chromdriver/chromedriver.exe");
        ChromeOptions ch=new ChromeOptions();
        ch.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
        driver = new ChromeDriver(ch);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://learn.letskodeit.com/p/practice");
    }

    @Test(priority = 0)
    public void test1() {
        WebElement selectId = driver.findElement(By.id("multiple-select-example"));
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(selectId));
        Select select = new Select(selectId);
        List<WebElement> allOptions = new LinkedList<>();
        allOptions.addAll(select.getOptions());
        allOptions.forEach(e -> System.out.println("option is " + e.getText()));
        for (int i = 0; i < allOptions.size(); i++) {
            select.selectByVisibleText(allOptions.get(i).getText());
        }

    }

    @Test(priority = 1)
    public void switchToAnotherWindow() {
        WebElement openWindow = driver.findElement(By.xpath("//button[@id='openwindow']"));
        Actions actions = new Actions(driver);
        String currentWindow = driver.getWindowHandle();
        System.out.println(currentWindow + " is the current window");
        actions.moveToElement(openWindow).click().perform();
        Set<String> allWindows = driver.getWindowHandles();
        allWindows.forEach(e -> System.out.println(e));
        Iterator<String> it = allWindows.iterator();
        String parentWindow = it.next();
        String childWindow = it.next();
        System.out.println(driver.getCurrentUrl());
        String cc = driver.getWindowHandle();
        System.out.println(cc);
        System.out.println(driver.switchTo().window(childWindow).getTitle());
        driver.switchTo().window(parentWindow);

    }

    @Test(priority = 2)
    public void resolveAlert() throws Throwable {
        WebElement inputText = driver.findElement(By.xpath("//input[@id='name']"));
        WebElement alertButton = driver.findElement(By.id("alertbtn"));
        inputText.sendKeys("Tima");
        alertButton.click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        WebElement confirtButton = driver.findElement(By.id("confirmbtn"));
        Thread.sleep(2000);
        confirtButton.click();
        Alert al2 = driver.switchTo().alert();
        new WebDriverWait(driver,10).until(ExpectedConditions.alertIsPresent());
        al2.dismiss();
    }

    @Test(priority = 3)
    public void workingWithTable() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
        WebElement tabletext = driver.findElement(By.xpath("//legend[.='Web Table Example']"));
        assertTrue(tabletext.isDisplayed(), "Table text is not displayed");
        //td--->number of columns
        //tr-number of rows
        //th-number of table headers
        List<WebElement> allRows = driver.findElements(By.xpath("//table/tbody/tr/th"));
        System.out.println(allRows.size());
        allRows.forEach(e -> System.out.println(e.getText()));
        String[] str = new String[]{"Author", "Course", "Price"};
        for (int i = 0; i < allRows.size(); i++) {
            for (int j = 0; j < str.length; j++) {
                if (allRows.get(i).getText().equals(str[i])) {
                    System.out.println(allRows.get(i).getText() + " exists in array");
                } else {
                    System.out.println(allRows.get(i).getText() + " doesn't exist in array of expected elements");
                }
            }

        }

        //get all the first column data
        List<WebElement> firstColumn = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
        for (int i = 0; i < firstColumn.size(); i++) {
            System.out.println(firstColumn.get(i).getText());
        }

    }

    @Test(priority = 4)
    public void visibility() {
        WebElement hide = driver.findElement(By.id("hide-textbox"));
        WebElement show = driver.findElement(By.id("show-textbox"));
        WebElement textbox=driver.findElement(By.xpath("//input[@id='displayed-text']"));
        hide.click();
        assertFalse(textbox.isDisplayed());

    }

}
