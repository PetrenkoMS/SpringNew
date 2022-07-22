package SpringBoot.SpringBoot.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasicPage {
    public void clickButtonId(String text) {
        $(By.id(text)).click();
    }

    public void clickButtonValue(String text) {
        $(By.xpath("//a[@value='" + text + "']")).click();
    }

    public void clickInputValue(String text) {
        $(By.xpath("//input[@value='" + text + "']")).click();
    }

    public void clickSubmit(String text) {
        $(By.xpath("//button[@type='" + text +"']")).click();
    }

    public void exitVisible(String text) {
//        "".equals("ExpectedString");
        $(By.xpath("//a[@value='" + text + "']")).shouldBe(Condition.visible);
    }

    public void exitNotVisible(String text) {
        $(By.xpath("//a[@value='" + text + "']")).shouldBe(Condition.hidden);
    }

    public void inputVisible(String text) {
        $(By.xpath("//input[@value='" + text + "']")).shouldBe(Condition.visible);
    }

    public void inputNotVisible(String text) {
        $(By.xpath("//input[@value='" + text + "']")).shouldBe(Condition.hidden);
    }

    public void homeVisible(String text) {
        $(By.id(text)).shouldBe(Condition.visible);
    }

    public void inputValueVisible(String text) {
        $(By.xpath("//input[@value='" + text + "']")).shouldBe(Condition.visible);
    }

    public void divIdVisible(String text) {
        $(By.id(text)).shouldBe(Condition.visible);
    }

    public void idVisible(String text) {
        $(By.id(text)).shouldBe(Condition.visible);
    }

    public void trNameVisible(String text) {
        $(By.name(text)).shouldBe(Condition.visible);
    }

    public void trNameNotVisible(String text) {
        $(By.name(text)).shouldBe(Condition.hidden);
    }
}
