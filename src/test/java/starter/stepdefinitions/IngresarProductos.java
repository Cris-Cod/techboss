package starter.stepdefinitions;

import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import pages.HomePage;

public class IngresarProductos {

    @Steps
    HomePage home;

    @Given("El usuario ingresa a la web")
    public void elUsuarioIngresaALaWeb() {
        home.ingresaHome();
    }
    @When("el usuario lista las opciones del boton productos")
    public void elUsuarioListaLasOpcionesDelBotonProductos() {
        home.listarProductos();
    }
    @When("ingresa a la seccion Seif")
    public void ingresaALaSeccionSeif() {
        home.accederSeif();
    }
    @When("El usuario lista  la seccion soluciones")
    public void elUsuarioListaLaSeccionSoluciones() {
        home.ingresarSoluciones();
    }
    @When("ingresa a la seccion Minuta Virtual")
    public void ingresaALaSeccionMinutaVirtual() {
        home.ingresarMintuaVirtual();
    }
    @Then("selecciona el logo")
    public void seleccionaElLogo() {
        home.selecionaLogo();
    }
}
