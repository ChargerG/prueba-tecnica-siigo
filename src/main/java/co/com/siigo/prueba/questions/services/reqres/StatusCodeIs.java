package co.com.siigo.prueba.questions.services.reqres;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class StatusCodeIs implements Question<Integer> {

    public static StatusCodeIs success() {
        return new StatusCodeIs();
    }

    @Override
    public Integer answeredBy(Actor actor) {
        return lastResponse().statusCode();
    }
}
