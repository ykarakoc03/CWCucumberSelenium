package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GoogleSearchPage;
import utilities.Driver;

public class Homework01 {
    @Given("Kullanici google a gider")
    public void kullaniciGoogleAGider() {
        Driver.getDriver().get("https://www.google.com/");
    }

    @When("Cucumber i aratir")
    public void cucumberIAratir() {
        GoogleSearchPage sp = new GoogleSearchPage(Driver.getDriver());
        sp.searchFor("Cucumber");
    }

    @Then("Title da cucumber yazildigini dogrular")
    public void titleDaCucumberYazildiginiDogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Cucumber"));
        Driver.closeDriver();
    }
}
