package step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmptyStaeps {
    @When("^sout my name$")
    public void soutMyName() {
        System.out.println("Vasiliy");
    }

    @And("sout my family")
    public void soutMyFamily() {
        System.out.println("Shevchenko");
    }

    @Then("sout my age")
    public void soutMyAge() {
        System.out.println(34);
    }

    @When("sout my name {string}")
    public void soutMyName(String name) {
        System.out.println("my name is "+name);
    }

    @And("sout my family {string} and family my wife {string}")
    public void soutMyFamilyAndFamilyMyWife(String familyH, String familyW) {
        System.out.println(familyH+" "+familyW);
    }
}
