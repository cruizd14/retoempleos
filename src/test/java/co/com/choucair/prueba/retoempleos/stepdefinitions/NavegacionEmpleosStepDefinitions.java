package co.com.choucair.prueba.retoempleos.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class NavegacionEmpleosStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("yeison");
    }

    @Given("^Iniciar la pagina de inicio$")
    public void iniciarLaPaginaDeInicio() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.choucairtesting.com/empleos-testing/"));

    }

    @When("^el usuario digite la URL$")
    public void elUsuarioDigiteLaURL() {

    }

    @Then("^El usuario puede navegar correctamente$")
    public void elUsuarioPuedeNavegarCorrectamente() {

    }
}
