package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class casillaBusqueda extends PageObject {

    public void btnBusqueda(){
        $(By.id("et_top_search")).click();
    }

    public void ingresaBusqueda(){
        $(By.className("et-search-field")).typeAndEnter("Sede");
    }

    public String verificarResultado(){
       return  $(By.className("entry")).getText();
    }
}
