package co.com.siigo.prueba.interactions.generalInteractions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.targets.Target;

import java.time.Duration;

public class MoveOnElement implements Interaction {
    private final Target target;

    public MoveOnElement(Target target) {
        this.target = target;
    }

    @Step("{0} se mueve al elemento #target")
    @Override
    public <T extends Actor> void performAs(T actor) {
        MoveMouse.to(target.waitingForNoMoreThan(Duration.ofSeconds(30))).performAs(actor);
    }
}
