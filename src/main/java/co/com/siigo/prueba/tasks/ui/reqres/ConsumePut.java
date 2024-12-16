package co.com.siigo.prueba.tasks.ui.reqres;

import co.com.siigo.prueba.interactions.ui.reqres.ReqresUser;
import co.com.siigo.prueba.userInterfaces.reqres.ReqresPage;
import co.com.siigo.prueba.utils.KeyToRemember;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;

import java.time.Duration;

public class ConsumePut implements Task {

    public static ConsumePut consumePut() {
        return new ConsumePut();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ReqresUser.moveOnElement(ReqresPage.PUT_METHOD).performAs(actor);
        actor.remember(KeyToRemember.BODY.name(), Text.of(ReqresPage.BODY.waitingForNoMoreThan(Duration.ofSeconds(30))));
        ReqresUser.clickOnPutMethod().performAs(actor);
        actor.remember(KeyToRemember.STATUS_CODE.name(),
                Integer.valueOf(Text.of(ReqresPage.STATUS_CODE.waitingForNoMoreThan(Duration.ofSeconds(30)))
                        .answeredBy(actor)));
    }
}
