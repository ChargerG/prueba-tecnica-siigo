package co.com.siigo.prueba.questions.services;

import co.com.siigo.prueba.utils.KeyToRemember;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.Map;

public class ResponseContains implements Question<Map<String, String>> {

    public static ResponseContains theFields() {
        return new ResponseContains();
    }

    @Override
    public Map<String, String> answeredBy(Actor actor) {
        return actor.recall(KeyToRemember.RESPONSE.name());
    }
}
