package co.com.siigo.prueba.tasks.services.reqres;

import co.com.siigo.prueba.interactions.services.CallService;
import co.com.siigo.prueba.utils.KeyToRemember;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class CreateNew implements Task {
    private final String resource;
    private final String jsonResponse;

    public CreateNew(String resource, String jsonResponse) {
        this.resource = resource;
        this.jsonResponse = jsonResponse;
    }

    public static CreateNew user(String resource, String jsonResponse) {
        return new CreateNew(resource, jsonResponse);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(CallService.postAndGetResponse(
                resource,
                jsonResponse,
                201,
                KeyToRemember.RESPONSE)
        );
    }
}
