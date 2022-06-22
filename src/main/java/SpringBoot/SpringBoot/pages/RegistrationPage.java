package SpringBoot.SpringBoot.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    private SelenideElement newLogin = $(By.cssSelector("#newLogin"));
    private SelenideElement newPassword = $(By.cssSelector("#newPassword"));
    private SelenideElement newName = $(By.cssSelector("#newName"));
    private SelenideElement newSecondName = $(By.cssSelector("#newSecondName"));
    private SelenideElement Gender = $(By.name("gender"));
    private SelenideElement age = $(By.cssSelector("#age"));
    private SelenideElement seriesPassport = $(By.cssSelector("#seriesPassport"));
    private SelenideElement numberPassport = $(By.cssSelector("#numberPassport"));
    private SelenideElement telephone = $(By.cssSelector("#telephone"));
    private SelenideElement about = $(By.cssSelector("#about"));

    public void writeNewLogin(String text) {
        this.newLogin.val(text);
    }

    public void writeNewPassword(String text) {
        this.newPassword.val(text);
    }

    public void writeNewName(String text) {
        this.newName.val(text);
    }

    public void writeNewSecondName(String text) {
        this.newSecondName.val(text);
    }

    public void writeGender(String text) {
        this.Gender.selectRadio(text);
    }

    public void writeAge(int text) {
        this.age.val(String.valueOf(text));
    }

    public void writeSeriesPassport(String text) {
        this.seriesPassport.val(text);
    }

    public void writeNumberPassport(String text) {
        this.numberPassport.val(text);
    }

    public void writeTelephone(String text) {
        this.telephone.val(text);
    }

    public void writeAbout(String text) {
        this.about.val(text);
    }
}
