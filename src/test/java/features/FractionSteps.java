package features;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FractionSteps {

    // regex parameter
    @Given("^the current result is (\\d+)$")
    public void the_current_result_is(int arg1) throws Throwable {
    }

    // cucumber expression (3.x+) parameter
    @When("we add {int}")
    public void we_add(int arg1) throws Throwable {
    }

    @Then("^the result is (\\d+)$")
    public void the_result_is(int arg1) throws Throwable {
        throw new PendingException();
    }
}
