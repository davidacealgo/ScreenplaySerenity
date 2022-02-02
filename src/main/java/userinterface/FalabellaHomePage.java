package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FalabellaHomePage extends PageObject {
    public static final Target BUSCAR_PRODUCTO = Target.the("Campo de busqueda de productos")
            .located(By.id("testId-SearchBar-Input"));
    public static final Target BTN_BUSCAR = Target.the("Botón para buscar el producto")
            .locatedBy("//button[@class='SearchBar-module_searchBtnIcon__6KVum']");
    public static final Target PRODUCTO = Target.the("Producto a comprar")
            .locatedBy("//div[@id='testId-pod-14070581']//div[@class='jsx-1327784995 jsx-97019337 pod-details pod-details-4_GRID']");
    public static final Target BTN_AGREGAR = Target.the("Botón para agregar el producto a la bolsa")
            .located(By.id("buttonForCustomers"));
    public static final Target BTN_VER_CARRO = Target.the("Botón para ver el carro de compras")
            .located(By.id("linkButton"));
    public static  final Target BTN_COMPRAR = Target.the("Botón para ir a compras")
            .locatedBy("//div[@class='fb-order-status__cta']/button");
}
