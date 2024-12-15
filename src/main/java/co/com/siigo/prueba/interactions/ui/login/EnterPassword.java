package co.com.siigo.prueba.interactions.ui.login;

import co.com.siigo.prueba.userInterfaces.LoginPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.Duration;

public class EnterPassword implements Interaction {
    private final String password;

    public EnterPassword(String password) {
        this.password = password;
    }

    @Step("{0} ingresa el password: #password")
    @Override
    public <T extends Actor> void performAs(T actor) {
        Enter.keyValues(password).into(LoginPage.PASSWORD.waitingForNoMoreThan(Duration.ofSeconds(30))).performAs(actor);
    }
}
