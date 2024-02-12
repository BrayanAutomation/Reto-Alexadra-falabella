package co.com.falabella.automationWeb.AlexandraImmigrationLaw.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.time.Duration;

public class AddproductUI {

    public static final Target SELECT_PRODUCT = Target.the("Select Product")
            .locatedBy("//div[@id='testId-searchResults-products']//b[contains(text(), '{0}')]")
            .waitingForNoMoreThan(Duration.ofSeconds(15));

    public static final Target ADD_PRODUCT_TO_CART = Target.the("Add product to cart")
            .located(By.id("add-to-cart-button"))
            .waitingForNoMoreThan(Duration.ofSeconds(15));

    public static final Target GO_TO_CART = Target.the("Go to cart")
            .located(By.id("linkButton"))
            .waitingForNoMoreThan(Duration.ofSeconds(15));

    public static final Target PRODUCT_IN_THE_CART = Target.the("Product in the cart")
            .locatedBy("//a[contains(text(), '{0}')]")
            .waitingForNoMoreThan(Duration.ofSeconds(15));

    public static final Target CONTINUE_SHOPPING_BUTTON = Target.the("Continue shopping button")
            .locatedBy("//button[contains(text(), 'Continuar compra')]")
            .waitingForNoMoreThan(Duration.ofSeconds(15));

    public static final Target CONTINUE_SHOPPING_BUTTON_TWO = Target.the("Continue shopping button")
            .locatedBy("//button[contains(text(), 'Continuar')]")
            .waitingForNoMoreThan(Duration.ofSeconds(15));

}
