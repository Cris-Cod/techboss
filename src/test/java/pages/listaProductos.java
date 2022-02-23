package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class listaProductos extends PageObject {

    public void btnProductos(){
        $(By.cssSelector("li.menu-item-43")).click();
    }

    public void btnSeif(){
        $(By.id("menu-item-1599")).click();
    }

    public void btnSoluciones(){
        $(By.id("menu-item-564")).click();
    }

    public void btnMaquina(){
        $(By.id("menu-item-566")).click();
    }

    public void verificarLogo(){
        $(By.cssSelector("img[alt=\"Software para empresas de vigilancia Seif\"]")).click();
    }
}
