package co.com.siigo.prueba.interactions.services.methods;

import co.com.siigo.prueba.utils.KeyToRemember;
import io.restassured.http.ContentType;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.interactions.RestInteraction;

import java.util.Map;

import static net.serenitybdd.screenplay.rest.abilities.CallAnApi.as;

public class PostAndGetResponse extends RestInteraction {

    private final String resource;
    private final Object body;
    private final Map<String,String> headers;
    private final Class<?> clazz;
    private final KeyToRemember remember;

    public PostAndGetResponse(String resource, Object body, Class<?> clazz, KeyToRemember remember) {
        this.resource = resource;
        this.body = body;
        this.clazz = clazz;
        this.remember = remember;
        this.headers = null;
    }

    public PostAndGetResponse(String resource, Object body, Map<String, String> headers, Class<?> clazz, KeyToRemember remember) {
        this.resource = resource;
        this.body = body;
        this.headers = headers;
        this.clazz = clazz;
        this.remember = remember;
    }

    @Step("{0} consume la peticion POST")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember(this.remember.name(), rest().contentType(ContentType.JSON)
                .relaxedHTTPSValidation()
                .headers(this.headers)
                .body(this.body)
                .when().post(as(actor).resolve(this.resource))
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(clazz));
    }
}
