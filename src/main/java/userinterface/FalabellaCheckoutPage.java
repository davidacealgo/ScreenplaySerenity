package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FalabellaCheckoutPage extends PageObject {

    public static final Target INPUT_DEPARTAMENTO = Target.the("Campo para seleccionar el departamento")
            .locatedBy("//select[@id='region']//option[contains(text(),'ANTIOQUIA')]");
    public static final Target INPUT_CIUDAD = Target.the("Campo para seleccionar la ciudad")
            .locatedBy("//select[@id='ciudad']//option[text()='BELLO']");
    public static final Target INPUT_COMUNA = Target.the("Campo para seleccionar la comuna")
            .locatedBy("//select[@id='comuna']//option[text()='BELLO']");
    public static final Target BTN_CONTINUAR_COMPRA = Target.the("Boton para continuar con la compra")
            .locatedBy("//button[@class='fbra_button fbra_test_button fbra_formItem__field04']");
    public static final Target INPUT_DIRECCION = Target.the("Direccion de la compra")
            .located(By.id("address"));
    public static final Target INPUT_DIRECCION_EXTRA = Target.the("Información adicional dirección de la compra")
            .located(By.id("departmentNumber"));
    public static final Target BTN_INGRESAR_DIRECCION = Target.the("Boton para ingresar la direccion")
            .locatedBy("//button[@class='fbra_button fbra_test_button fbra_formItem__useAddress']");
    public static final Target BTN_CONTINUAR = Target.the("Boton para ingresar la direccion")
            .locatedBy("//button[text()='Continuar']");
}
