package frontenddemo.features.practicepagedemo.automation.ui;

import common.pages.PracticeHomePage;
import io.cucumber.java.en.Given;

public class PracticePageDemoSteps {
    public PracticeHomePage practiceHomePage;

    @Given("user navigates to Practice Page")
    public void user_navigates_to_Practice_Page() {
        practiceHomePage=new PracticeHomePage();
        practiceHomePage.practicePage.isDisplayed();
    }

    @Given("verify that Practice Page text and button are displayed")
    public void verify_that_Practice_Page_text_and_button_are_displayed() {

    }

    @Given("validate all the radio buttons are displayed and clickable")
    public void validate_all_the_radio_buttons_are_displayed_and_clickable() {

    }
}
