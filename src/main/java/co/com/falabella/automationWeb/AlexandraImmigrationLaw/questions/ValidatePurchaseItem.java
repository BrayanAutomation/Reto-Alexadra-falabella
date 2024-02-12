package co.com.falabella.automationWeb.AlexandraImmigrationLaw.questions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.falabella.automationWeb.AlexandraImmigrationLaw.userinterfaces.MakePaymentUI.VALIDATE_MESSAGE;

@AllArgsConstructor
public class ValidatePurchaseItem implements Question {

    String mensaje;

    @Override
    public Object answeredBy(Actor actor) {
        String[] item = VALIDATE_MESSAGE.of(mensaje).resolveFor(actor).getText().split("\\|");
        return item[0].trim();
    }

    public static ValidatePurchaseItem inThePage(String mensaje){
        return new ValidatePurchaseItem(mensaje);
    }
}
