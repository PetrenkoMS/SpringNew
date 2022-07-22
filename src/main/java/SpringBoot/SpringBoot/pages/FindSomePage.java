package SpringBoot.SpringBoot.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FindSomePage {
    private SelenideElement findThisParam =  $(By.id("selectParam"));
    private SelenideElement findThisValue = $(By.id("findThisUserSome"));

    public void writeFindThisParam(String text) {
        this.findThisParam.selectOptionByValue(text);
    }

    public void writeFindThisValue(String text) {
        this.findThisValue.val(text);
    }

}
