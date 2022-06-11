package steps;

import SpringBoot.SpringBoot.pages.FindPage;
import io.cucumber.java.en.Then;

import static config.config.paramFind;

public class FindPageStep {
    FindPage findPage = new FindPage();

    @Then("Input findThisSeries id")
    public void findThisSeriesId() {
        findPage.writeFindThisSeries(paramFind[0]);
    }

    @Then("Input findThisNumber id")
    public void findThisNumberId() {
        findPage.writeFindThisNumber(paramFind[1]);
    }
}
