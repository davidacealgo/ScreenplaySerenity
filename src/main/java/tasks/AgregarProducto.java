package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterface.HomePage.BUSCAR_PRODUCTO;

public class AgregarProducto implements Task {

    private String producto;

    public AgregarProducto(String producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(producto).into(BUSCAR_PRODUCTO)
        );
    }

    public static AgregarProducto configure(String producto){
        return Tasks.instrumented(AgregarProducto.class, producto);
    }
}
