package steps;

import SpringBoot.SpringBoot.pages.BasicPage;
import io.cucumber.java.en.Then;

public class BasicPageStep {
    BasicPage basicPage = new BasicPage();

    @Then("Click {string} button id")
    public void clickButtonId(String arg0) {
        basicPage.clickButtonId(arg0);
    }

    @Then("Click {string} a value")
    public void clickButtonValue(String arg0) {
        basicPage.clickButtonValue(arg0);
    }

    @Then("Click {string} input value")
    public void clickInputValue(String arg0) {
        basicPage.clickInputValue(arg0);
    }

    @Then("Div {string} id visible")
    public void divIdVisible(String arg0) {
        basicPage.divIdVisible(arg0);
    }

    @Then("Click {string} submit button")
    public void clickSubmit(String arg0) {
        basicPage.clickSubmit(arg0);
    }

    @Then("Exit {string} visible")
    public void exitVisible(String arg0) {
        basicPage.exitVisible(arg0);
    }

    @Then("Exit {string} not visible")
    public void exitNotVisible(String arg0) {
        basicPage.exitNotVisible(arg0);
    }

    @Then("Input {string} visible")
    public void inputVisible(String arg0) {
        basicPage.inputVisible(arg0);
    }

    @Then("Input {string} not visible")
    public void inputNotVisible(String arg0) {
        basicPage.inputNotVisible(arg0);
    }

    @Then("Home {string} visible")
    public void homeVisible(String arg0) {
        basicPage.homeVisible(arg0);
    }

    @Then("Input {string} value visible")
    public void inputValueVisible(String arg0) {
        basicPage.inputValueVisible(arg0);
    }
}
