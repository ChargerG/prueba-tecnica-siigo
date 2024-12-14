package co.com.siigo.prueba.stepDefinitions;

import co.com.siigo.prueba.tasks.CreateNew;
import co.com.siigo.prueba.tasks.Login;
import co.com.siigo.prueba.utils.KeyToRemember;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinitionCreateClients {
    @Dado("que {actor} ha iniciado sesion")
    public void queCamiloHaIniciadoSesion(Actor actor) {
        Login.siigo(
                actor.recall(KeyToRemember.EMAIL.name()),
                actor.recall(KeyToRemember.PASSWORD.name())
        ).performAs(actor);
    }

    @Cuando("accede a la opcion de crear clientes")
    public void accedeALaOpcionDeCrearClientes() {
        CreateNew.client().performAs(theActorInTheSpotlight());
    }

    @Y("diligencia los formularios")
    public void diligenciaLosFormularios() {

    }

    @Entonces("crea un cliente exitosamente")
    public void creaUnClienteExitosamente() {

    }
}
