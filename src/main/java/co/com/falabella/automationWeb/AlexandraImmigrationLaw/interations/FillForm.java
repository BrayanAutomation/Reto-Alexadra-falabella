package co.com.falabella.automationWeb.AlexandraImmigrationLaw.interations;

import co.com.falabella.automationWeb.AlexandraImmigrationLaw.models.DataManager;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.falabella.automationWeb.AlexandraImmigrationLaw.userinterfaces.MakePaymentUI.*;
import static co.com.falabella.automationWeb.AlexandraImmigrationLaw.utils.Constants.*;

public class FillForm implements Interaction {

    String department = DataManager.getInstance().getDatosPrueba().get(DEPARTAMENTO);
    String city = DataManager.getInstance().getDatosPrueba().get(CIUDAD);
    String neighborhood = DataManager.getInstance().getDatosPrueba().get(BARRIO);
    String address = DataManager.getInstance().getDatosPrueba().get(DIRECCION);
    String torreAptoCiudad = DataManager.getInstance().getDatosPrueba().get(TORREAPTOUNIDAD);

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(SELECT_DEPARTMENT_FIELD));
        actor.attemptsTo(Click.on(ENTER_OPTION.of(department)));
        actor.attemptsTo(Click.on(SELECT_CITY_FIELD));
        actor.attemptsTo(Click.on(ENTER_OPTION.of(city)));
        actor.attemptsTo(Click.on(SELECT_NEIGHBORHOOD_FIELD));
        actor.attemptsTo(Click.on(ENTER_OPTION.of(neighborhood)));
        actor.attemptsTo(Enter.theValue(address).into(SELECT_ADDRESS_FIELD));
        actor.attemptsTo(Enter.theValue(torreAptoCiudad).into(SELECT_APTO_FIELD));

    }

    public static FillForm ofPayments(){
        return Tasks.instrumented(FillForm.class);
    }
}
