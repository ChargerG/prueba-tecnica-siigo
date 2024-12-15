package co.com.siigo.prueba.interactions.ui.login;

import co.com.siigo.prueba.userInterfaces.LoginPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;

public class ClickOnLoginButton implements Interaction {

    @Step("{0} presiona el boton de inciar sesion")
    @Override
    public <T extends Actor> void performAs(T actor) {
        Click.on(LoginPage.LOGIN_BUTTON.waitingForNoMoreThan(Duration.ofSeconds(30))).performAs(actor);
    }
}
