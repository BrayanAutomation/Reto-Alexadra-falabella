package co.com.falabella.automationWeb.AlexandraImmigrationLaw.tasks;

import co.com.falabella.automationWeb.AlexandraImmigrationLaw.interations.FillForm;
import co.com.falabella.automationWeb.AlexandraImmigrationLaw.models.DataManager;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.falabella.automationWeb.AlexandraImmigrationLaw.userinterfaces.AddproductUI.CONTINUE_SHOPPING_BUTTON;
import static co.com.falabella.automationWeb.AlexandraImmigrationLaw.userinterfaces.AddproductUI.CONTINUE_SHOPPING_BUTTON_TWO;
import static co.com.falabella.automationWeb.AlexandraImmigrationLaw.userinterfaces.MakePaymentUI.*;
import static co.com.falabella.automationWeb.AlexandraImmigrationLaw.utils.Constants.CORREO;

public class MakePayment implements Task {

    String correo = DataManager.getInstance().getDatosPrueba().get(CORREO);

    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(CONTINUE_SHOPPING_BUTTON));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Enter.theValue(correo).into(MAIL_FIELD));
        actor.attemptsTo(Click.on(CONTINUE_SHOPPING_BUTTON_TWO));
        actor.attemptsTo(FillForm.ofPayments());
        actor.attemptsTo(Click.on(BUTTON_CONFIRM_ADDRESS));
        actor.attemptsTo(Click.on(BUTTON_CONFIRM_ADDRESS));
        actor.attemptsTo(Click.on(BUTTON_CONFIRM_MAP));
        actor.attemptsTo(Click.on(GO_TO_PAYMENTS));
    }

    public static MakePayment falabella(){
        return Tasks.instrumented(MakePayment.class);
    }
}
