package co.com.utest.entrevista.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaIngresoUbicacion {

    public static final Target TXT_ZIP = Target.the("Donde seleccionamos nuestro codigo postal").located(By.name("zip"));
    public static final Target BOTON_DISPOSITIVOS = Target.the("Boton que se dirige al formulario de registro de dispositivos").located(By.xpath("//a[@class=\"btn btn-blue pull-right\"]"));

}
