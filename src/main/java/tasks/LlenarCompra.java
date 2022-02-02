package tasks;

import io.cucumber.datatable.DataTable;
import model.Despacho;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.FalabellaCheckoutPage;

import java.util.Map;

public class LlenarCompra implements Task {

    private DataTable data;
    private Map<String, String> info;
    private Despacho despacho;

    public LlenarCompra(DataTable data) {
        this.data = data;
        info = this.data.asMap(String.class, String.class);
        despacho = new Despacho(info.get("departamento"), info.get("ciudad"), info.get("barrio"), info.get("direccion"), info.get("detalle"));
    }

    public static LlenarCompra llenarInfo(DataTable data) {
        return Tasks.instrumented(LlenarCompra.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FalabellaCheckoutPage.INPUT_DEPARTAMENTO.of(despacho.getDepartamento())),
                Click.on(FalabellaCheckoutPage.INPUT_CIUDAD.of(despacho.getCiudad())),
                Click.on(FalabellaCheckoutPage.INPUT_COMUNA.of(despacho.getBarrio())),
                Click.on(FalabellaCheckoutPage.BTN_CONTINUAR_COMPRA),
                Enter.theValue(despacho.getDireccion()).into(FalabellaCheckoutPage.INPUT_DIRECCION),
                Enter.theValue(despacho.getDetalle()).into(FalabellaCheckoutPage.INPUT_DIRECCION_EXTRA),
                Click.on(FalabellaCheckoutPage.BTN_INGRESAR_DIRECCION),
                Click.on(FalabellaCheckoutPage.BTN_CONTINUAR)
        );
    }
}
