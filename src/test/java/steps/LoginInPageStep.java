package steps;

import SpringBoot.SpringBoot.pages.LoginPage;
import io.cucumber.java.en.Then;

import static config.config.param;

public class LoginInPageStep {
    LoginPage loginPage = new LoginPage();

    @Then("Input login")
    public void inputLogin() {
        loginPage.inputLogin(param[0]);
    }

    @Then("Input password")
    public void inputPassword() {
        loginPage.inputPassword(param[1]);
    }
}
