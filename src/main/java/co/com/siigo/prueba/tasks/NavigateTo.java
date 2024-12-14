package co.com.siigo.prueba.tasks;

import co.com.siigo.prueba.utils.KeyToRemember;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo implements Task {

    public static NavigateTo siigo() {
        return new NavigateTo();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Open.url(actor.recall(KeyToRemember.URL.name())).performAs(actor);
    }
}
