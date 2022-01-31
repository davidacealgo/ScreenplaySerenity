package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.ChoucairLoginPage;

public class Login implements Task {
    private String userName;
    private String password;

    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theValue("dacevedog").into(ChoucairLoginPage.USERNAME),
                Enter.theValue("Choucair2022*").into(ChoucairLoginPage.PASSWORD),
                Click.on(ChoucairLoginPage.ENTER_BUTTON)));
    }
}
