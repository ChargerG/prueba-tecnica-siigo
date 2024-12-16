package co.com.siigo.prueba.interactions.services.methods;

import co.com.siigo.prueba.utils.KeyToRemember;
import io.restassured.http.ContentType;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.interactions.RestInteraction;

import java.util.Map;

import static net.serenitybdd.screenplay.rest.abilities.CallAnApi.as;

public class PutAndGetResponse extends RestInteraction {
    private final String resource;
    private final Object body;
    private final Class<?> clazz;
    private final Integer statusCode;
    private final Map<String,String> headers;
    private final KeyToRemember remember;

    public PutAndGetResponse(String resource, Object body, Integer statusCode, KeyToRemember remember) {
        this.resource = resource;
        this.body = body;
        this.clazz = Object.class;
        this.statusCode = statusCode;
        this.remember = remember;
        this.headers = Map.of();
    }

    @Step("{0} consume la peticion PUT")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember(this.remember.name(), rest().contentType(ContentType.JSON)
                .relaxedHTTPSValidation()
                .headers(this.headers)
                .body(this.body)
                .when().put(as(actor).resolve(this.resource))
                .then()
                .statusCode(this.statusCode)
                .extract()
                .body()
                .as(clazz)
        );
    }
}
