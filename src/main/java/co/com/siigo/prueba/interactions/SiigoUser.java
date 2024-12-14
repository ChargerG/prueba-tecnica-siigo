package co.com.siigo.prueba.interactions;

import co.com.siigo.prueba.interactions.generalInteractions.ClickOnElement;
import co.com.siigo.prueba.interactions.generalInteractions.MoveOnElement;
import co.com.siigo.prueba.interactions.home.ClickOnClients;
import co.com.siigo.prueba.interactions.home.ClickOnCreateButton;
import co.com.siigo.prueba.interactions.login.ClickOnLoginButton;
import co.com.siigo.prueba.interactions.login.EnterEmail;
import co.com.siigo.prueba.interactions.login.EnterPassword;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SiigoUser {

    private SiigoUser() {

    }

    //region Interacciones Generales
    public static Interaction clickOnElement(Target target) {
        return instrumented(ClickOnElement.class, target);
    }

    public static Interaction moveOnElement(Target target) {
        return instrumented(MoveOnElement.class, target);
    }
    //endregion

    //region Interacciones para el Login
    public static Interaction enterEmail(String email) {
        return instrumented(EnterEmail.class, email);
    }

    public static Interaction enterPassword(String password) {
        return instrumented(EnterPassword.class, password);
    }

    public static Interaction clickOnLoginButton() {
        return instrumented(ClickOnLoginButton.class);
    }
    //endregion

    //region Interacciones para el Home
    public static Interaction clickOnCreateButton() {
        return instrumented(ClickOnCreateButton.class);
    }

    public static Interaction clickOnClients() {
        return instrumented(ClickOnClients.class);
    }
    //endregion
}
