package co.com.siigo.prueba.tasks.ui.siigo;

import co.com.siigo.prueba.interactions.ui.siigo.SiigoUser;
import co.com.siigo.prueba.userInterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Visibility;
import net.thucydides.model.domain.TestFailureException;

import java.time.Duration;

public class CreateNew implements Task {

    public static CreateNew client() {
        return new CreateNew();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that("El boton de crear es visible",
                                Visibility.of(HomePage.CREATE_OPTION.waitingForNoMoreThan(Duration.ofSeconds(30))))
                        .isTrue()
                        .orElseThrow(new TestFailureException("El boton de crear no esta visible")),
                SiigoUser.clickOnCreateButton(),
                SiigoUser.clickOnClients(),
                Ensure.that("El formulario de datos basicos es visible",
                                Visibility.of(HomePage.BASIC_DATA_FORM.waitingForNoMoreThan(Duration.ofSeconds(30))))
                        .isTrue()
                        .orElseThrow(new TestFailureException("El formulario de datos basicos no esta visible"))
        );
    }
}
