package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GoogleSearchPage;
import utilities.Driver;

public class Homework02 {
    @Given("google sayfasi acilir")
    public void googleSayfasiAcilir() {
        Driver.getDriver().get("https://www.google.com/");
    }
    @When("selenium i aratir")
    public void seleniumIAratir() {
        GoogleSearchPage sp= new GoogleSearchPage(Driver.getDriver());
        sp.searchFor("selenium");
    }

    @Then("Title da selenium yazildigini dogrular")
    public void titleDaSeleniumYazildiginiDogrular() {
    }
}
