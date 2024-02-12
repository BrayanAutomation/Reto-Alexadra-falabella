package co.com.falabella.automationWeb.AlexandraImmigrationLaw.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;
import org.openqa.selenium.By;

import java.time.Duration;

public class HomePageUI {

     public static final Target YES_LOVE_THE_OFFERS = Target.the("Windows love the offers")
             .located(ByShadow.cssSelector("button.airship-btn.airship-btn-accept","div.airship-html-prompt-shadow"))
             .waitingForNoMoreThan(Duration.ofSeconds(15));

     public static final Target BUTTON_X = Target.the("x button to close tag")
             .located(By.xpath("//div[@id='testId-notification']/following-sibling::div//button[@data-testid='testId-notification-close-btn']"))
             .waitingForNoMoreThan(Duration.ofSeconds(15));

     public static final Target PRODUCT_SEARCHER = Target.the("Product Searcher")
             .located(By.id("testId-SearchBar-Input"))
             .waitingForNoMoreThan(Duration.ofSeconds(15));

     public static final Target ENTER_PRODUCT_SEARCHER = Target.the("click in Product Searcher")
             .located(By.className("SearchBar-module_searchBtnIcon__2L2s0"))
             .waitingForNoMoreThan(Duration.ofSeconds(15));

}
