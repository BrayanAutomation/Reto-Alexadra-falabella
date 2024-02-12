package co.com.falabella.automationWeb.AlexandraImmigrationLaw.interations;

import co.com.falabella.automationWeb.AlexandraImmigrationLaw.userinterfaces.HomePageUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClosePopUpNotifications implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePageUI.BUTTON_X));
    }

    public static ClosePopUpNotifications bestOffers(){
        return Tasks.instrumented(ClosePopUpNotifications.class);
    }
}
