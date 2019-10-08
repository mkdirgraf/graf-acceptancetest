package common.pages;

import org.junit.FixMethodOrder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
    public WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "tab-flight-tab-hp")
    public WebElement flightButton;

    @FindBy(id = "package-origin-hp-package")
    public WebElement originInput;

    @FindBy(id = "package-destination-hp-package")
    public WebElement destinationInput;

    @FindBy(id = "package-departing-hp-package")
    public WebElement departingtime;

    @FindBy(id = "package-returning-hp-package")
    public WebElement returning;

    @FindBy(xpath = "(//button[@class='trigger-utility menu-trigger btn-utility btn-secondary dropdown-toggle theme-standard pin-left menu-arrow gcw-component gcw-traveler-amount-select gcw-component-initialized'])[2]")
    public WebElement travelers;

    @FindBy(id = "package-advanced-preferred-class-hp-package")
    public WebElement PreferredClassDropDown;


    public void setOrigin(String origin) {
        originInput.sendKeys(origin);
    }


    public void setDestination(String destination) {
        destinationInput.sendKeys(destination);
    }

    public void setDate(String departTime) {
        departingtime.sendKeys(departTime);
    }

    public void setReturningTime(String returningTime) {
        returning.sendKeys(returningTime);
    }

    public void selectClass(String className) {
        Select select = new Select(PreferredClassDropDown);
        select.selectByVisibleText(className);
    }

}