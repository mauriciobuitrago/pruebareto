package co.com.sophos.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class pruebaStepdefinitions {
    @Managed(driver = "chrome", options = "--start-maximized")
    private WebDriver hisBrowser;

@Before
public void setUp()
{
    OnStage.setTheStage(Cast.ofStandardActors());
    OnStage.theActorCalled("User");
    OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
}

    @Given("^Marco select the$")
    public void marcoSelectThe() {
    OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.google.com/"));
    }


    @When("^Add to shopping cart the product$")
    public void addToShoppingCartTheProduct() {
    }

    @Then("^Check if the product was added to the cart product$")
    public void checkIfTheProductWasAddedToTheCartProduct() {
    }


}
