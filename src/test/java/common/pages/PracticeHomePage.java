package common.pages;

import common.utils.DriverUtils;
import common.utils.LoadableComponents;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;

import static org.junit.Assert.assertTrue;

public class PracticeHomePage extends LoadableComponents<PracticeHomePage> {

    private WebDriver driver;

    public PracticeHomePage() {
        this.driver = DriverUtils.getDriver();
    }

    @FindBy(xpath = "//h1[contains(text(),'Practice Page')]")
    public WebElement practicePage;

    @FindBy(xpath = "(//a[@class='fedora-navbar-link navbar-link'])[1]")
    public WebElement practiceButton;

    @FindBy(xpath = "//a[contains(text(),'Login')]")
    public WebElement loginButton;

    @FindBy(xpath = "//a[contains(text(),'Sign Up')]")
    public WebElement signUpButton;

    @FindBy(xpath = "//legend[.='Radio Button Example']")
    public WebElement radioButtonText;

    @FindBy(xpath = "//label[@for='bmw'][1]")
    public WebElement bmwRadioText;

    @FindBy(id = "bmwradio")
    public WebElement bmwRadioButton;

    @FindBy(id = "benzradio")
    public WebElement benzRadioButton;

    @FindBy(id = "hondaradio")
    public WebElement hondaRadioButton;

    @FindBy(id = "carselect")
    public WebElement selectCar;

    public void areRadioButtonClickable() {
        List<WebElement> radioButtons = Arrays.asList(bmwRadioButton, benzRadioButton, hondaRadioButton);
        for (int i = 0; i < radioButtons.size(); i++) {
            try {
                System.out.println("Clicking on " + radioButtons.get(i).getText());
                radioButtons.get(i).click();
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println(radioButtons.get(i).getText() + " is not clickable");
                e.printStackTrace();
            }
        }

    }

    public boolean areRadioButtonsDisplayed() {
        List<WebElement> radioButtons = Arrays.asList(bmwRadioButton, benzRadioButton, hondaRadioButton);
        for (WebElement icons : radioButtons) {
            if (!icons.isDisplayed()) {
                System.out.println(icons + " is not displayed");
                return false;
            }
        }
        return true;
    }

    public List<String> getAllSelectOptions() {
        List<WebElement> allOptions = new LinkedList<>();
        allOptions.addAll(new Select(selectCar).getOptions());
        List<String> listOfElements = new ArrayList<>();
        allOptions.forEach(element -> listOfElements.add(element.getText()));
        return listOfElements;
    }


    @Override
    protected void isLoaded() throws Error {
        if (Objects.isNull(practicePage)) {
            throw new Error();
        }
        try {
            new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(practicePage));
            assertTrue("Practice Pate is not available", practicePage.isDisplayed());
        } catch (NoSuchElementException e) {
            Assert.fail("Practice page is not displayed");
            e.printStackTrace();
        }
    }

    @Override
    protected void load() {
        PageFactory.initElements(driver, this);
    }

}
