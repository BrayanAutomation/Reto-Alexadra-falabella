package co.com.falabella.automationWeb.AlexandraImmigrationLaw.interations;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import java.util.concurrent.TimeUnit;

@AllArgsConstructor
public class Espera implements Interaction {

    int segundos;

    @Override
    public <T extends Actor> void performAs(T actor) {
        /*try {
            Thread.sleep(segundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        try {
            TimeUnit.SECONDS.sleep(segundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Espera porSegundos(int segundos){
        return Tasks.instrumented(Espera.class,segundos);
    }
}
