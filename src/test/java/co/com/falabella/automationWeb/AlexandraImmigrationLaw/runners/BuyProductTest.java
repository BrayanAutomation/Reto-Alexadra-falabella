package co.com.falabella.automationWeb.AlexandraImmigrationLaw.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "src/test/resources/co/com/falabella/automationWeb/AlexandraImmigrationLaw/features/buy_product.feature",
        glue = {"co.com.falabella.automationWeb.AlexandraImmigrationLaw.stepsdefinitions","co.com.falabella.automationWeb.AlexandraImmigrationLaw.stepsdefinitions.DataTableTypeRegistry"},
        tags = ""
)
public class BuyProductTest {
}
