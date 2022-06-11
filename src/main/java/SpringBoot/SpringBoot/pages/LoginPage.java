package SpringBoot.SpringBoot.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    private SelenideElement loginInput = $(By.cssSelector("#username"));
    private SelenideElement passwordInput = $(By.cssSelector("#password"));

    public void inputLogin(String login) {
        this.loginInput.val(login);
    }

    public void inputPassword(String password) {
        this.passwordInput.val(password);
    }
}
