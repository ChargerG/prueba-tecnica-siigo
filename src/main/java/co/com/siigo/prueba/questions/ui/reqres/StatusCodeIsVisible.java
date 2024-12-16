package co.com.siigo.prueba.questions.ui.reqres;

import co.com.siigo.prueba.userInterfaces.reqres.ReqresPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import java.time.Duration;

public class StatusCodeIsVisible implements Question<Boolean> {

    public static StatusCodeIsVisible forUser() {
        return new StatusCodeIsVisible();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(ReqresPage.STATUS_CODE.waitingForNoMoreThan(Duration.ofSeconds(30))).answeredBy(actor);
    }
}
