package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterface.FalabellaHomePage.*;

public class    AgregarProducto implements Task {

    private String producto;

    public AgregarProducto(String producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(producto).into(BUSCAR_PRODUCTO),
                Click.on(BTN_BUSCAR),
                Click.on(PRODUCTO),
                Click.on(BTN_AGREGAR),
                Click.on(BTN_VER_CARRO),
                Click.on(BTN_COMPRAR)
        );
    }

    public static AgregarProducto configure(String producto){
        return Tasks.instrumented(AgregarProducto.class, producto);
    }
}
