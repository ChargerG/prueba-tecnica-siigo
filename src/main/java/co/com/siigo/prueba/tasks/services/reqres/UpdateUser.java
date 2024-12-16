package co.com.siigo.prueba.tasks.services.reqres;

import co.com.siigo.prueba.interactions.services.CallService;
import co.com.siigo.prueba.utils.KeyToRemember;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class UpdateUser implements Task {
    private final String resource;

    public UpdateUser(String resource) {
        this.resource = resource;
    }

    public static UpdateUser information(String resource) {
        return new UpdateUser(resource);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(CallService.putAndGetResponse(
                resource,
                actor.recall(KeyToRemember.BODY.name()),
                200,
                KeyToRemember.RESPONSE)
        );
    }
}
