package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.AgregarProducto;
import tasks.LlenarCompra;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CompraProductoSteps {

    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
    }

    @Given("{string} navega por la pagina {string}")
    public void navegaPorLaPagina(String actorName, String url) {
        theActorCalled(actorName).attemptsTo(Open.url(url));
    }

    @When("busca el producto {string}")
    public void buscaElProducto(String producto) {
        theActorInTheSpotlight().attemptsTo(AgregarProducto.configure(producto));
    }
    @When("llena la informacion de despacho")
    public void llenaLaInformacionDeDespacho(DataTable informacionDespacho) {
        theActorInTheSpotlight().attemptsTo(LlenarCompra.llenarInfo(informacionDespacho));
    }
    @When("continua a la opcion de pago")
    public void continuaALaOpcionDePago() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("{string}")
    public void string(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
