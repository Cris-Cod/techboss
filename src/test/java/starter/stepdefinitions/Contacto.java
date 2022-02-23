package starter.stepdefinitions;

import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import pages.HomePage;

public class Contacto {

    @Steps
    HomePage home;

    @Given("El usuario se encuentra en el home de la pagina")
    public void elUsuarioSeEncuentraEnElHomeDeLaPagina() {
        home.ingresarAlHome();
    }
    @When("se ingresa a la pagina de contancto")
    public void seIngresaALaPaginaDeContancto() {
        home.ingresarPageContacto();
    }
    @When("el usuario ingresa los datos del registro")
    public void elUsuarioIngresaLosDatosDelRegistro() {
        home.datosDelFormulario();
    }
    @Then("Se envia del registro")
    public void seEnviaDelRegistro() {
        home.enviarFormulario();
    }
}
