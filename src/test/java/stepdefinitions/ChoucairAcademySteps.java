package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademySteps {

    @Given("that {string} wants to learn automation at the Academy Choucair")
    public void thatWantsToLearnAutomationAtTheAcademyChoucair(String string) {
        OnStage.setTheStage(new OnlineCast());
    }
    @When("he searches for the course {string} on the choucair academy platform")
    public void heSearchesForTheCourseOnTheChoucairAcademyPlatform(String string) {
    }
    @Then("he finds the course called {string}")
    public void heFindsTheCourseCalled(String string) {
    }
}
