package pages;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class HomePage {

    listaProductos listar;
    pageContacto contacto;
    casillaBusqueda busqueda;

    @Step
    public void ingresaHome(){
        listar.open();
    }

    @Step
    public void listarProductos(){
        listar.btnProductos();
    }

    @Step
    public void accederSeif(){
        listar.btnSeif();
    }

    @Step
    public void ingresarSoluciones(){
        listar.btnSoluciones();
    }

    @Step
    public void ingresarMintuaVirtual(){
        listar.btnMaquina();
    }

    @Step
    public void selecionaLogo(){
        listar.verificarLogo();
    }

    ///////Page Contacto//////

    @Step
    public void ingresarAlHome(){
        contacto.open();
    }

    @Step
    public void ingresarPageContacto(){
        contacto.ingresarPageContacto();
    }

    @Step
    public void datosDelFormulario(){
        contacto.casillaName();
        contacto.casillaEmail();
        contacto.casillaMensaje();
        contacto.ingresarNumero();
    }

    @Step
    public void enviarFormulario(){
        contacto.btnEviar();

        String mensajeCaptcha = "You entered the wrong number in captcha.";

        Assert.assertEquals("Se ingreso correctamente el captcha", mensajeCaptcha, contacto.validarCaptcha());
    }


    ///////busqueda//////

    @Step
    public void ingresaAlHome(){
        busqueda.open();
    }

    @Step
    public void seleccionaLasCasillaBusqueda(){
        busqueda.btnBusqueda();
    }

    @Step
    public void ingresarBusqueda(){
        busqueda.ingresaBusqueda();
    }

    @Step
    public void LaBusquedaSeMuestra(){

        String  resultado = "No Results Found";

        Assert.assertEquals("Se encontro resultado", resultado, busqueda.verificarResultado());
    }

}
