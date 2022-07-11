package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.Login;
import tasks.OpenUp;

public class utestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^Que Juan quiere aprender mas sobre el testing$")
    public void queJuanQuiereAprenderMasSobreElTesting() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage());
    }


    @When("^El acceda a la pagina y se pueda registrar$")
    public void elAccedaALaPaginaYSePuedaRegistrar() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("Juan").attemptsTo(Login.onThePage());
    }

    @Then("^El podra ver un titulo de bienvenida (.*)$")
    public void elPodraVerUnTituloDeBienvenidaWelcomeToTheWorldSLargestCommunityOfFreelanceSoftwareTesters(String question) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}
