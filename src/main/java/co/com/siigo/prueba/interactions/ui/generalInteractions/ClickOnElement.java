package co.com.siigo.prueba.interactions.ui.generalInteractions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import java.time.Duration;

public class ClickOnElement implements Interaction {
    private final Target target;

    public ClickOnElement(Target target){
        this.target = target;
    }

    @Step("{0} hace clic sobre el elemento #target")
    @Override
    public <T extends Actor> void performAs(T actor) {
        Click.on(target.waitingForNoMoreThan(Duration.ofSeconds(30))).performAs(actor);
    }
}
