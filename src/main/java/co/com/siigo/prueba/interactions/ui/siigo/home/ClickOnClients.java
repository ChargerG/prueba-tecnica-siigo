package co.com.siigo.prueba.interactions.ui.siigo.home;

import co.com.siigo.prueba.userInterfaces.HomePage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;

public class ClickOnClients implements Interaction  {

    @Step("{0} hace clic sobre la opcion Clientes")
    @Override
    public <T extends Actor> void performAs(T actor) {
        Click.on(HomePage.CLIENT_OPTIONS.waitingForNoMoreThan(Duration.ofSeconds(30))).performAs(actor);
    }
}
