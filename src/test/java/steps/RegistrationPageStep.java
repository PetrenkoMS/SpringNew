package steps;

import SpringBoot.SpringBoot.pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;

import java.util.List;

import static config.config.param;

public class RegistrationPageStep {

    RegistrationPage registrationPage = new RegistrationPage();

    @Then("Input new login id")
    public void inputNewLoginId() {
        registrationPage.writeNewLogin(param[0]);
    }

    @Then("Input new password id")
    public void inputNewPasswordId() {
        registrationPage.writeNewPassword(param[1]);
    }

    @Then("Input new name id")
    public void inputNewNameId() {
        registrationPage.writeNewName(param[2]);
    }

    @Then("Input new second-name id")
    public void inputNewSecondNameId() {
        registrationPage.writeNewSecondName(param[3]);
    }

    @Then("Input new gender id")
    public void inputNewGenderId() {
        registrationPage.writeGender(param[4]);
    }

    @Then("Input new age id")
    public void inputNewAgeId() {
        registrationPage.writeAge(Integer.parseInt(param[5]));
    }

    @Then("Input new series passport id")
    public void inputNewSeriesPassportId() {
        registrationPage.writeSeriesPassport(param[6]);
    }

    @Then("Input new number passport id")
    public void inputNewNumberPassportId() {
        registrationPage.writeNumberPassport(param[7]);
    }

    @Then("Input new telephone id")
    public void inputNewTelephoneId() {
        registrationPage.writeTelephone(param[8]);
    }

    @Then("Input new about id")
    public void inputNewAboutId() {
        registrationPage.writeAbout(param[9]);
    }

}
