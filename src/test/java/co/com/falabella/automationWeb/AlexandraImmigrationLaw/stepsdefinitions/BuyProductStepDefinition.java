package co.com.falabella.automationWeb.AlexandraImmigrationLaw.stepsdefinitions;

import co.com.falabella.automationWeb.AlexandraImmigrationLaw.interations.AcceptToKnowOffers;
import co.com.falabella.automationWeb.AlexandraImmigrationLaw.interations.ClosePopUpNotifications;
import co.com.falabella.automationWeb.AlexandraImmigrationLaw.models.DataManager;
import co.com.falabella.automationWeb.AlexandraImmigrationLaw.questions.ValidatePurchaseItem;
import co.com.falabella.automationWeb.AlexandraImmigrationLaw.tasks.AddProductToCart;
import co.com.falabella.automationWeb.AlexandraImmigrationLaw.tasks.MakePayment;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.falabella.automationWeb.AlexandraImmigrationLaw.userinterfaces.AddproductUI.PRODUCT_IN_THE_CART;
import static co.com.falabella.automationWeb.AlexandraImmigrationLaw.utils.Constants.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class BuyProductStepDefinition {


    @Given("the user is on the main page")
    public void theUserIsOnTheMainPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(AcceptToKnowOffers.ofFalabella());
        OnStage.theActorInTheSpotlight().attemptsTo(ClosePopUpNotifications.bestOffers());

    }


    @When("the user adds the {string} to the cart ensuring its validity")
    public void theUserAddsTheProductToTheCartEnsuringItsValidity(String product) {
        OnStage.theActorInTheSpotlight().attemptsTo(AddProductToCart.ofFalabella(product));
        OnStage.theActorInTheSpotlight().attemptsTo(Ensure.that(PRODUCT_IN_THE_CART.of(product)).isDisplayed());
    }


    @And("proceeds to checkout completing the purchase process {string} {string} {string} {string} {string} {string}")
    public void proceedsToCheckoutCompletingThePurchaseProcess(String correo, String departamento, String ciudad, String barrio, String direccion, String torreAptoUnidad) {
        DataManager.getInstance().getDatosPrueba().put(CORREO,correo);
        DataManager.getInstance().getDatosPrueba().put(DEPARTAMENTO,departamento);
        DataManager.getInstance().getDatosPrueba().put(CIUDAD,ciudad);
        DataManager.getInstance().getDatosPrueba().put(BARRIO,barrio);
        DataManager.getInstance().getDatosPrueba().put(DIRECCION,direccion);
        DataManager.getInstance().getDatosPrueba().put(TORREAPTOUNIDAD,torreAptoUnidad);
        OnStage.theActorInTheSpotlight().attemptsTo(MakePayment.falabella());
    }


    @Then("the user should observe the message {string}")
    public void theUserShouldObserveTheMessage(String mensaje) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidatePurchaseItem.inThePage(mensaje), is(equalTo(mensaje))));
    }

}
