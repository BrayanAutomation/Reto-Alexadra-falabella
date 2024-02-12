package co.com.falabella.automationWeb.AlexandraImmigrationLaw.stepsdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class SetUp {

    @Managed
    public WebDriver browser;

    @Before
    public void setUp() {
        setTheStage(Cast.ofStandardActors());
        theActorCalled("Cliente Falabella");
        theActorInTheSpotlight().can(BrowseTheWeb.with(browser)).wasAbleTo(Open.url("https://www.falabella.com.co/falabella-co"));
    }

}
