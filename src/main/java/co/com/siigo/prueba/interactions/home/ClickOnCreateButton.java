package co.com.siigo.prueba.interactions.home;

import co.com.siigo.prueba.userInterfaces.HomePage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;

public class ClickOnCreateButton implements Interaction {

    @Step("{0} hace clic sobre el boton Crear")
    @Override
    public <T extends Actor> void performAs(T actor) {
        Click.on(HomePage.CREATE_OPTION.waitingForNoMoreThan(Duration.ofSeconds(30))).performAs(actor);
    }
}
