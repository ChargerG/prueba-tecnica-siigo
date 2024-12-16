package co.com.siigo.prueba.tasks.ui.reqres;

import co.com.siigo.prueba.tasks.ui.NavigateTo;
import co.com.siigo.prueba.utils.KeyToRemember;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class ConsumePut implements Task {

    public static ConsumePut consumePut(){
        return new ConsumePut();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                NavigateTo.url(actor.recall(KeyToRemember.URL.name()))
        );
    }
}
