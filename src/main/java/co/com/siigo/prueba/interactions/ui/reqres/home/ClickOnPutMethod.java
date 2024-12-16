package co.com.siigo.prueba.interactions.ui.reqres.home;

import co.com.siigo.prueba.userInterfaces.reqres.ReqresPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;

public class ClickOnPutMethod implements Interaction {

    @Step("{0} hace clic sobre ")
    @Override
    public <T extends Actor> void performAs(T actor) {
        Click.on(ReqresPage.PUT_METHOD.waitingForNoMoreThan(Duration.ofSeconds(30))).performAs(actor);
    }
}
