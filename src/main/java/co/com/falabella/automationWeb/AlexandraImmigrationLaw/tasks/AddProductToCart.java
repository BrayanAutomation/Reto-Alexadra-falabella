package co.com.falabella.automationWeb.AlexandraImmigrationLaw.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.falabella.automationWeb.AlexandraImmigrationLaw.userinterfaces.AddproductUI.*;
import static co.com.falabella.automationWeb.AlexandraImmigrationLaw.userinterfaces.HomePageUI.ENTER_PRODUCT_SEARCHER;
import static co.com.falabella.automationWeb.AlexandraImmigrationLaw.userinterfaces.HomePageUI.PRODUCT_SEARCHER;

@AllArgsConstructor
public class AddProductToCart implements Task {

    String product;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("iphone").into(PRODUCT_SEARCHER));
        actor.attemptsTo(Click.on(ENTER_PRODUCT_SEARCHER));
        actor.attemptsTo(Scroll.to(SELECT_PRODUCT.of(product)));
        actor.attemptsTo(Click.on(SELECT_PRODUCT.of(product)));
        actor.attemptsTo(Click.on(ADD_PRODUCT_TO_CART));
        actor.attemptsTo(Click.on(GO_TO_CART));
    }

    public static AddProductToCart ofFalabella(String product){
        return Tasks.instrumented(AddProductToCart.class, product);
    }
}
