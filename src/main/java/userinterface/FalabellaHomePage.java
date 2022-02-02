package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FallabellaHomePage extends PageObject {
    public static final Target BUSCAR_PRODUCTO = Target.the("Campo de busqueda de productos")
            .located(By.id("testId-SearchBar-Input"));
}
