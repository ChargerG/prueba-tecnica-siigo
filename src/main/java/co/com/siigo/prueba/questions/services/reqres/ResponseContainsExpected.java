package co.com.siigo.prueba.questions.services.reqres;

import co.com.siigo.prueba.utils.KeyToRemember;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.Map;

public class ResponseContainsExpected implements Question<String> {
    private final String value;

    public ResponseContainsExpected(String value) {
        this.value = value;
    }

    public static ResponseContainsExpected values(String value) {
        return new ResponseContainsExpected(value);
    }

    @Override
    public String answeredBy(Actor actor) {
        final Map<String, String> response = actor.recall(KeyToRemember.RESPONSE.name());
        return response.get(value);
    }
}
