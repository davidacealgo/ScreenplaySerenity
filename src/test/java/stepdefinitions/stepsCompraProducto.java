package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.AgregarProducto;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class stepsCompraProducto {

    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
    }
    @Given("{string} navega por la página {string}")
    public void navegaPorLaPágina(String actorName, String url) {
        theActorCalled(actorName).attemptsTo(Open.url(url));
    }
    @When("busca el producto {string}")
    public void buscaElProducto(String producto) {
        theActorInTheSpotlight().attemptsTo(AgregarProducto.configure(producto));
    }
    @When("llena la información de despacho")
    public void llenaLaInformaciónDeDespacho(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }
    @When("continua a la opción de pago")
    public void continuaALaOpciónDePago() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("{string}")
    public void string(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
