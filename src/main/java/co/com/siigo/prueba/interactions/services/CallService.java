package co.com.siigo.prueba.interactions.services;

import co.com.siigo.prueba.interactions.services.methods.PostAndGetResponse;
import net.serenitybdd.screenplay.Interaction;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CallService {

    private CallService() {
    }

    /**
     * @param resource ruta del recurso a consumir
     * @param body     Object con el body del servicio a consumir
     * @param headers  Map con las cabeceras del recurso a consumir
     * @param dto      Objeto con los campos que se desea obtener
     * @param remember recuerdo donde se guardará el campo consultado
     */
    public static Interaction postAndGetResponse(String resource, Object body, Map<String, String> headers, Object dto, Object remember) {
        return instrumented(PostAndGetResponse.class, resource, body, headers, dto, remember);
    }
}