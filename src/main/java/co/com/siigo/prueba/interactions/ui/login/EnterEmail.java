package co.com.siigo.prueba.interactions.ui.login;

import co.com.siigo.prueba.userInterfaces.LoginPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.Duration;

public class EnterEmail implements Interaction {
    private final String email;

    public EnterEmail(String email) {
        this.email = email;
    }

    @Step("{0} ingresa el email: #email")
    @Override
    public <T extends Actor> void performAs(T actor) {
        Enter.keyValues(email).into(LoginPage.EMAIL.waitingForNoMoreThan(Duration.ofSeconds(30))).performAs(actor);
    }
}
