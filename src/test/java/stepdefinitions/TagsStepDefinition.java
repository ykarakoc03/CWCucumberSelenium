package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagsStepDefinition {
    @Given("Smoke testi icin hazirliklar yapildi")
    public void smokeTestiIcinHazirliklarYapildi() {
    }

    @When("Smoke testi calistiginda")
    public void smokeTestiCalistiginda() {
        System.out.println("Smoke  çalıştı");
    }

    @Then("Smoke testi basarili olmali")
    public void smokeTestiBasariliOlmali() {
    }

    @Given("Regression testi icin hazirliklar yapildi")
    public void regressionTestiIcinHazirliklarYapildi() {
    }

    @When("Regression testi calistiginda")
    public void regressionTestiCalistiginda() {
        System.out.println("Regression  çalıştı");
    }

    @Then("Regression testi basarili olmali")
    public void regressionTestiBasariliOlmali() {
    }
}
