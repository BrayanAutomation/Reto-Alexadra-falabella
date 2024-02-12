package co.com.falabella.automationWeb.AlexandraImmigrationLaw.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.time.Duration;

public class MakePaymentUI {

    public static final Target MAIL_FIELD = Target.the("Field to enter mail")
            .located(By.xpath("//input[@id='testId-Input-email']"))
            .waitingForNoMoreThan(Duration.ofSeconds(15));

    public static final Target SELECT_DEPARTMENT_FIELD = Target.the("Select department field")
            .located(By.xpath("//input[@placeholder='Selecciona un Departamento']"))
            .waitingForNoMoreThan(Duration.ofSeconds(15));

    public static final Target SELECT_CITY_FIELD = Target.the("Select city field")
            .located(By.xpath("//input[@placeholder='Selecciona una Ciudad']"))
            .waitingForNoMoreThan(Duration.ofSeconds(15));

    public static final Target SELECT_NEIGHBORHOOD_FIELD = Target.the("Select neighborhood field")
            .located(By.xpath("//input[@placeholder='Selecciona un Barrio']"))
            .waitingForNoMoreThan(Duration.ofSeconds(15));

    public static final Target SELECT_ADDRESS_FIELD = Target.the("Select address field")
            .located(By.xpath("//div[@class='jsx-1532992775 jsx-4241167886 cell']//input[@id='testId-Input-street']"))
            .waitingForNoMoreThan(Duration.ofSeconds(15));

    public static final Target SELECT_APTO_FIELD = Target.the("Select Apto field")
            .located(By.xpath("//input[@placeholder='Ejem. Casa 3, Dpto 101.']"))
            .waitingForNoMoreThan(Duration.ofSeconds(15));

    public static final Target ENTER_OPTION = Target.the("Enter option in the form")
            .locatedBy("//button[contains(text(),'{0}')]")
            .waitingForNoMoreThan(Duration.ofSeconds(15));

    public static final Target BUTTON_CONFIRM_ADDRESS = Target.the("Button confirm address")
            .located(By.xpath("//button[contains(text(),'Confirmar')]"))
            .waitingForNoMoreThan(Duration.ofSeconds(15));

    public static final Target BUTTON_CONFIRM_MAP = Target.the("Button confirm map")
            .located(By.xpath("//button[@id='testId-infoModalFooter-button'][text()='Confirmar y Guardar']"))
            .waitingForNoMoreThan(Duration.ofSeconds(15));

    public static final Target GO_TO_PAYMENTS = Target.the("Button go to payments")
            .located(By.xpath("//button[contains(text(),'Ir a pagar')]"))
            .waitingForNoMoreThan(Duration.ofSeconds(15));

    public static final Target VALIDATE_MESSAGE = Target.the("Button go to payments")
            .locatedBy("//div[contains(text(),'{0}')]")
            .waitingForNoMoreThan(Duration.ofSeconds(15));
}
