package SpringBoot.SpringBoot.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FindPage {
    private SelenideElement findThisSeries = $(By.cssSelector("#findThisSeries"));
    private SelenideElement findThisNumber = $(By.cssSelector("#findThisNumber"));

    public void writeFindThisSeries(String text) {
        this.findThisSeries.val(text);
    }

    public void writeFindThisNumber(String text) {
        this.findThisNumber.val(text);
    }
}
