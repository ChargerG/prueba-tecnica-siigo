package co.com.siigo.prueba.interactions.services;

import co.com.siigo.prueba.interactions.services.methods.PostAndGetResponse;
import co.com.siigo.prueba.utils.KeyToRemember;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CallService {

    private CallService() {
    }

    /**
     * @param resource   ruta del recurso a consumir
     * @param body       Object con el body del servicio a consumir
     * @param statusCode código de respuesta
     * @param remember   recuerdo donde se guardará la respuesta al consumir la petición
     */
    public static Interaction postAndGetResponse(String resource, Object body, Integer statusCode, KeyToRemember remember) {
        return instrumented(PostAndGetResponse.class, resource, body, statusCode, remember);
    }
}