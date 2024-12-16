package co.com.siigo.prueba.interactions.ui.reqres;

import co.com.siigo.prueba.interactions.ui.generalInteractions.ClickOnElement;
import co.com.siigo.prueba.interactions.ui.generalInteractions.MoveOnElement;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ReqresUser {

    private ReqresUser() {

    }

    //region Interacciones Generales
    public static Interaction clickOnElement(Target target) {
        return instrumented(ClickOnElement.class, target);
    }

    public static Interaction moveOnElement(Target target) {
        return instrumented(MoveOnElement.class, target);
    }
    //endregion

}
