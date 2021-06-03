package co.com.choucair.prueba.retoempleos.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/navegacion_empleos.feature",
glue="co.com.choucair.prueba.retoempleos.stepdefinitions",
snippets = SnippetType.CAMELCASE)
public class NavegacionEmpleos {
}
