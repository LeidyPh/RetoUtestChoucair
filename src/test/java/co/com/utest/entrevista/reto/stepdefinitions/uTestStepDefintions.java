package co.com.utest.entrevista.reto.stepdefinitions;


import co.com.utest.entrevista.reto.model.UtestDatos;
import co.com.utest.entrevista.reto.questions.QuestionRegistroExitoso;
import co.com.utest.entrevista.reto.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class uTestStepDefintions {


    @Before
    public void IniciodesesionStepDefintios () {

        OnStage.setTheStage(new OnlineCast());
    }



    @Given("^Leidy Ingresa Datos personales$")
    public void LeidyIngresaDatosPersonales(List <UtestDatos> utestDatos) throws Exception {
        OnStage.theActorCalled("Leidy").wasAbleTo(Abrir.thePage(),DatosPersonales.
                onThePage(utestDatos.get(0).getTextoNombre(),
                utestDatos.get(0).getTextoApellido(),
                utestDatos.get(0).getTextoCorreo(),
                utestDatos.get(0).getTextoMes(),
                utestDatos.get(0).getTextoDia(),
                utestDatos.get(0).getTextoAno())
        );
    }

    @When("^Ella Ingresa Datos de Ubicacion Dispositivo y Contrasena$")
    public void EllaIngresaDatosdeUbicacionDispositivoyContrasena(List <UtestDatos> utestDatos) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresoUbicacion.the(utestDatos.get(0).getTextoZip()));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresoDispositivo.the(utestDatos.get(0).getTextoMovil()));
        OnStage.theActorInTheSpotlight().attemptsTo(CompletarRegistro.the(utestDatos.get(0).getTextoContrasena(),utestDatos.get(0).getTextoConfirmarContrasena()));

    }

    @Then("^Ella finalizo su registro en Utest$")
    public void EllaFinalizoSuRegistro(List <UtestDatos> utestDatos) {

        OnStage.theActorInTheSpotlight().should(seeThat(QuestionRegistroExitoso.mensajeExitoso(),equalTo(utestDatos.get(0).getTextoExitoso()))
        );


    }

}
