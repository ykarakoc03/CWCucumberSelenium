package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstStepDefinition {

    @Given("ilk feature icin cucumber indirdim")
    public void ilk_feature_icin_cucumber_indirdim() {
        System.out.println("Given step i calısti");

    }
    @When("seneryomu calistirdigimda")
    public void seneryomu_calistirdigimda() {
        System.out.println("When step i calısti");

    }
    @Then("seneryomun calistigini konsolda gormeliyim")
    public void seneryomun_calistigini_konsolda_gormeliyim() {
        System.out.println("Then step i calısti");

    }
}
