package starter.stepdefinitions;

import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import pages.HomePage;

public class Busqueda {

    @Steps
    HomePage home;

    @Given("El usuario ingresa al home de la pagina")
    public void el_usuario_ingresa_al_home_de_la_pagina() {
        home.ingresarAlHome();
    }
    @When("El usuario ingresa al caja de busqueda")
    public void el_usuario_ingresa_al_caja_de_busqueda() {
        home.seleccionaLasCasillaBusqueda();
    }
    @When("busca las sedes de la compañia")
    public void busca_las_sedes_de_la_compañia() {
        home.ingresarBusqueda();
    }
    @Then("se muestra un mensaje dentro de la pagina")
    public void se_muestra_un_mensaje_dentro_de_la_pagina() {
        home.LaBusquedaSeMuestra();
    }


}
