package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class pageContacto extends PageObject {

    public void ingresarPageContacto(){
        $(By.id("menu-item-47")).click();
    }

    public void casillaName(){
        $(By.id("et_pb_contact_name_0")).type("Cristian Arevalo");
    }

    public void casillaEmail(){
        $(By.id("et_pb_contact_email_0")).type("aarevalo.cristian.17@gmail.com");
    }

    public void casillaMensaje(){
        $(By.id("et_pb_contact_message_0")).type("Esta es una prueba del formulario");
    }

    public void ingresarNumero(){
        $(By.name("et_pb_contact_captcha_0")).type("8");
    }

    public void btnEviar(){
        $(By.name("et_builder_submit_button")).click();
    }

    public String validarCaptcha(){
        return $(By.className("et-pb-contact-message")).getText();
    }

}
