package steps;

import SpringBoot.SpringBoot.pages.FindSomePage;
import io.cucumber.java.en.Then;

import static config.config.*;

public class FindSomePageStep {
    FindSomePage findSomePage = new FindSomePage();
    public static String selectedParameter = null;

    @Then("Choose {string} parameter")
    public void chooseParameter(String arg0) {
        selectedParameter = arg0;
        findSomePage.writeFindThisParam(arg0);
    }

    @Then("Input findThisSomeValue id")
    public void writeFindThisValue() {
        findSomePage.writeFindThisValue(paramSelectedFind.get(selectedParameter));
    }

    @Then("Input {string} id")
    public void writeFindThisValueWrong1(String arg0) {
        findSomePage.writeFindThisValue(paramSelectedFindWrong1.get(arg0));
    }

    @Then("Input {string} id2")
    public void writeFindThisValueWrong2(String arg0) {
        findSomePage.writeFindThisValue(paramSelectedFindWrong2.get(arg0));
    }
}
